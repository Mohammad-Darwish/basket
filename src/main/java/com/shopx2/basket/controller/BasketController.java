package com.shopx2.basket.controller;

import com.shopx2.basket.entity.Basket;
import com.shopx2.basket.service.BasketServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

import static com.shopx2.basket.util.Constants.BASE_URL;

@RequiredArgsConstructor
@RestController
@RequestMapping(BASE_URL)
public class BasketController {

    private final BasketServiceImpl basketService;

    @PostMapping(
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<UUID> createBasket() {
        UUID uuid = basketService.createBasket();
        return new ResponseEntity<>(uuid, HttpStatus.CREATED);
    }

    @GetMapping(
        value = "{id}",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Basket> getBasketById(@PathVariable UUID id) {
        Basket basket = basketService.getBasketById(id);
        return new ResponseEntity<>(basket, HttpStatus.OK);
    }
}
