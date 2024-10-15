package com.example.agendamientoTurnos.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "municipio")
public class Municipio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMunicipio;

    @Column(name = "municipio", length = 45)
    private String nombreMunicipio;

 //   @OneToMany(mappedBy = "municipio")
  //  private List<Viaje> viajes;

    // Getters y Setters
}

