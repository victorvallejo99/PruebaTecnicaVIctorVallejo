package com.accenture.ptecnica.dominio.servicio;

import com.accenture.ptecnica.dominio.modelo.Producto;
import com.accenture.ptecnica.dominio.puerto.repositorio.RepositorioProducto;
import org.springframework.stereotype.Service;

@Service
public class ServicioCrearProducto {

    private RepositorioProducto repositorioProducto;

    public ServicioCrearProducto(RepositorioProducto repositorioProducto) {
        this.repositorioProducto = repositorioProducto;
    }

    public void ejecutar(Producto producto){
        this.repositorioProducto.guardarProducto(producto);
    }
}
