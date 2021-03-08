package com.accenture.ptecnica.aplicacion.manejador;

import com.accenture.ptecnica.aplicacion.comando.ComandoPedido;
import com.accenture.ptecnica.aplicacion.fabrica.FabricaPedido;
import com.accenture.ptecnica.dominio.modelo.Pedido;
import com.accenture.ptecnica.dominio.servicio.ServicioEditarPedido;
import org.springframework.stereotype.Component;

import java.text.ParseException;

@Component
public class ManejadorEditarPedido {

    private final FabricaPedido fabricaPedido;
    private final ServicioEditarPedido servicioEditarPedido;

    public ManejadorEditarPedido(FabricaPedido fabricaPedido, ServicioEditarPedido servicioEditarPedido) {
        this.fabricaPedido = fabricaPedido;
        this.servicioEditarPedido = servicioEditarPedido;
    }

    public void ejecutarCancelacion(ComandoPedido comandoPedido, Long id) throws ParseException {
        comandoPedido.setEstado(comandoPedido.isEstado());
        Pedido pedido = this.fabricaPedido.crear(comandoPedido);
        this.servicioEditarPedido.actualizarEstadoPedido(pedido);
    }

    public void ejecutarActualizacionPedido(ComandoPedido comandoPedido, Long id) throws ParseException {
        comandoPedido.setId(id);
        comandoPedido.setFechaPedido(comandoPedido.getFechaPedido());
        comandoPedido.setTotalPedido(comandoPedido.getTotalPedido());
        comandoPedido.setEstado(comandoPedido.isEstado());
        comandoPedido.setCliente(comandoPedido.getCliente());
        comandoPedido.setProductos(comandoPedido.getProductos());
        Pedido pedido = this.fabricaPedido.crear(comandoPedido);
        this.servicioEditarPedido.actualizarPedido(pedido);
    }
}
