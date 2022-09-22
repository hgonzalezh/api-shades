package com.shades.modelos;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class ProductoModelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long productoId;
	
	@Column(nullable = false)
	private String nombreProducto;
	
	@ManyToOne
	@JoinColumn(nullable = false, name = "categoriaId")
	private CategoriaModelo categoria;
	
	private BigDecimal precio;
	
	@Column(columnDefinition = "text")
	private String descripcion;
	
	@OneToMany(mappedBy = "producto")
	private List<PivoteModelo> pivote;

	public Long getProductoId() {
		return productoId;
	}

	public void setProductoId(Long productoId) {
		this.productoId = productoId;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public CategoriaModelo getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaModelo categoria) {
		this.categoria = categoria;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<PivoteModelo> getPivote() {
		return pivote;
	}

	public void setPivote(List<PivoteModelo> pivote) {
		this.pivote = pivote;
	}

	public ProductoModelo() {
		super();
	}
	
	
	
}
