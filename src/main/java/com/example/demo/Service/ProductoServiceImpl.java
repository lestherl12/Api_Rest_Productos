package com.example.demo.Service;


import com.example.demo.ProductoDao.ProductoDAO;
import com.example.demo.entities.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDAO productoDao;

    @Override
    public List<Producto> findAll() {
        return (List<Producto>)productoDao.findAll();
    }

    @Override
    public Producto findById(Long id) {
        return productoDao.findById(id).orElse(null);
    }

    @Override
    public void createProducto(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    public void modifyProducto(Long id, Producto producto) {
        if (productoDao.existsById(id)) {
            producto.setId(id);
            productoDao.save(producto);
        }
    }

    @Override
    public void deleteProducto(Long id) {
        if (productoDao.existsById(id)) {
            productoDao.deleteById(id);
        }
    }
}
