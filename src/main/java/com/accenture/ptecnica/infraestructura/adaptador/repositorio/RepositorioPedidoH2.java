package com.accenture.ptecnica.infraestructura.adaptador.repositorio;

import com.accenture.ptecnica.dominio.modelo.Pedido;
import com.accenture.ptecnica.dominio.puerto.repositorio.RepositorioPedido;
import com.accenture.ptecnica.infraestructura.convertidor.ConvertidorPedido;
import com.accenture.ptecnica.infraestructura.entidad.EntidadPedido;
import com.accenture.ptecnica.infraestructura.jpa.RepositorioPedidoJpa;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class RepositorioPedidoH2 implements RepositorioPedido {

    private final RepositorioPedidoJpa repositorioPedidoJpa;

    public RepositorioPedidoH2(RepositorioPedidoJpa repositorioPedidoJpa) {
        this.repositorioPedidoJpa = repositorioPedidoJpa;
    }

    @Override
    public void guardarPedido(Pedido pedido) {

        EntidadPedido entidadPedido = ConvertidorPedido.convertirModeloAEntidad(pedido);
        entidadPedido.setId(entidadPedido.getId());
        entidadPedido.setFechaPedido(new Date());
        entidadPedido.setTotalPedido(entidadPedido.getTotalPedido());
        entidadPedido.setEstado(entidadPedido.isEstado());
        entidadPedido.setCliente(entidadPedido.getCliente());
        entidadPedido.setProductos(entidadPedido.getProductos());
        this.repositorioPedidoJpa.save(entidadPedido);
    }
}
