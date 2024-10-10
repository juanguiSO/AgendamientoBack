package com.example.agendamientoTurnos.serviceUsuario;

import com.example.agendamientoTurnos.entity.TipoDesplazamiento;
import com.example.agendamientoTurnos.entity.Vehiculo;
import com.example.agendamientoTurnos.repository.DesplazamientoRepository;
import com.example.agendamientoTurnos.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDesplazamientoService {
    @Autowired
    DesplazamientoRepository desplazamientoRepository;

    public List<TipoDesplazamiento> getTiposDesplazamientos(){
        return desplazamientoRepository.findAll();

    }
    public Optional<TipoDesplazamiento> getTipoDesplazamiento(Long id){
        return desplazamientoRepository.findById(id);

    }

    public void saveOrUpdate(TipoDesplazamiento tipoDesplazamiento){
        desplazamientoRepository.save(tipoDesplazamiento);
    }
    public void delete(Long id){
        desplazamientoRepository.deleteById(id);
    }
}
