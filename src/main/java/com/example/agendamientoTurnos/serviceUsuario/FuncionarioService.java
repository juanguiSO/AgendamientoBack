package com.example.agendamientoTurnos.serviceUsuario;

import com.example.agendamientoTurnos.entity.Funcionario;
import com.example.agendamientoTurnos.entity.Grado;
import com.example.agendamientoTurnos.repository.FuncionarioRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {
    @Autowired
    FuncionarioRespository funcionarioRespository;
    public List<Funcionario> getFuncionarios(){
        return funcionarioRespository.findAll();

    }
    public Optional<Funcionario> getFuncionario(Long id){
        return funcionarioRespository.findById(id);

    }

    public void saveOrUpdate(Funcionario funcionario){
        funcionarioRespository.save(funcionario);
    }
    public void delete(Long id){
        funcionarioRespository.deleteById(id);
    }
}
