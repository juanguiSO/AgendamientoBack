package com.example.agendamientoTurnos.controller;

import com.example.agendamientoTurnos.entity.Municipio;
import com.example.agendamientoTurnos.entity.Vehiculo;
import com.example.agendamientoTurnos.serviceUsuario.MunicipioService;
import com.example.agendamientoTurnos.serviceUsuario.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;



    @GetMapping
    public List<Vehiculo> getAll(){
        return vehiculoService.getVehiculos();
    }


    @PostMapping
    public Vehiculo saveUpadate(@RequestBody Vehiculo vehiculo){
        vehiculoService.saveOrUpdate(vehiculo);
        return vehiculo;
    }

    @DeleteMapping("/{idVehiculo}")
    public void saveUpadate(@PathVariable ("idVehiculo") Long  idVehiculo){
        vehiculoService.delete(idVehiculo);
    }
    @GetMapping("/{idMunicipio}")
    public Optional<Vehiculo> getBId(@PathVariable("idVehiculo") Long idVehiculo){
        return vehiculoService.getVehiculo(idVehiculo);
    }
}
