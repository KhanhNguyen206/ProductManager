package com.khanhnn.service;

import com.khanhnn.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private static Map<Integer, Product> products;

    static {
        products= new HashMap<>();
        products.put(1, new Product(1, "iphone 7", "iphone", 15000));
        products.put(2, new Product(2, "iphone X", "iphone", 19000));
        products.put(3, new Product(3, "iphone XS", "iphone", 21000));
        products.put(4, new Product(4, "SamSung S10", "SamSung", 16000));
        products.put(5, new Product(5, "SamSung Note 9", "SamSung", 20000));
    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
