package com.example.agendamientoTurnos.serviceUsuario;


import com.example.agendamientoTurnos.entity.Usuario;
import com.example.agendamientoTurnos.entity.Viaje;
import com.example.agendamientoTurnos.repository.ViajeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ViajeService {
    @Autowired
    ViajeRespository viajeRespository;
    public List<Viaje> getViajes(){
        return viajeRespository.findAll();

    }
    public Optional<Viaje> getViaje(Long id){
        return viajeRespository.findById(id);

    }
    public void saveOrUpdate(Viaje viaje){
        viajeRespository.save(viaje);
    }
    public void delete(Long id){
        viajeRespository.deleteById(id);
    }

}


