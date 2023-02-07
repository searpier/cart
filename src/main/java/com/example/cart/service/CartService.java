package com.example.cart.service;

import com.example.cart.dto.CartAmountRequest;
import com.example.cart.dto.CartDeleteRequest;
import com.example.cart.dto.CartResponse;
import lombok.RequiredArgsConstructor;

import java.util.List;

public interface CartService {
    public List<CartResponse> selectCart();
    public String deleteCart(CartDeleteRequest request);
    public String updateAmount(CartAmountRequest request);
}
