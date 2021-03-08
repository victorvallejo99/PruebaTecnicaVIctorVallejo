package com.accenture.ptecnica.infraestructura.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cliente")
public class EntidadCliente {

    @Id
    @Column(name = "id_cliente")
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String numeroDocumento;

    @Column(nullable = false)
    private String primerNombre;

    @Column
    private String segundoNombre;

    @Column(nullable = false)
    private String primerApellido;

    @Column
    private String segundoApellido;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private String direccion;


}
