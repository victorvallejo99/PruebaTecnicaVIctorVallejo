package com.accenture.ptecnica.infraestructura.convertidor;

import com.accenture.ptecnica.dominio.modelo.Cliente;
import com.accenture.ptecnica.infraestructura.entidad.EntidadCliente;
import org.springframework.stereotype.Component;

@Component
public class ConvertidorCliente {

    public static EntidadCliente convertirModeloAEntidad(Cliente cliente){
        return new EntidadCliente(cliente.getId(), cliente.getNumeroDocumento(), cliente.getPrimerNombre(),
                cliente.getSegundoNombre(), cliente.getPrimerApellido(), cliente.getSegundoApellido(),
                cliente.getTelefono(), cliente.getDireccion());
    }
}
