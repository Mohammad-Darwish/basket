package com.shopx2.basket.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Data
@Document(collation = "basket")
public class Basket {
    @Id
    private UUID id;
    private List<Product> products;
}
