package com.accenture.ptecnica.dominio.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pedido {

    private static final double IVA = 0.19;
    private static final int DOMICILO = 9500;
    private static final double MULTA_POR_CANCELACION = 0.1;
    private static final int HORAS_PERMITIDAS_CANCELACION = 12;
    private static final int HORAS_EDITAR_PEDIDO = 5;
    private static final int CERO_INICIALIZADOR = 0;

    private Long id;
    private Date fechaPedido;
    private double totalPedido;
    private boolean estado;
    private Cliente cliente;
    private Producto productos;

    public Pedido(Long id, Date fechaPedido, double totalPedido, boolean estado, Cliente cliente, Producto productos) {
        this.id = id;
        this.fechaPedido = fechaPedido;
        this.totalPedido = totalPedido;
        this.estado = estado;
        this.cliente = cliente;
        this.productos = productos;
    }

    public Long getId() {
        return id;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public double getTotalPedido() {
        return totalPedido;
    }

    public boolean isEstado() {
        return estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto getProductos() {
        return productos;
    }


    public double calcularPrecioConIvaYDomicilio(){
        while (this.totalPedido >= 70000){
            if (this.totalPedido > 100000){
                this.totalPedido = this.totalPedido * IVA;
            }else {
                this.totalPedido = this.totalPedido * IVA + DOMICILO;
            }
        }

        return this.totalPedido;
    }

    public double restarDomicilioAPedidoEditado(){
        return this.totalPedido -= DOMICILO;
    }

    public void validarPosibilidadCancelacionPedido(Pedido pedido) throws ParseException {

        int horas = calcularHorasDiferencia();

        if (horas > HORAS_PERMITIDAS_CANCELACION){
            this.totalPedido = this.totalPedido * MULTA_POR_CANCELACION;
        }else {
            this.estado = false;
        }

    }

    public void validarPosibilidadEdicionPedido(Pedido pedido) throws ParseException {

        int horas = calcularHorasDiferencia();

    }

    public int calcularHorasDiferencia() throws ParseException {
        SimpleDateFormat formatoHora = new SimpleDateFormat("yyyy-MM-dd H:m:s");
        Date fechaActual = new Date();

        Date fechaPedidoHoras = formatoHora.parse(fechaPedido.toString());
        Date fechaActualHoras = formatoHora.parse(fechaActual.toString());

        int diferencia = (int) ((fechaActualHoras.getTime()-fechaPedidoHoras.getTime())/1000);

        int dias = CERO_INICIALIZADOR;
        int horas = CERO_INICIALIZADOR;
        int minutos = CERO_INICIALIZADOR;

        if (diferencia > 86400){
            dias = (int)Math.floor(diferencia/86400);
            diferencia = diferencia - (dias * 86400);
        }
        if (diferencia > 3600){
            horas = (int)Math.floor(diferencia/3600);
            diferencia = diferencia - (horas * 3600);
        }
        if(diferencia > 60){
            minutos = (int)Math.floor(diferencia/60);
            diferencia = diferencia - (minutos * 60);
        }

        return horas;
    }
}
