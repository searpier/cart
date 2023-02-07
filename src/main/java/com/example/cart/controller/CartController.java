package com.example.cart.controller;

import com.example.cart.dto.CartAmountRequest;
import com.example.cart.dto.CartDeleteRequest;
import com.example.cart.dto.CartResponse;
import com.example.cart.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @GetMapping("/cart")
    public List<CartResponse> selectCart(){
        return cartService.selectCart();
    }


    @PatchMapping("/cart/amount")
    public String updateAmount(CartAmountRequest request){
        return cartService.updateAmount(request);
    }

    @DeleteMapping("/cart")
    public String deleteCart(CartDeleteRequest request){
        return cartService.deleteCart(request);
    }

}
