package com.accenture.ptecnica.infraestructura.convertidor;

import com.accenture.ptecnica.dominio.modelo.Producto;
import com.accenture.ptecnica.infraestructura.entidad.EntidadProducto;
import org.springframework.stereotype.Component;

@Component
public class ConvertidorProducto {

    public static EntidadProducto convertirModeloAEntidad(Producto producto){
        return new EntidadProducto(producto.getId(), producto.getNombre(), producto.getPrecio());
    }
}
