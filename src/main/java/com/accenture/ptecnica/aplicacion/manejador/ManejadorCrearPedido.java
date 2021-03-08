package com.accenture.ptecnica.aplicacion.manejador;

import com.accenture.ptecnica.aplicacion.comando.ComandoPedido;
import com.accenture.ptecnica.aplicacion.fabrica.FabricaPedido;
import com.accenture.ptecnica.dominio.modelo.Pedido;
import com.accenture.ptecnica.dominio.servicio.ServicioCrearPedido;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearPedido {

    private final FabricaPedido fabricaPedido;
    private final ServicioCrearPedido servicioCrearPedido;

    public ManejadorCrearPedido(FabricaPedido fabricaPedido, ServicioCrearPedido servicioCrearPedido) {
        this.fabricaPedido = fabricaPedido;
        this.servicioCrearPedido = servicioCrearPedido;
    }

    public void ejecutar(ComandoPedido comandoPedido){
        Pedido pedido = fabricaPedido.crear(comandoPedido);
        servicioCrearPedido.ejecutar(pedido);
    }
}
