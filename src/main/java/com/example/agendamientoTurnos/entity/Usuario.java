package com.example.agendamientoTurnos.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idusuario;

    @Column(name = "nombre_usuario", length = 45)
    private String nombreUsuario;

    @Column(name = "password", length = 45)
    private String password;

    @OneToMany(mappedBy = "usuarioCrea")
    private List<Viaje> viajesCreados;

    // Getters y Setters
}