package com.agenciaviajes.agenciaviajes.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.agenciaviajes.agenciaviajes.model.Cotizacion;
import com.agenciaviajes.agenciaviajes.model.Usuario;
import com.agenciaviajes.agenciaviajes.repository.CotizacionRepository;
@Service
public class CotizacionService {
	private final CotizacionRepository repository;
	@Autowired
	public CotizacionService(CotizacionRepository repository) {
	this.repository = repository;
	}//CotizacionService
	
	 //-------------------------GET---------------------------------------
	public List<Cotizacion> getCotizacion(){		
		return repository.findAll();
	}//getCotizacion
	
	public Cotizacion getCotizacion(Long id) {
		return repository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("La cotización con el id [" + id + "] no existe")
				);
	}//getCotizacion
//------------------------------DELETE----------------------------------
	public Cotizacion deleteCotizacion(Long id) {
		Cotizacion tmpCot = null; //producto temporal, de inicio null y si lo encuentra, lo establece. 
		if(repository.existsById(id)) {
			tmpCot = repository.findById(id).get(); //traer el producto
			repository.deleteById(id);
		}//id
		return tmpCot;
	}//deleteCotizacion
	
//-------------------------------POST----------------------------------------

	public Cotizacion addCotizacion(Cotizacion cotizacion) {
		Optional <Cotizacion> cot = repository.findByFecha(cotizacion.getFecha() );//regresa el Optional / la bolsa vacia
		if( cot.isEmpty()) {
<<<<<<< HEAD
			repository.save(cotizacion);
		}else {
			cotizacion=null;
		}//else
		return cotizacion;
	}//addCotizacion

//---------------------------PUT----------------------------------------
	public Cotizacion updateCotizacion(Long id, String fecha, Usuario usuario) {
=======
			return repository.save(cotizacion);
		}else {
			System.out.println("La cotizacion [" + cotizacion.getFecha() + "] ya se encuentra registrada");
			return null;
		}//else
	}//addCotizacion

//---------------------------PUT----------------------------------------
	public Cotizacion updateCotizacion(Long id, String fecha, Long fkIdUsuario ) {//Long fkIdUsuario esto iba dentro del parentesis
>>>>>>> APRcambios
		Cotizacion tmpCot = null; 
		if(repository.existsById(id)) {
			Cotizacion cot = repository.findById(id).get();
				if(fecha!=null) cot.setFecha(fecha);
<<<<<<< HEAD
				if(usuario!=null) cot.setUsuario(usuario);
=======
				if(fkIdUsuario!=null) cot.setFkIdUsuario(fkIdUsuario);
>>>>>>> APRcambios
				repository.save(cot);
				tmpCot=cot;
			}//if
		return tmpCot;
	}//updateCotizacion
}//class CotizacionService




