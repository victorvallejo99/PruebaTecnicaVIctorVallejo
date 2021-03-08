package com.accenture.ptecnica.aplicacion.manejador;

import com.accenture.ptecnica.aplicacion.comando.ComandoCliente;
import com.accenture.ptecnica.aplicacion.fabrica.FabricaCliente;
import com.accenture.ptecnica.dominio.modelo.Cliente;
import com.accenture.ptecnica.dominio.servicio.ServicioCrearCliente;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearCliente {

    private final FabricaCliente fabricaCliente;
    private final ServicioCrearCliente servicioCrearCliente;

    public ManejadorCrearCliente(FabricaCliente fabricaCliente, ServicioCrearCliente servicioCrearCliente) {
        this.fabricaCliente = fabricaCliente;
        this.servicioCrearCliente = servicioCrearCliente;
    }

    public void ejecutar(ComandoCliente comandoCliente){
        Cliente cliente = fabricaCliente.crear(comandoCliente);
        servicioCrearCliente.ejecutar(cliente);
    }
}
