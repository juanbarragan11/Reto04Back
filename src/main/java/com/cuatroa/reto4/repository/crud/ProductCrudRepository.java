package com.cuatroa.reto4.repository.crud;

import com.cuatroa.reto4.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * CRUD Repository MONGO Productos
 */
public interface ProductCrudRepository extends MongoRepository<Product, String> {
    
}
