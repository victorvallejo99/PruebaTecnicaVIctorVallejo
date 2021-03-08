package com.accenture.ptecnica.infraestructura.convertidor;

import com.accenture.ptecnica.dominio.modelo.Pedido;
import com.accenture.ptecnica.infraestructura.entidad.EntidadCliente;
import com.accenture.ptecnica.infraestructura.entidad.EntidadPedido;
import com.accenture.ptecnica.infraestructura.entidad.EntidadProducto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ConvertidorPedido {

    public static EntidadPedido convertirModeloAEntidad(Pedido pedido){
        ModelMapper modelMapper = new ModelMapper();
        EntidadCliente entidadCliente = modelMapper.map(pedido, EntidadCliente.class);
        EntidadProducto entidadProducto = modelMapper.map(pedido, EntidadProducto.class);
        return new EntidadPedido(pedido.getId(), pedido.getFechaPedido(), pedido.getTotalPedido(), pedido.isEstado(),
                entidadCliente, entidadProducto);
    }

}
