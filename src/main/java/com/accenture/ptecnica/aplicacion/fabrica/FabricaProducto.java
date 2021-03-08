package com.accenture.ptecnica.aplicacion.fabrica;

import com.accenture.ptecnica.aplicacion.comando.ComandoProducto;
import com.accenture.ptecnica.dominio.modelo.Producto;
import org.springframework.stereotype.Component;

@Component
public class FabricaProducto {

    public Producto crear(ComandoProducto comandoProducto){
        return new Producto(comandoProducto.getId(), comandoProducto.getNombre(), comandoProducto.getPrecio());
    }
}
