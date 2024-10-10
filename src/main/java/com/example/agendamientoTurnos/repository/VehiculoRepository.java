package com.example.agendamientoTurnos.repository;

import com.example.agendamientoTurnos.entity.Vehiculo;
import com.example.agendamientoTurnos.entity.Viaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
}
