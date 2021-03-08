package com.accenture.ptecnica.infraestructura.jpa;

import com.accenture.ptecnica.infraestructura.entidad.EntidadPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface RepositorioPedidoJpa extends JpaRepository<EntidadPedido, Serializable> {
}
