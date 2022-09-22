package com.shades.controladores;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shades.modelos.CategoriaModelo;
import com.shades.servicios.CategoriaServicio;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaControlador {

	@Autowired
	CategoriaServicio categoriaServicio;
	
	@GetMapping //// http://localhost/8080/api/usuarios
	public ArrayList<CategoriaModelo> obtenerUsuarios() {
		return categoriaServicio.obtenerCategoria();
	}
}
