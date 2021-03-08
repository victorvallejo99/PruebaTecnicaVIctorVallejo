package com.accenture.ptecnica.dominio.dto;

import com.accenture.ptecnica.dominio.modelo.Cliente;
import com.accenture.ptecnica.dominio.modelo.Producto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class PedidoDto {

    private Long id;
    private Date fechaPedido;
    private double totalPedido;
    private boolean estado;
    private Cliente cliente;
    private Producto productos;
}
