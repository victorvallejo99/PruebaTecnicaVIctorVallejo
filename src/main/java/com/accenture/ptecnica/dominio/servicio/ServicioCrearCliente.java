package com.accenture.ptecnica.dominio.servicio;

import com.accenture.ptecnica.dominio.modelo.Cliente;
import com.accenture.ptecnica.dominio.puerto.repositorio.RepositorioCliente;
import org.springframework.stereotype.Service;

@Service
public class ServicioCrearCliente {

    private RepositorioCliente repositorioCliente;

    public ServicioCrearCliente(RepositorioCliente repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }

    public void ejecutar(Cliente cliente){

        this.repositorioCliente.guardarCliente(cliente);
    }
}
