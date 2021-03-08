package com.accenture.ptecnica.dominio.puerto.dao;

import com.accenture.ptecnica.dominio.dto.PedidoDto;

import java.util.List;

public interface DaoPedido {

    List<PedidoDto> listar();
}
