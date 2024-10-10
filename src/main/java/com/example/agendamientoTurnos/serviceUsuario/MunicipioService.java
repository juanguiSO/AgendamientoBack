package com.example.agendamientoTurnos.serviceUsuario;

import com.example.agendamientoTurnos.entity.Municipio;

import com.example.agendamientoTurnos.repository.MunicipioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MunicipioService {
    @Autowired
    MunicipioRepository municipioRepository;

    public List<Municipio> getMunicipios(){
        return municipioRepository.findAll();

    }
    public Optional<Municipio> getMunicipio(Long id){
        return municipioRepository.findById(id);

    }

    public void saveOrUpdate(Municipio municipio){
        municipioRepository.save(municipio);
    }
    public void delete(Long id){
        municipioRepository.deleteById(id);
    }
}
