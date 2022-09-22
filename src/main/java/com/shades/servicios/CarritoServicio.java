package com.shades.servicios;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shades.modelos.CarritoModelo;
import com.shades.repositorios.CarritoRepositorio;

@Service
public class CarritoServicio {
	
	@Autowired
	private CarritoRepositorio carritoRepository;
	
	public ArrayList<CarritoModelo> obtenerCarrito(){
		return(ArrayList<CarritoModelo>) carritoRepository.findAll();
	}	
}
