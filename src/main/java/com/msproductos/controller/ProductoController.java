package com.msproductos.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msproductos.entity.Productos;
import com.msproductos.impl.ProductoImplement;
import com.msproductos.request.ProductosRequest;

@RestController
@RequestMapping("producto")
public class ProductoController {
	
	//Inyeccion de la clase implementacion
	@Autowired
	ProductoImplement service;
	
	//http://localhost:8095/producto GET
	
	@GetMapping
	public ResponseEntity<List<Productos>> mostrar(){
		
		List<Productos> lista = service.mostrar();
		return new ResponseEntity<List<Productos>>(lista,HttpStatus.OK);
	}
	
	//http://localhost:8095/producto POST
	@PostMapping
	public ResponseEntity<Productos> guardar(@RequestBody ProductosRequest request){
		Productos prod = service.guardar(request);
		return new ResponseEntity<Productos>(prod,HttpStatus.OK);
	}
	
	//http://localhost:8095/producto PUT
	@PutMapping
	public ResponseEntity<Productos> actualizar(@RequestBody ProductosRequest request){
		Productos prod = service.actualizar(request);
		return new ResponseEntity<Productos>(prod,HttpStatus.OK);
	}
	
	//http://localhost:8095/producto/buscar/12 GET
	@GetMapping("/buscar/{id}")
	public ResponseEntity<Productos> buscar(@PathVariable int id){
		Productos prod = service.buscar(id);
		return new ResponseEntity<Productos>(prod,HttpStatus.OK);
	}
	
	//http://localhost:8095/producto DELETE
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id){
		String mensaje = service.eliminar(id);
		return new ResponseEntity<String>(mensaje,HttpStatus.OK);
	}
}
