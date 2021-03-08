package com.accenture.ptecnica.aplicacion.manejador;

import com.accenture.ptecnica.aplicacion.comando.ComandoProducto;
import com.accenture.ptecnica.aplicacion.fabrica.FabricaProducto;
import com.accenture.ptecnica.dominio.modelo.Producto;
import com.accenture.ptecnica.dominio.servicio.ServicioCrearProducto;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearProducto {

    private final FabricaProducto fabricaProducto;
    private final ServicioCrearProducto servicioCrearProducto;

    public ManejadorCrearProducto(FabricaProducto fabricaProducto, ServicioCrearProducto servicioCrearProducto) {
        this.fabricaProducto = fabricaProducto;
        this.servicioCrearProducto = servicioCrearProducto;
    }

    public void ejecutar(ComandoProducto comandoProducto){
        Producto producto = fabricaProducto.crear(comandoProducto);
        servicioCrearProducto.ejecutar(producto);
    }
}
