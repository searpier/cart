package com.example.cart.dto;

import com.example.cart.entity.Cart;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CartDeleteRequest {
    private int id;

    public Cart toEntity(){
        return Cart.builder().id(Long.valueOf(this.id)).build();
    }
}
