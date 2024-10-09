package com.example.agendamientoTurnos.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.val;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@Entity
@Table(name="viaje")
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_viaje;
    @NotNull
    private long id_vehiculo;
    @NotNull
    private long id_usuario_crea;
    @NotNull
    private long id_municipio;
    @NotNull
    private long id_desplazamiento;
    private val tiempo_inicio;
    private val  tiempo_fin;
    private String estado;
}
