package com.example.agendamientoTurnos.controller;

import com.example.agendamientoTurnos.entity.Mision;
import com.example.agendamientoTurnos.entity.Municipio;
import com.example.agendamientoTurnos.serviceUsuario.MisionService;
import com.example.agendamientoTurnos.serviceUsuario.MunicipioService;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping(path="api/v1/misiones")
public class MisionController {

    @Autowired
    private MisionService misionService;

    @Column(name = "nombre_usuario", length = 45)
    private String nombreUsuario;

    @Column(name = "delito", length = 45)
    private String delito;

    @Column(name = "nombre_defensor_publico", length = 45)
    private String nombreDefensorPublico;

    @Column(name = "actividades", length = 200)
    private String actividades;

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
