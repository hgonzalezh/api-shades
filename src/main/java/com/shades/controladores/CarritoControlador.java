package com.shades.controladores;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/{id}")
    public CarritoModelo getProducto(@PathVariable Long id) {
        return carritoServicio.obtenerCarrito(id);
    }

    @PostMapping()
    public CarritoModelo guardarCarrito(@RequestBody CarritoModelo carrito) {
        return this.carritoServicio.guardarCarrito(carrito);
    }

    @PutMapping("/actualizarCarrito")
    public CarritoModelo actualizar(@RequestBody CarritoModelo carritoModelo) {
        return carritoServicio.modificarCarrito(carritoModelo);
        }

    @DeleteMapping("/borrar/{ordenId}")
    public String eliminarporId(@PathVariable("ordenId") Long OrdenId) {
        boolean ok = this.carritoServicio.borrarCarrito(OrdenId);
            if (ok) {
                return "Se elimino el carrito con id " + OrdenId;
            }else{
                return "No pudo eliminar el carrito con id " + OrdenId;
            }
        }

}
