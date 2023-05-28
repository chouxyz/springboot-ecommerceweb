package com.chou.springbootecommerceweb.service;

import com.chou.springbootecommerceweb.dto.ProductRequest;
import com.chou.springbootecommerceweb.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
