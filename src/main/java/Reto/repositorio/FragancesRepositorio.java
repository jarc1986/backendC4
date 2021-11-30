/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto.repositorio;

import Reto.modelo.Fragances;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Reto.interfaces.InterfaceFragances;

/**
 *
 * @author USUARIO
 */
@Repository
public class FragancesRepositorio {
    @Autowired
    private InterfaceFragances repository;

    public List<Fragances> getAll() {
        return repository.findAll();
    }

    public Optional<Fragances> getFragance(String reference) {
        return repository.findById(reference);
    }
    public Fragances create(Fragances fragance) {
        return repository.save(fragance);
    }

    public void update(Fragances fragance) {
        repository.save(fragance);
    }
    
    public void delete(Fragances fragance) {
        repository.delete(fragance);
    }
}
