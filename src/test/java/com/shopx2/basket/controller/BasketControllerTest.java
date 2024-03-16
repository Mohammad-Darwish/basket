package com.shopx2.basket.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shopx2.basket.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static com.shopx2.basket.util.Constants.BACKSLASH;
import static com.shopx2.basket.util.Constants.BASE_URL;
import static com.shopx2.basket.util.TestUtils.IPHONE;
import static com.shopx2.basket.util.TestUtils.SAMSUNG;
import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(BasketController.class)
public class BasketControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper mapper;

//    @Mock
//    private BasketService basketService;

    @Test
    void addItemsToBasketTest() throws Exception {
        List<Product> productList = List.of(IPHONE, SAMSUNG);
//        Mockito.when(basketService.addProducts("550e8400-e29b-41d4-a716-446655440000", productList))
//            .thenReturn(UUID.fromString("550e8400-e29b-41d4-a716-446655440000"));
        String productsAsJson = mapper.writeValueAsString(productList);

        MockHttpServletResponse response = mockMvc.perform(
                post(BACKSLASH + BASE_URL + "550e8400-e29b-41d4-a716-446655440000/products")
                    .content(productsAsJson)
                    .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andReturn().getResponse();
        String contentAsString = response.getContentAsString();
        assertFalse(contentAsString.isEmpty());
    }

    @Test
    void getItemFromBasketTest() throws Exception {
        MockHttpServletResponse response = mockMvc.perform(
                get(BASE_URL + "e976a0af-345b-459e-9afd-66fc3a1eae7f")
                    .contentType(MediaType.APPLICATION_JSON)
                    .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andReturn().getResponse();

        ArrayList<Product> products = mapper.readValue(response.toString(), new TypeReference<>(){});
//        List<Product> resultActions = response;
    }

    @Test
    void updateBasketItemTest() {
        // Setup
        // Execute
        // Assert
    }

    @Test
    void removeItemFromBasketTest() {
        // Setup
        // Execute
        // Assert
    }

    @Test
    void clearBasketTest() {
        // Setup
        // Execute
        // Assert
    }
}
