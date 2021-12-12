/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto.repositorio;

import Reto.interfaces.InterfaceOrder;
import Reto.modelo.Order;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */
@Repository
public class OrderRepositorio {
      @Autowired
    private InterfaceOrder orderCrudRepository;
     
       public List<Order> getAll() {
        return (List<Order>) orderCrudRepository.findAll();
    }

    public Optional<Order> getOrder(int id) {
        return orderCrudRepository.findById(id);
    }

    public Order create(Order order) {
        return orderCrudRepository.save(order);
    }
    
    public void update(Order order) {
        orderCrudRepository.save(order);
    }
    
    public void delete(Order order) {
        orderCrudRepository.delete(order);
    }
    
    public List<Order> lastOrderId(){
        return orderCrudRepository.findTopByOrderByIdDesc();
    }
    
     public List<Order> getZone(String zone){
        return orderCrudRepository.findBySalesManZone(zone);
    }
     
    public List<Order> getBySalesManId(Integer id){
        return orderCrudRepository.findBySalesManId(id);
    }
    
    public List<Order> getBySalesManIdAndStatus(Integer id, String status){
        return orderCrudRepository.findBySalesManIdAndStatus(id, status);
    }
    public List<Order> getByregisterDayAndSalesManId(String registerDay, Integer id){
        try{
        return orderCrudRepository.findByRegisterDayAndSalesManId(new SimpleDateFormat("yyyy-MM-dd").parse(registerDay) ,id);
        }catch(ParseException e){
            e.printStackTrace();
            return null;
        }        
    }         
}
