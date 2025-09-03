package com.agenciaviajes.Agencia_Viajes.service;
import java.util.ArrayList;
import java.util.List;
import com.agenciaviajes.Agencia_Viajes.model.ProductosHasCotizacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoHasCotizacionService {
    private final List<ProductosHasCotizacion> lista = new ArrayList<>();
@Autowired
    public ProductoHasCotizacionService() {
        lista.add(new ProductosHasCotizacion(1, 1));
        lista.add(new ProductosHasCotizacion(1, 2));
        lista.add(new ProductosHasCotizacion(1, 3));
        lista.add(new ProductosHasCotizacion(1, 4));
        lista.add(new ProductosHasCotizacion(1, 5));    
    }

    // 
    public List<ProductosHasCotizacion> getProductosHasCotizacion() {
        return lista;
    }
}

