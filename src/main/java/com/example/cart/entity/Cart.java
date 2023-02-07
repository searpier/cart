package com.example.cart.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name="prac_cart")
public class Cart {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(targetEntity=Product.class, fetch=FetchType.EAGER) // (1)
    @JoinColumn(name="pro_id") // (2)
    private Product product;

    @Column(name="amount")
    private int amount;


}
