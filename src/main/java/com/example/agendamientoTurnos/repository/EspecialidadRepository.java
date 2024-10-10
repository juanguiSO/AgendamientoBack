package com.example.agendamientoTurnos.repository;

import com.example.agendamientoTurnos.entity.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EspecialidadRepository extends JpaRepository<Especialidad, Long> {
}
