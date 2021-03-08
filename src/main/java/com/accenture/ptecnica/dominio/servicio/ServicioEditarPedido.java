package com.accenture.ptecnica.dominio.servicio;

import com.accenture.ptecnica.dominio.modelo.Pedido;
import com.accenture.ptecnica.dominio.puerto.repositorio.RepositorioPedido;
import org.springframework.stereotype.Service;

import java.text.ParseException;

@Service
public class ServicioEditarPedido {

    private final RepositorioPedido repositorioPedido;

    public ServicioEditarPedido(RepositorioPedido repositorioPedido) {
        this.repositorioPedido = repositorioPedido;
    }

    public void actualizarEstadoPedido(Pedido pedido) throws ParseException {
        pedido.validarPosibilidadCancelacionPedido(pedido);
        this.repositorioPedido.guardarPedido(pedido);
    }

    public void actualizarPedido(Pedido pedido) throws ParseException {
        pedido.validarPosibilidadEdicionPedido(pedido);
        this.repositorioPedido.guardarPedido(pedido);
    }
}
