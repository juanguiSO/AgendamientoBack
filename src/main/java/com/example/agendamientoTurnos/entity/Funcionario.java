package com.example.agendamientoTurnos.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "funcionario")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFuncionario;

    @Column(name = "nombre", length = 45)
    private String nombre;

    @Column(name = "apellido", length = 45)
    private String apellido;

    @Column(name = "telefono", length = 45)
    private String telefono;

    @Column(name = "correo", length = 45)
    private String correo;

    @Column(name = "cedula", length = 45)
    private String cedula;

    @ManyToOne
    @JoinColumn(name = "id_grado")
    private Grado grado;

    @ManyToOne
    @JoinColumn(name = "id_especialidad")
    private Especialidad especialidad;

   // @OneToMany(mappedBy = "funcionario")
  //  private List<Mision> misiones;


}

