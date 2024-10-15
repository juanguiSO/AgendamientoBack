package com.example.agendamientoTurnos.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspecialidad;

    @Column(name = "especialidad", length = 45)
    private String especialidad;

 //   @OneToMany(mappedBy = "especialidad")
   // private List<Funcionario> funcionarios;

    // Getters y Setters
}
