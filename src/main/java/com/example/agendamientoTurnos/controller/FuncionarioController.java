package com.example.agendamientoTurnos.controller;

import com.example.agendamientoTurnos.entity.Especialidad;
import com.example.agendamientoTurnos.entity.Funcionario;
import com.example.agendamientoTurnos.serviceUsuario.EspecialidadService;
import com.example.agendamientoTurnos.serviceUsuario.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;



    @GetMapping
    public List<Funcionario> getAll(){
        return funcionarioService.getFuncionarios();
    }


    @PostMapping
    public Funcionario saveUpadate(@RequestBody Funcionario funcionario){
        funcionarioService.saveOrUpdate(funcionario);
        return funcionario;
    }

    @DeleteMapping("/{idFuncionario}")
    public void saveUpadate(@PathVariable ("idFuncionario") Long  idFuncionario){
        funcionarioService.delete(idFuncionario);
    }
    @GetMapping("/{idFuncionario}")
    public Optional<Funcionario> getBId(@PathVariable("idFuncionario") Long idEspecialidad){
        return funcionarioService.getFuncionario(idEspecialidad);
    }
}
