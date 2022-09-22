package com.shades.servicios;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shades.modelos.CarritoModelo;
import com.shades.repositorios.CarritoRepositorio;

@Service
public class CarritoServicio {

	@Autowired
	private CarritoRepositorio carritoRepository;

	public ArrayList<CarritoModelo> obtenerCarrito() {
		return (ArrayList<CarritoModelo>) carritoRepository.findAll();
	}

	public CarritoModelo guardarCarrito(CarritoModelo carrito) {
		return carritoRepository.save(carrito);
	}

	// Actualizar
	public CarritoModelo modificarCarrito(CarritoModelo carritoModelo) {
		return carritoRepository.save(carritoModelo);
	}

	// Obtener TipoDePago por id
	public CarritoModelo obtenerCarrito(Long id) {
		Optional<CarritoModelo> carrito = carritoRepository.findById(id);
		return carrito.orElse(null);
	}

	public boolean borrarCarrito(Long OrdenId) {
		try {
			carritoRepository.deleteById(OrdenId);
			return true;
		} catch (Exception err) {
			return false;
		}
	}
}
