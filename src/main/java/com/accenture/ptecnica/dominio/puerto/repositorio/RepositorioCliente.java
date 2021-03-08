package com.accenture.ptecnica.dominio.puerto.repositorio;

import com.accenture.ptecnica.dominio.modelo.Cliente;

public interface RepositorioCliente {

    void guardarCliente(Cliente cliente);

    boolean clienteExiste(Cliente cliente);
}
