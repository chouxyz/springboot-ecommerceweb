package com.chou.springbootecommerceweb.dao;

import com.chou.springbootecommerceweb.dto.ProductQueryParams;
import com.chou.springbootecommerceweb.dto.ProductRequest;
import com.chou.springbootecommerceweb.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void updateStock(Integer productId, Integer stock);

    void deleteProductById(Integer productId);
}
