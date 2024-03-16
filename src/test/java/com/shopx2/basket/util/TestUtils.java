package com.shopx2.basket.util;

import com.shopx2.basket.entity.Product;
import lombok.experimental.UtilityClass;

import java.math.BigDecimal;
import java.util.UUID;

@UtilityClass
public class TestUtils {

    public static final Product IPHONE =
        Product.builder()
            .productName("IPhone 12")
            .uuid(UUID.randomUUID())
            .quantity(2)
            .price(new BigDecimal(500))
            .build();

    public static final Product SAMSUNG =
        Product.builder()
            .productName("samsung s3")
            .uuid(UUID.randomUUID())
            .quantity(1)
            .price(new BigDecimal(300))
            .build();

}
