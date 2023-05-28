package com.chou.springbootecommerceweb.dao;

import com.chou.springbootecommerceweb.dto.ProductRequest;
import com.chou.springbootecommerceweb.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
