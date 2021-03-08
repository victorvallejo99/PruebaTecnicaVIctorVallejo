package com.accenture.ptecnica.dominio.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductoDto {

    private Long id;
    private String nombre;
    private float precio;

}
