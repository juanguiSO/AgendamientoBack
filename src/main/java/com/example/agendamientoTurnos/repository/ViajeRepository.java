package com.example.agendamientoTurnos.repository;

import com.example.agendamientoTurnos.entity.Usuario;
import com.example.agendamientoTurnos.entity.Viaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViajeRepository extends JpaRepository<Viaje, Long> {
}
