package com.accenture.ptecnica.aplicacion.comando;

import com.accenture.ptecnica.dominio.modelo.Cliente;
import com.accenture.ptecnica.dominio.modelo.Producto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ComandoPedido {

    private Long id;
    private Date fechaPedido;
    private double totalPedido;
    private boolean estado;
    private Cliente cliente;
    private Producto productos;
}
