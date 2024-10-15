package com.example.agendamientoTurnos.controller;

import com.example.agendamientoTurnos.entity.Mision;
import com.example.agendamientoTurnos.entity.Municipio;
import com.example.agendamientoTurnos.serviceUsuario.MisionService;
import com.example.agendamientoTurnos.serviceUsuario.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/misiones")
public class MisionController {

    @Autowired
    private MisionService misionService;



    @GetMapping
    public List<Mision> getAll(){
        return misionService.getMisiones();
    }


    @PostMapping
    public void  saveUpadate(@RequestBody Mision mision){
        misionService.saveOrUpdate(mision);
        //return mision;
    }

    @DeleteMapping("/{numeroMision}")
    public void saveUpadate(@PathVariable ("numeroMision") Long  numeroMision){
        misionService.delete(numeroMision);
    }
    @GetMapping("/{numeroMision}")
    public Optional<Mision> getBId(@PathVariable("numeroMision") Long numeroMision){
        return misionService.getMision(numeroMision);
    }

}
