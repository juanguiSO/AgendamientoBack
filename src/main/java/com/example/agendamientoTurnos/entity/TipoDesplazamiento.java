package com.example.agendamientoTurnos.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tipo_desplazamiento")
public class TipoDesplazamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDesplazamiento;

    @Column(name = "descripcion", length = 45)
    private String descripcion;



}