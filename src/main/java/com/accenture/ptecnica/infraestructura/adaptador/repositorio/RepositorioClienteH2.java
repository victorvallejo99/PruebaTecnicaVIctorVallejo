package com.accenture.ptecnica.infraestructura.adaptador.repositorio;

import com.accenture.ptecnica.dominio.modelo.Cliente;
import com.accenture.ptecnica.dominio.puerto.repositorio.RepositorioCliente;
import com.accenture.ptecnica.infraestructura.convertidor.ConvertidorCliente;
import com.accenture.ptecnica.infraestructura.entidad.EntidadCliente;
import com.accenture.ptecnica.infraestructura.jpa.RepositorioClienteJpa;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioClienteH2 implements RepositorioCliente {

    private final RepositorioClienteJpa repositorioClienteJpa;

    public RepositorioClienteH2(RepositorioClienteJpa repositorioClienteJpa) {
        this.repositorioClienteJpa = repositorioClienteJpa;
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        EntidadCliente entidadCliente = ConvertidorCliente.convertirModeloAEntidad(cliente);
        entidadCliente.setId(entidadCliente.getId());
        entidadCliente.setNumeroDocumento(entidadCliente.getNumeroDocumento());
        entidadCliente.setPrimerNombre(entidadCliente.getPrimerNombre());
        entidadCliente.setSegundoNombre(entidadCliente.getSegundoNombre());
        entidadCliente.setPrimerApellido(entidadCliente.getPrimerApellido());
        entidadCliente.setSegundoApellido(entidadCliente.getSegundoApellido());
        entidadCliente.setTelefono(entidadCliente.getTelefono());
        entidadCliente.setDireccion(entidadCliente.getDireccion());
        this.repositorioClienteJpa.save(entidadCliente);
    }

    @Override
    public boolean clienteExiste(Cliente cliente) {
        String numeroIdentificacion = cliente.getNumeroDocumento();
        return true;
    }
}
