package com.shopx2.basket.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.UUID;

@Builder
@Data
public class Product {

    private UUID uuid;
    private String productName;
    private Integer quantity;
    private BigDecimal price;

}
