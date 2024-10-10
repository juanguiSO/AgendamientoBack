package com.example.agendamientoTurnos.entity;

import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDateTime;
import java.util.List;
@Data
@Entity
@Table(name = "viaje")
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idViaje;

    @Column(name = "tiempo_inicio")
    private LocalDateTime tiempoInicio;

    @Column(name = "tiempo_fin")
    private LocalDateTime tiempoFin;

    @Column(name = "estado", length = 45)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_vehiculo")
    private Vehiculo vehiculo;

    @ManyToOne
    @JoinColumn(name = "id_usuario_crea")
    private Usuario usuarioCrea;

    @ManyToOne
    @JoinColumn(name = "id_desplazamiento")
    private TipoDesplazamiento tipoDesplazamiento;

    @ManyToOne
    @JoinColumn(name = "id_municipio")
    private Municipio municipio;

    @ManyToMany
    @JoinTable(
            name = "mision_x_viaje",
            joinColumns = @JoinColumn(name = "id_viaje"),
            inverseJoinColumns = @JoinColumn(name = "numero_mision")
    )
    private List<Mision> misiones;
}
