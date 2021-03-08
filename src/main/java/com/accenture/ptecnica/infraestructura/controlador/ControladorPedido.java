package com.accenture.ptecnica.infraestructura.controlador;

import com.accenture.ptecnica.aplicacion.comando.ComandoPedido;
import com.accenture.ptecnica.aplicacion.manejador.ManejadorCrearPedido;
import com.accenture.ptecnica.aplicacion.manejador.ManejadorEditarPedido;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
@RequestMapping(value = "/pedido")
public class ControladorPedido {

    private final ManejadorCrearPedido manejadorCrearPedido;
    private final ManejadorEditarPedido manejadorEditarPedido;

    public ControladorPedido(ManejadorCrearPedido manejadorCrearPedido, ManejadorEditarPedido manejadorEditarPedido) {
        this.manejadorCrearPedido = manejadorCrearPedido;
        this.manejadorEditarPedido = manejadorEditarPedido;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void guardarCLiente(@RequestBody ComandoPedido comandoPedido){
        this.manejadorCrearPedido.ejecutar(comandoPedido);
    }

    @PutMapping(value = "/{id}/editarPedio", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void editarEstadoPedido(@PathVariable Long id, @RequestBody ComandoPedido comandoPedido) throws ParseException {
        this.manejadorEditarPedido.ejecutarCancelacion(comandoPedido, id);
    }

    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void editarPedido(@PathVariable Long id, @RequestBody ComandoPedido comandoPedido) throws ParseException {
        this.manejadorEditarPedido.ejecutarActualizacionPedido(comandoPedido, id);
    }
}
