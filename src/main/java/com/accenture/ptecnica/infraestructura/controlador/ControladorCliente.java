package com.accenture.ptecnica.infraestructura.controlador;

import com.accenture.ptecnica.aplicacion.comando.ComandoCliente;
import com.accenture.ptecnica.aplicacion.manejador.ManejadorCrearCliente;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cliente")
public class ControladorCliente {

    private final ManejadorCrearCliente manejadorCrearCliente;

    public ControladorCliente(ManejadorCrearCliente manejadorCrearCliente) {
        this.manejadorCrearCliente = manejadorCrearCliente;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void guardarCliente(@RequestBody ComandoCliente comandoCliente){
        this.manejadorCrearCliente.ejecutar(comandoCliente);
    }
}
