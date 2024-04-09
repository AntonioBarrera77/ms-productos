package com.msproductos.request;

import java.time.LocalDate;

import jakarta.persistence.Column;

public class ProductosRequest {
	
	int productoId;
	int deptoID;
	String nombre;
	LocalDate fecha;
	double precioCompra;
	double precioVenta;
	char refrigerado;
	
	public ProductosRequest(int productoId, int deptoID, String nombre, LocalDate fecha, double precioCompra,
			double precioVenta, char refrigerado) {
		this.productoId = productoId;
		this.deptoID = deptoID;
		this.nombre = nombre;
		this.fecha = fecha;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.refrigerado = refrigerado;
	}

	
	public ProductosRequest(){}


	public int getProductoId() {
		return productoId;
	}


	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}


	public int getDeptoID() {
		return deptoID;
	}


	public void setDeptoID(int deptoID) {
		this.deptoID = deptoID;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public double getPrecioCompra() {
		return precioCompra;
	}


	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}


	public double getPrecioVenta() {
		return precioVenta;
	}


	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}


	public char getRefrigerado() {
		return refrigerado;
	}


	public void setRefrigerado(char refrigerado) {
		this.refrigerado = refrigerado;
	}


	@Override
	public String toString() {
		return "ProductosRequest [productoId=" + productoId + ", deptoID=" + deptoID + ", nombre=" + nombre + ", fecha="
				+ fecha + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + ", refrigerado="
				+ refrigerado + "]";
	}
	
	
	
	
	
}
