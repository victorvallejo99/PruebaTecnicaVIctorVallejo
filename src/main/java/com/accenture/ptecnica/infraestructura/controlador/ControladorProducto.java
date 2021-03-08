package com.accenture.ptecnica.infraestructura.controlador;

import com.accenture.ptecnica.aplicacion.comando.ComandoProducto;
import com.accenture.ptecnica.aplicacion.manejador.ManejadorCrearProducto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/producto")
public class ControladorProducto {

    private final ManejadorCrearProducto manejadorCrearProducto;

    public ControladorProducto(ManejadorCrearProducto manejadorCrearProducto) {
        this.manejadorCrearProducto = manejadorCrearProducto;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void guardarProducto(@RequestBody ComandoProducto comandoProducto){
        this.manejadorCrearProducto.ejecutar(comandoProducto);
    }
}
