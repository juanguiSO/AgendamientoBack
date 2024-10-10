package com.example.agendamientoTurnos.serviceUsuario;


import com.example.agendamientoTurnos.entity.Usuario;
import com.example.agendamientoTurnos.entity.Viaje;
import com.example.agendamientoTurnos.repository.ViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ViajeService {
    @Autowired
    ViajeRepository viajeRepository;

    public List<Viaje> getViajes(){
        return viajeRepository.findAll();

    }
    public Optional<Viaje> getViaje(Long id){
        return viajeRepository.findById(id);

    }

    public void saveOrUpdate(Viaje viaje){
        viajeRepository.save(viaje);
    }
    public void delete(Long id){
        viajeRepository.deleteById(id);
    }

}

