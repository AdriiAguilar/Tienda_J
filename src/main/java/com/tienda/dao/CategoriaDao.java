package com.tienda.dao;

import com.tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List; 
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query,Param;

public interface CategoriaDao extends JpaRepository <Categoria, Long> {

    public List<Producto> findByPrecioBetweenOrderByDescripcion(double 
precioInf, double precioSup); 

}