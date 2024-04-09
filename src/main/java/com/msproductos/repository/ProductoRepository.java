package com.msproductos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.msproductos.entity.Productos;

//DAO
@Repository
public interface ProductoRepository extends JpaRepository<Productos,Integer> {
	
	
	
}
