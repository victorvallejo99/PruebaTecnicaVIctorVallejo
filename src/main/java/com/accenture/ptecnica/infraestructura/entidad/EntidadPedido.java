package com.accenture.ptecnica.infraestructura.entidad;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pedido")
public class EntidadPedido {

    @Id
    @Column(name = "id_pedido")
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy.MM.dd HH: mm: ss")
    private Date fechaPedido;

    @Column(nullable = false)
    private double totalPedido;

    @Column(nullable = false)
    private boolean estado;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private EntidadCliente cliente;

    @OneToOne
    @JoinColumn
    private EntidadProducto productos;

}
