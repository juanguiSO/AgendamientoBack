package com.example.agendamientoTurnos.serviceUsuario;

import com.example.agendamientoTurnos.entity.Especialidad;
import com.example.agendamientoTurnos.repository.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EspecialidadService {
    @Autowired
    EspecialidadRepository especialidadRepository;

    public List<Especialidad> getEspecialidades(){
        return especialidadRepository.findAll();

    }
    public Optional<Especialidad> getEspecialidad(Long id){
        return especialidadRepository.findById(id);

    }

    public void saveOrUpdate(Especialidad especialidad){
        especialidadRepository.save(especialidad);
    }
    public void delete(Long id){
        especialidadRepository.deleteById(id);
    }

}
