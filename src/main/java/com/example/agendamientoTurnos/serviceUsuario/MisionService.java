package com.example.agendamientoTurnos.serviceUsuario;

import com.example.agendamientoTurnos.entity.Mision;
import com.example.agendamientoTurnos.entity.Municipio;
import com.example.agendamientoTurnos.repository.MisionRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MisionService {
    @Autowired
    MisionRespository misionRespository;

    public List<Mision> getMisiones(){
        return misionRespository.findAll();

    }
    public Optional<Mision> getMision(Long id){
        return misionRespository.findById(id);

    }

    public void saveOrUpdate(Mision mision){
        misionRespository.save(mision);
    }
    public void delete(Long id){
        misionRespository.deleteById(id);
    }
}
