package com.example.demo.Service;

import com.example.demo.entities.Producto;

import java.util.List;

public interface ProductoService {
    public List<Producto> findAll();

    public Producto findById(Long id);

    public void createProducto(Producto producto);

    public void modifyProducto(Long id, Producto producto);

    public void deleteProducto(Long id);
}

