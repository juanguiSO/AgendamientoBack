package com.example.agendamientoTurnos.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "vehiculo")
public class Vehiculo {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idVehiculo;

        @Column(name = "placa", length = 45)
        private String placa;

        @Column(name = "modelo", length = 45)
        private String modelo;

        @Column(name = "marca", length = 45)
        private String marca;

        @Column(name = "estado", length = 45)
        private String estado;

        @Column(name = "numeroasiento")
        private int numeroAsiento;

        @OneToMany(mappedBy = "vehiculo")
        private List<Viaje> viajes;

        // Getters y Setters
}

