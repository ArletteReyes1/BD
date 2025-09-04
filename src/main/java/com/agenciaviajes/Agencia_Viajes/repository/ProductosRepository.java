package com.agenciaviajes.Agencia_Viajes.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.agenciaviajes.Agencia_Viajes.model.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Long>{
	Optional<Productos> findByTitulo(String titulo); //springboot hace la busqueda por el titulo
}//interfaceProductosRepository
