package com.chou.springbootecommerceweb.service.impl;

import com.chou.springbootecommerceweb.dao.ProductDao;
import com.chou.springbootecommerceweb.dto.ProductRequest;
import com.chou.springbootecommerceweb.model.Product;
import com.chou.springbootecommerceweb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
        productDao.updateProduct(productId, productRequest);
    }
}
