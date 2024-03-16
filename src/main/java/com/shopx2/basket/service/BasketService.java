package com.shopx2.basket.service;

import com.shopx2.basket.entity.Basket;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface BasketService {
    UUID createBasket();

    Basket getBasketById(UUID uuid);
}
