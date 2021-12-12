/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto.interfaces;

import Reto.modelo.Order;
import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author USER
 */
public interface InterfaceOrder extends MongoRepository<Order, Integer>{
    //Retorna las ordenes de pedido que coinciden con las zona recibida como parametro
    @Query("{'salesMan.zone': ?0}")
    List<Order> findByZone(final String country);
    
    //Retorna las ordenes por estado
    @Query("{'status': ?0}")
    List<Order> findByStatus(final String Status);
    
    //Para seleccionar la orden con el id maximo
    List<Order> findTopByOrderByIdDesc();
    
     //Para seleccionar la orden con el id maximo
    List<Order> findBySalesManZone( String zone);
    
    List<Order> findBySalesManId(Integer id);
    
    List<Order> findBySalesManIdAndStatus( Integer id, String status);
    
    List<Order> findByRegisterDayAndSalesManId(Date registerDay, Integer id);
     
}
