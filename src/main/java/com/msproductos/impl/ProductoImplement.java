package com.msproductos.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msproductos.entity.Productos;
import com.msproductos.repository.ProductoRepository;
import com.msproductos.request.ProductosRequest;
import com.msproductos.service.ProductoService;

@Service
public class ProductoImplement implements ProductoService {
	// Inyeccion de dependencias

	@Autowired // Inyeccion de dependencias por atributo con Autowired
	ProductoRepository repo;

	// Inyeccion de dependencias por constructor
	// Inyeccion de dependencias por setter

	@Override
	public Productos guardar(ProductosRequest request) {

		Productos prod = new Productos();
		prod.setDeptoID(request.getDeptoID());
		prod.setFecha(request.getFecha());
		prod.setNombre(request.getNombre());
		prod.setPrecioCompra(request.getPrecioCompra());
		prod.setPrecioVenta(request.getPrecioVenta());
		prod.setRefrigerado(request.getRefrigerado());
		repo.save(prod);
		return prod;

	}

	@Override
	public Productos actualizar(ProductosRequest request) {
		Productos prod = repo.findById(request.getProductoId()).get();
		prod.setDeptoID(request.getDeptoID());
		prod.setFecha(request.getFecha());
		prod.setNombre(request.getNombre());
		prod.setPrecioCompra(request.getPrecioCompra());
		prod.setPrecioVenta(request.getPrecioVenta());
		prod.setRefrigerado(request.getRefrigerado());
		repo.save(prod);
		return prod;
	}

	@Override
	public Productos buscar(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Productos buscar(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
