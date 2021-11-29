/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zorrilloLTDA.repositorio;

import zorrilloLTDA.interfaces.InterfaceFragance;
import zorrilloLTDA.modelo.Fragance;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Patricia Munevar
 */
@Repository
public class FraganceRepositorio {
    @Autowired
    private InterfaceFragance repository;

    public List<Fragance> getAll() {
        return repository.findAll();
    }

    public Optional<Fragance> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Fragance create(Fragance clothe) {
        return repository.save(clothe);
    }

    public void update(Fragance clothe) {
        repository.save(clothe);
    }
    
    public void delete(Fragance clothe) {
        repository.delete(clothe);
    }
}
