package hu.unideb.inf.model;

import javax.persistence.*;

@Entity
public class Drink
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int quantity;
    private int orderPrice;
    private int sellPrice;

    public Drink(String name, int quantity, int orderPrice, int sellPrice) {
        this.name = name;
        this.quantity = quantity;
        this.orderPrice = orderPrice;
        this.sellPrice = sellPrice;
    }

    public Drink() {
    }
    @Basic
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Basic
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Basic
    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }
    @Basic
    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }
}
