package com.cuatroa.reto4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Modelo de Productos
 */
@Document(collection = "chocolate")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    /*
    * Constructores, Getters & Setters
    */
    @Id
    private String reference;
    private String category;
    private String description;
    private boolean availability = true;
    private double price;
    private int quantity;
    private String photography;
}
