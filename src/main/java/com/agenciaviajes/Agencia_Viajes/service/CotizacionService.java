package com.agenciaviajes.Agencia_Viajes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenciaviajes.Agencia_Viajes.model.cotizacion;
@Service
public class CotizacionService {
	private final ArrayList<cotizacion>lista = new ArrayList<cotizacion>();
	
	@Autowired
	public CotizacionService() {
		lista.add(new cotizacion("2025-05-20",(long) 1));
		lista.add(new cotizacion("2025-06-08",(long) 2));
		lista.add(new cotizacion("2025-07-15",(long) 3));
		lista.add(new cotizacion("2025-08-02",(long) 4));
		lista.add(new cotizacion("2025-08-28",(long) 5));
	}//CotizacionService
	
	
	public List<cotizacion> getCotizacion(){		
		return lista;
	}
	
	public cotizacion getCotizacion(Long id) {
		cotizacion tmpProd = null; //producto temporal, de inicio null y si lo encuentra, lo establece. 
		  for(cotizacion cot: lista) {
		   if(cot.getIdCotizacion()==id) {
		    tmpProd=cot;
		    break;
		   }//if
		  }//foreach
		  return tmpProd;
	}


	public cotizacion deleteCotizacion(Long id) {
		cotizacion tmpProd = null; //producto temporal, de inicio null y si lo encuentra, lo establece. 
		  for(cotizacion cot: lista) {
		   if(cot.getIdCotizacion()==id) {
		    tmpProd=cot;
		    lista.remove(cot);
		    break;
		   }//if
		  }//foreach
		  return tmpProd;
	}


	public cotizacion addCotizacion(cotizacion cotizacion) {
			  lista.add(cotizacion);
			  return cotizacion;
			 }//addCotizacion


	public cotizacion updateCotizacion(Long id, String fecha, Long fkIdUsuario) {
		cotizacion tmpProd = null; 
		  for(cotizacion cot: lista) {
		   if(cot.getIdCotizacion()==id) {
		    tmpProd=cot;
		    if(fecha!=null) cot.setFecha(fecha);
		    if(fkIdUsuario!=null) cot.setFkIdUsuario(fkIdUsuario);
		    tmpProd=cot;
		    break;
		   }//if
		  }//foreach
		  return tmpProd;
	}//updateCotizacion
}//class CotizacionService




