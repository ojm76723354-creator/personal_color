package kr.persnol.color.PC;

import jakarta.persistence.*;

@Entity
public class Product {
    //테스트 주석

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "name")
    private String name;

    @Column(name = "bland", nullable = false)
    private String bland;

    @Column(name = "price")
    private int price;
}