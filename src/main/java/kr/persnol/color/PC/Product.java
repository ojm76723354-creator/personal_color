package kr.persnol.color.PC;

import jakarta.persistence.*;

@Entity
public class Product {
    //테스트 주석

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "bland", nullable = false)
    private String bland;

    @Column(name = "price")
    private int price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBland() {
        return bland;
    }

    public void setBland(String bland) {
        this.bland = bland;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}