package com.shades.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "pivote")
public class PivoteModelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique = true)
	private Long pivoteId;
	
	@ManyToOne
	@JoinColumn(nullable = false, name = "productoId")
	@JsonProperty(access = Access.WRITE_ONLY)
	private ProductoModelo producto;
	
	@ManyToOne
	@JoinColumn(nullable = false, name = "ordenId")
	@JsonProperty(access = Access.WRITE_ONLY)
	private CarritoModelo carrito;
}
