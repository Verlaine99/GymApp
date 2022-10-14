package com.example.demo.repository;

import com.example.demo.crudrepository.ReservationCrudRepository;
import java.util.List;
import java.util.Optional;
import com.example.demo.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationRepository {
    @Autowired
    private ReservationCrudRepository reservationCrudRepository;
    
    public List<Reservation> getAll(){
        return (List<Reservation>) reservationCrudRepository.findAll();
    }
    
    public Optional<Reservation> getById(Integer id){
        return reservationCrudRepository.findById(id);
    }
    
    public Reservation save(Reservation reservation){
        return reservationCrudRepository.save(reservation);
    }
    
    public void delete (Reservation reservation){
        reservationCrudRepository.delete(reservation);
    }
    
}