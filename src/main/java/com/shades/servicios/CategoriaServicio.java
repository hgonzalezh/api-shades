package com.shades.servicios;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shades.modelos.CategoriaModelo;
import com.shades.repositorios.CategoriaRepositorio;

@Service
public class CategoriaServicio {

	@Autowired
	private CategoriaRepositorio categoriaRepositorio;
	
	public ArrayList<CategoriaModelo> obtenerCategoria(){
		return (ArrayList<CategoriaModelo>) categoriaRepositorio.findAll();
	}
}
