package com.example.agendamientoTurnos.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class FuncionarioRespuesta {
    private String nombre;
    private String Apellido;
    private int id_grado;
    private int id_especialidad;

    public FuncionarioRespuesta(String nombre, String apellido, int id_grado, int id_especialidad) {
        this.nombre = nombre;
        Apellido = apellido;
        this.id_grado = id_grado;
        this.id_especialidad = id_especialidad;
    }
}
