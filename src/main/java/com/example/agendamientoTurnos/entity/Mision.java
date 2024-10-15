package com.example.agendamientoTurnos.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "mision")
public class Mision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numeroMision;

    @Column(name = "nombre_mision", length = 45)
    private String nombreMision;

    @Column(name = "ubicacion_mision", length = 45)
    private String ubicacionMision;

    @ManyToOne
    @JoinColumn(name = "id_funcionario")
    private Funcionario funcionario;

    //@ManyToMany(mappedBy = "misiones")
  //  private List<Viaje> viajes;

    // Getters y Setters
}
