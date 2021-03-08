package com.accenture.ptecnica.aplicacion.fabrica;

import com.accenture.ptecnica.aplicacion.comando.ComandoPedido;
import com.accenture.ptecnica.dominio.modelo.Pedido;
import org.springframework.stereotype.Component;

@Component
public class FabricaPedido {

    public Pedido crear(ComandoPedido comandoPedido){
        return  new Pedido(comandoPedido.getId(), comandoPedido.getFechaPedido(), comandoPedido.getTotalPedido(), comandoPedido.isEstado(),
                comandoPedido.getCliente(), comandoPedido.getProductos());
    }
}
