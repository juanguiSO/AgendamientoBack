package com.example.agendamientoTurnos.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="viaje")
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idusuario;

    private String nombre_usuario;
    private String password;
}
