package com.shades.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shades.modelos.CarritoModelo;

@Repository
public interface CarritoRepositorio extends JpaRepository<CarritoModelo, Long>{

	
}
