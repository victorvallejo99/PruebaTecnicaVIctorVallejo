package com.accenture.ptecnica.infraestructura.jpa;

import com.accenture.ptecnica.infraestructura.entidad.EntidadProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface RepositorioProductoJpa extends JpaRepository<EntidadProducto, Serializable> {
}
