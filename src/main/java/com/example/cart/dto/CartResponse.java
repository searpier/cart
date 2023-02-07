package com.example.cart.dto;

import com.example.cart.entity.Cart;
import lombok.Getter;

@Getter
public class CartResponse {
    private Long cartId;
    private Long proId;
    private String intro;
    private String contents;
    private String image;
    private String size;
    private String color;
    private int amount;
    private int price;

    public CartResponse(Cart cart){
        this.cartId=cart.getId();
        this.proId=cart.getProduct().getId();
        this.intro=cart.getProduct().getIntro();
        this.contents=cart.getProduct().getContents();
        this.image=cart.getProduct().getImage();
        this.size=cart.getProduct().getSize();
        this.color=cart.getProduct().getColor();
        this.amount=cart.getAmount();
        this.price=cart.getProduct().getPrice();
    }
}
