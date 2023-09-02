package com.example.lab3.repositorio;

import com.example.lab3.entidad.Arbitro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipperRepository extends JpaRepository<Arbitro, Integer> {
}
