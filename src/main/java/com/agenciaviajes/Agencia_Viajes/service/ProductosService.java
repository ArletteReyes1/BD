package com.agenciaviajes.Agencia_Viajes.service;
import org.springframework.stereotype.Service;
import com.agenciaviajes.Agencia_Viajes.model.Productos;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductosService {

	private final List<Productos> productos = new ArrayList<>();

//CONSTRUCTOR
	public ProductosService() {
		productos.add(new Productos("Tour a Cancún", "https://imagen.com/cancun.jpg", 1500.0, "Cancún, Playa del Carmen", 5, 4, "Hotel, Vuelo", "Comidas extras"));
		productos.add(new Productos("Tour a París", "https://imagen.com/paris.jpg", 2500.0, "París, Versalles", 7, 6, "Hotel, Vuelo, Desayuno", "Entradas a museos"));
	}//constructor

//MÉTODO PARA OBTENER LA LISTA DE PRODUCTOS
	public List<Productos> getProductos() {
		return productos;
	}//getProductos
	
//GET
//POST
//DELETE

}//classProductosService
