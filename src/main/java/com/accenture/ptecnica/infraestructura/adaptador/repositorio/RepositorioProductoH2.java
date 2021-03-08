package com.accenture.ptecnica.infraestructura.adaptador.repositorio;

import com.accenture.ptecnica.dominio.modelo.Producto;
import com.accenture.ptecnica.dominio.puerto.repositorio.RepositorioProducto;
import com.accenture.ptecnica.infraestructura.convertidor.ConvertidorProducto;
import com.accenture.ptecnica.infraestructura.entidad.EntidadProducto;
import com.accenture.ptecnica.infraestructura.jpa.RepositorioProductoJpa;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioProductoH2 implements RepositorioProducto {

    private final RepositorioProductoJpa repositorioProductoJpa;

    public RepositorioProductoH2(RepositorioProductoJpa repositorioProductoJpa) {
        this.repositorioProductoJpa = repositorioProductoJpa;
    }

    @Override
    public void guardarProducto(Producto producto) {
        EntidadProducto entidadProducto = ConvertidorProducto.convertirModeloAEntidad(producto);
        entidadProducto.setId(entidadProducto.getId());
        entidadProducto.setNombre(entidadProducto.getNombre());
        entidadProducto.setPrecio(entidadProducto.getPrecio());
        this.repositorioProductoJpa.save(entidadProducto);
    }
}
