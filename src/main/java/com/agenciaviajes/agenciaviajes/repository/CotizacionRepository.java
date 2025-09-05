package com.agenciaviajes.agenciaviajes.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agenciaviajes.agenciaviajes.model.Cotizacion;
@Repository
public interface CotizacionRepository extends JpaRepository<Cotizacion, Long>{
Optional<Cotizacion> findByFecha(String fecha);
}
