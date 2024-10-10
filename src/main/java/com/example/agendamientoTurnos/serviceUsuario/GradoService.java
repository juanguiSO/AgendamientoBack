package com.example.agendamientoTurnos.serviceUsuario;

import com.example.agendamientoTurnos.entity.Grado;
import com.example.agendamientoTurnos.repository.GradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GradoService {
    @Autowired
    GradoRepository gradoRepository;

    public List<Grado> getGrados(){
        return gradoRepository.findAll();

    }
    public Optional<Grado> getGrado(Long id){
        return gradoRepository.findById(id);

    }

    public void saveOrUpdate(Grado grado){
        gradoRepository.save(grado);
    }
    public void delete(Long id){
        gradoRepository.deleteById(id);
    }
}
