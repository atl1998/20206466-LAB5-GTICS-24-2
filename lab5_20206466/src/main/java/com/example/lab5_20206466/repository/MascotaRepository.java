package com.example.lab5_20206466.repository;
import com.example.lab5_20206466.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface MascotaRepository extends JpaRepository<Mascota,Integer>{

}
