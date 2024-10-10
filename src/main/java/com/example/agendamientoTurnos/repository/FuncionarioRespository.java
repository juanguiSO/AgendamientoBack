package com.example.agendamientoTurnos.repository;

import com.example.agendamientoTurnos.entity.Funcionario;
import com.example.agendamientoTurnos.entity.TipoDesplazamiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRespository extends JpaRepository<Funcionario, Long> {
}
