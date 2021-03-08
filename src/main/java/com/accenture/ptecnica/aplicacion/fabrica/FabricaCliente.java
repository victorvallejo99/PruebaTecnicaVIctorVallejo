package com.accenture.ptecnica.aplicacion.fabrica;

import com.accenture.ptecnica.aplicacion.comando.ComandoCliente;
import com.accenture.ptecnica.dominio.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class FabricaCliente {

    public Cliente crear(ComandoCliente comandoCliente){
        return new Cliente(comandoCliente.getId(), comandoCliente.getNumeroDocumento(), comandoCliente.getPrimerNombre(),
                comandoCliente.getSegundoNombre(), comandoCliente.getPrimerApellido(), comandoCliente.getSegundoApellido(),
                comandoCliente.getTelefono(), comandoCliente.getDireccion());
    }
}
