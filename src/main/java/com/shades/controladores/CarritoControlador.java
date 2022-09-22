package com.shades.controladores;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shades.modelos.CarritoModelo;
import com.shades.servicios.CarritoServicio;

@RestController
@RequestMapping("/api/carrito")
public class CarritoControlador {

	@Autowired
	CarritoServicio carritoServicio;
	
	@GetMapping()
	public ArrayList<CarritoModelo> obtenerCarrito(){
		return carritoServicio.obtenerCarrito();
	}
}
