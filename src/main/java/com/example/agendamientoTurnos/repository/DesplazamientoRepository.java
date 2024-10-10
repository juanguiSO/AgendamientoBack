package com.example.agendamientoTurnos.repository;

import com.example.agendamientoTurnos.entity.TipoDesplazamiento;
import com.example.agendamientoTurnos.entity.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DesplazamientoRepository extends JpaRepository<TipoDesplazamiento, Long> {
}
