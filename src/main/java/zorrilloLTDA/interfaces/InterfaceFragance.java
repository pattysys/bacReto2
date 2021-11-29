/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zorrilloLTDA.interfaces;


import zorrilloLTDA.modelo.Fragance;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Patricia Munevar
 */
public interface InterfaceFragance extends MongoRepository<Fragance, String> {
    
}
