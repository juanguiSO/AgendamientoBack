package com.example.agendamientoTurnos.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idusuario;

    private String nombre_usuario;
    private String password;
}
