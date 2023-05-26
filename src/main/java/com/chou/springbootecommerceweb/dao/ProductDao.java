package com.chou.springbootecommerceweb.dao;

import com.chou.springbootecommerceweb.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
