package com.item.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("ItemsCollection")
public class Item {

    @Id
    private BigInteger id;
    private int product_id;
    private String product;
    private float price;
    private int quantity;
}
