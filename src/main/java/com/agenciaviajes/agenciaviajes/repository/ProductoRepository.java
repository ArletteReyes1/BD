package com.agenciaviajes.agenciaviajes.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agenciaviajes.agenciaviajes.model.Productos;

@Repository
public interface ProductoRepository extends JpaRepository<Productos, Long>{
 Optional <Productos> findByTitulo(String titulo);
}
