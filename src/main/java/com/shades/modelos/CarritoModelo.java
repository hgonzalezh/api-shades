package com.shades.modelos;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "carrito")
public class CarritoModelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long ordenId;

	@OneToOne
	@JoinColumn(nullable = false, name = "usuarioId")
	@JsonProperty(access = Access.WRITE_ONLY)
	private UsuarioModelo usuario;

	@ManyToOne
	@JoinColumn(nullable = false, name = "productoId")
	@JsonProperty(access = Access.WRITE_ONLY)
	private PivoteModelo productoId;

	private Long cantidadDeProductos;

	private Date fechaDeCompra;

	private Double total;

	@OneToMany(mappedBy = "carrito")
	private List<PivoteModelo> pivote;

	public Long getOrdenId() {
		return ordenId;
	}

	public void setOrdenId(Long ordenId) {
		this.ordenId = ordenId;
	}

	public UsuarioModelo getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModelo usuario) {
		this.usuario = usuario;
	}

	public PivoteModelo getProductoId() {
		return productoId;
	}

	public void setProductoId(PivoteModelo productoId) {
		this.productoId = productoId;
	}

	public Long getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(Long cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public Date getFechaDeCompra() {
		return fechaDeCompra;
	}

	public void setFechaDeCompra(Date fechaDeCompra) {
		this.fechaDeCompra = fechaDeCompra;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public List<PivoteModelo> getPivote() {
		return pivote;
	}

	public void setPivote(List<PivoteModelo> pivote) {
		this.pivote = pivote;
	}

	public CarritoModelo() {
		super();
	}

}
