package com.accenture.ptecnica.dominio.servicio;

import com.accenture.ptecnica.dominio.modelo.Pedido;
import com.accenture.ptecnica.dominio.puerto.repositorio.RepositorioPedido;
import org.springframework.stereotype.Service;

@Service
public class ServicioCrearPedido {

    private RepositorioPedido repositorioPedido;

    public ServicioCrearPedido(RepositorioPedido repositorioPedido) {
        this.repositorioPedido = repositorioPedido;
    }

    public void ejecutar(Pedido pedido){
        pedido.calcularPrecioConIvaYDomicilio();
        this.repositorioPedido.guardarPedido(pedido);
    }
}
