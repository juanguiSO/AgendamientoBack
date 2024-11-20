package com.example.agendamientoTurnos.controller;
import com.example.agendamientoTurnos.entity.TipoDesplazamiento;
import com.example.agendamientoTurnos.serviceUsuario.TipoDesplazamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping(path="api/v1/desplazamientos")
public class TipoDesplazamientoController {

    @Autowired
    private TipoDesplazamientoService tipoDesplazamientoService;



    @GetMapping
    public List<TipoDesplazamiento> getAll(){
        return tipoDesplazamientoService.getTiposDesplazamientos();
    }


    @PostMapping
    public TipoDesplazamiento saveUpadate(@RequestBody TipoDesplazamiento tipoDesplazamiento){
        tipoDesplazamientoService.saveOrUpdate(tipoDesplazamiento);
        return tipoDesplazamiento;
    }

    @DeleteMapping("/{idDesplazamiento}")
    public void saveUpadate(@PathVariable ("idDesplazamiento") Long  idDesplazamiento){
        tipoDesplazamientoService.delete(idDesplazamiento);
    }
    @GetMapping("/{idDesplazamiento}")
    public Optional<TipoDesplazamiento> getBId(@PathVariable("idDesplazamiento") Long idDesplazamiento){
        return tipoDesplazamientoService.getTipoDesplazamiento(idDesplazamiento);
    }
}
