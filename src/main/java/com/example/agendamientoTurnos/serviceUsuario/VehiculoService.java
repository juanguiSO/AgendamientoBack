package com.example.agendamientoTurnos.serviceUsuario;
import com.example.agendamientoTurnos.entity.Vehiculo;
import com.example.agendamientoTurnos.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class VehiculoService {
    @Autowired
    VehiculoRepository vehiculoRepository;

    public List<Vehiculo> getVehiculos(){
        return vehiculoRepository.findAll();

    }
    public Optional<Vehiculo> getVehiculo(Long id){
        return vehiculoRepository.findById(id);

    }

    public void saveOrUpdate(Vehiculo vehiculo){
        vehiculoRepository.save(vehiculo);
    }
    public void delete(Long id){
        vehiculoRepository.deleteById(id);
    }
}
