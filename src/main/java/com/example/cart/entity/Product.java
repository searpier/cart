package com.example.cart.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name="prac_product")
public class Product {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="intro")
    private String intro;
    @Column(name="contents")
    private String contents;
    @Column(name="image")
    private String image;
    @Column(name="color")
    private String color;
    @Column(name="price")
    private int price;
    @Column(name="size")
    private String size;

}
