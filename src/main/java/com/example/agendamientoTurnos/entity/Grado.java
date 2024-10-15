package com.example.agendamientoTurnos.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "grado")
public class Grado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGrado;

    @Column(name = "grado", length = 45)
    private String grado;

    //@OneToMany(mappedBy = "grado")
    //private List<Funcionario> funcionarios;

    // Getters y Setters
}
