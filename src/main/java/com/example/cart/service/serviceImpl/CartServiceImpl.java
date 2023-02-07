package com.example.cart.service.serviceImpl;

import com.example.cart.dto.CartAmountRequest;
import com.example.cart.dto.CartDeleteRequest;
import com.example.cart.dto.CartResponse;
import com.example.cart.entity.Cart;
import com.example.cart.repository.CartRepository;
import com.example.cart.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;
    @Override
    public List<CartResponse> selectCart() {
        List<Cart> cartList=cartRepository.findAll();
        return cartList.stream().map(en->new CartResponse(en)).collect(Collectors.toList());
    }

    @Override
    public String deleteCart(CartDeleteRequest request) {
       try {

           cartRepository.delete(request.toEntity());

       }catch(Exception e) {
           return "failed";
       }
        return "success";
    }

    @Override
    public String updateAmount(CartAmountRequest request) {

        Optional<Cart> cart=cartRepository.findById(Long.valueOf(request.getId()));
        Cart foundCart=cart.get();

        if(foundCart!=null) {
            if (request.getAct().equals("plus")) {
                foundCart.setAmount(foundCart.getAmount() + 1);
                cartRepository.save(foundCart);
            } else {
                if (foundCart.getAmount() > 1)
                    foundCart.setAmount(foundCart.getAmount() - 1);
                cartRepository.save(foundCart);
            }
        }else{
            return "failed";
        }

        return "success";
    }
}
