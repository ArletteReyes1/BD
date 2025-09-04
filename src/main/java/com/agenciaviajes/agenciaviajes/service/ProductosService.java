package com.agenciaviajes.agenciaviajes.service;
import org.springframework.stereotype.Service;

import com.agenciaviajes.agenciaviajes.model.Productos;
import com.agenciaviajes.agenciaviajes.model.Usuario;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductosService {

	private final List<Productos> productos = new ArrayList<>();

//CONSTRUCTOR
	public ProductosService() {
		productos.add(new Productos("Gran Tour de Europa", "https://res.cloudinary.com/dte9mtmma/image/upload/v1755824177/grantoureuropa_ounwxj.jpg", 1999.0, "Londres, Paris, Luxemburgo", 19, 17, "-Boleto de avión México – Londres / Madrid – México volando en clase turista con AEROMÉXICO, algunas salidas son con Iberia Vía Madrid."
				+ "- 17 Noches de alojamiento en categoría indicada."
				+ "- Desayunos de acuerdo con itinerario."
				+ "- Visitas según itinerario."
				+ "- Guía profesional de habla hispana."
				+ "- Traslados los indicados."
				+ "- Transporte en autocar turístico."
				+ "- Documentos electrónicos código QR (empresa socialmente responsable con el medio ambiente)", "-Boleto de avión México – Londres / Madrid – México volando en clase turista con AEROMÉXICO, algunas salidas son con Iberia Vía Madrid."
						+ "- 17 Noches de alojamiento en categoría indicada ."
						+ "- Desayunos de acuerdo con itinerario."
						+ "- Visitas según itinerario."
						+ "- Guía profesional de habla hispana."
						+ "- Traslados los indicados."
						+ "- Transporte en autocar turístico."
						+ "- Documentos electrónicos código QR (empresa socialmente responsable con el medio ambiente)."
						+ "- Alimentos, gastos de indole personal."
						+ "- Ningún servicio no especificado."
						+ "- Todas las excursiones que se mencionan como opcionales."
						+ "- Impuestos aéreos por persona."
						+ "NOTA: 65 EUROS QUE CORRESPONDEN A PROPINAS PARA CHOFERES, TASAS HOTELES Y MUNICIPALES. SE PAGA EN DESTINO"));
		productos.add(new Productos("Especial Egypto y Dubái", "https://res.cloudinary.com/dte9mtmma/image/upload/v1755824176/egiptoydubai_x1myfh.jpg", 1299.0, "El Cairo, Aswan, Kom Ombo, Edfu, Esna, Luxar y Duboi", 15, 12, "-Boleto de avión en viaje redondo México – Dubái – México, en clase turista."
				+ "-Vuelos Dubái – El Cairo - Dubái / El Cairo – Aswan / Luxor – El Cairo en clase turista."
				+ "- 3 noches de alojamiento en el Cairo"
				+ "-3 noches de crucero por el Nilo"
				+ "-1 noche de alojamiento en Luxor"
				+ "-5 noches de alojamiento en Dubái."
				+ "-Régimen alimenticio indicado en el itinerario."
				+ "-Traslados indicados."
				+ "-Visitas indicadas."
				+ "-Guías de habla hispana."
				+ "-Autocar con aire acondicionado", "-Gastos personales y extras en los hoteles."
						+ "-Propinas en Egipto: 60 USD por persona. (Se paga directo en destino)"
						+ "-Propinas en Dubái: 35 USD por persona. (Se paga directo en destino)"
						+ "-Impuesto Turismo en Dubái: 5 USD por habitación por noche. (Se paga directo en destino)BookingConclusion"
						+ "-Impuestos aéreos"
						+ "-Visa de Egipto: 25 USD aproximadamente (se paga en destino)"
						+ "-Ningún servicio no especificado como incluido o como opcional."
						+ "-Seguro de viaje (Es obligatorio para entrar a los Emiratos árabes Unidos)"));
		productos.add(new Productos("Tailandia y Phuket", "https://res.cloudinary.com/dte9mtmma/image/upload/v1755824181/tailandia-phukec_saz3lm.jpg", 1599.0, "Bangkok, Kanchanaburi, Chiang Rai, Chiang Mai, Phuket", 13, 9, "- Boleto de avión en viaje redondo México – Bangkok / Phuket – México en clase turista."
				+ "- Boleto de avión Bangkok – Chiang Rai / Chiang Mai – Phuket en clase turista."
				+ "- 03 noches de alojamiento en Bangkok."
				+ "- 02 noche de alojamiento en Chiang Rai."
				+ "- 02 noches de alojamiento en Chiang Mai."
				+ "- 02 noches de alojamiento en Phuket."
				+ "- Traslados indicados"
				+ "- Visitas indicadas"
				+ "- Guías de habla hispana"
				+ "- Autocar con aire acondicionado", "-Gastos personales y extras en los hoteles."
						+ "-Propinas en Tailandia: 50 USD por persona (Se paga directo en destino)"
						+ "-Ningún servicio no especificado como incluido o especificado como opcional."
						+ "-Visa de Tailandia"
						+ "-Impuestos aéreos por persona"));
		productos.add(new Productos("Japón, El camino del Samurai", "https://res.cloudinary.com/dte9mtmma/image/upload/v1755824177/japon_xmc7hm.jpg", 1999.0, "Hiroshima, Osaka, Kioto", 11, 9, "-Boleto de avión."
				+ "- Boleto tren bala Tokyo - Hiroshima."
				+ "- 2 noches de alojamiento en Hiroshima."
				+ "- 3 noches de alojamiento en Osaka."
				+ "- 1 noche de alojamiento en Nagoya."
				+ "- 03 noches de alojamiento en Tokio."
				+ "- Visitas indicadas."
				+ "- Autocar con aire acondicionado", "-Gastos personales y extras."
						+ "- Bebidas."
						+ "- Propinas Japón: 50 USD por persona (se pagan directamente en destino)."
						+ "- Ningún servicio no especificado como incluido o especificado como opcional)"));
		productos.add(new Productos("Tailandia y Phuket EXPRESS", "https://res.cloudinary.com/dte9mtmma/image/upload/v1755824174/tailandiaExpress_jmrxsp.jpg", 999.0, "Bangkok, Ayutthaya, Lopburi, Phitsanuloke, Sukhothai, Chiang Rai, Chiang Mai, Phuket", 11, 7, "- Boleto de avión en viaje redondo México -Bangkok - México, en clase tusrita."
				+ "- Boleto de avión Chiang Mai - Phuket en clase turista."
				+ "- Boleto de avión Phuket - Bangkok en clase turista."
				+ "- 2 noches de alojamiento en Bangkpk."
				+ "- 1 noche de alojamiento en Phitsanuloke."
				+ "- 1 noche de alojamiento en Chiang Rai."
				+ "- 1 noche de alojamiento en Chiang Mai."
				+ "- 2 noches de alojamiento en Phuket."
				+ "- Régimen alimenticio indicado en itinerario."
				+ "- Autocar con aire acondicionado", "- Gastos personales y extras en hoteles, BebidasPropinas para maleteros, camaristas, meseros, etc."
						+ "-Propinas en Tailandia: 50 USD por persona (Se paga directo en destino)"
						+ "-Gastos extras en los hoteles como llamadas telefónicas, lavandería, etc."
						+ "-Visa de Tailanda."
						+ "-Fe de cámaras en los monumentos."
						+ "-Ningún servicio no específicado como incluido o especificado como opcional, Impuestos aéreos"));
	}//constructor

//MÉTODO PARA OBTENER LA LISTA DE PRODUCTOS
	public List<Productos> getProductos() {
		return productos;
	}//getProductos

	
	public Productos getProductos(Long id) {
		Productos tmpProd = null; //producto temporal, de inicio null y si lo encuentra, lo establece. 
		  for(Productos prod: productos) {
		   if(prod.getId()==id) {
		    tmpProd=prod;
		    break;
		   }//if
		  }//foreach
		  return tmpProd;
	}

	public Productos deleteProductos(Long id) {
		Productos tmpProd = null; //producto temporal, de inicio null y si lo encuentra, lo establece. 
		  for(Productos prod: productos) {
		   if(prod.getId()==id) {
		    tmpProd=prod;
		    productos.remove(prod);
		    break;
		   }//if
		  }//foreach
		  return tmpProd;
	}

	public Productos addProductos(Productos productos2) {
		productos.add(productos2);
		  return productos2;
	}

	public Productos addProductos(Long id, String titulo, String imagenUrl, Double precio, String lugares, Integer dias,
			Integer noches, String incluye, String noIncluye) {
		Productos tmpProd = null; 
		  for(Productos prod: productos) {
		   if(prod.getId()==id) {
		    tmpProd=prod;
		    if(titulo!=null) prod.setTitulo(titulo);
		    if(imagenUrl!=null) prod.setImagenUrl(imagenUrl);
		    if(precio!=null) prod.setPrecio(precio);
		    if(lugares!=null) prod.setLugares(lugares);
		    if(dias!= null) prod.setDias(dias);
		    if(noches!=null) prod.setNoches(noches);
		    if(incluye!=null) prod.setIncluye(incluye);
		    if(noIncluye!=null) prod.setNoIncluye(noIncluye);
		    tmpProd=prod;
		    break;
		   }//if
		  }//foreach
		  return tmpProd;
	}//addProductos
	



}//classProductosService
