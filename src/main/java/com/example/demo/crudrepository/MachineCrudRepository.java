package com.example.demo.crudrepository;

import com.example.demo.entities.Machine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MachineCrudRepository extends JpaRepository<Machine, Integer>{
    
}
