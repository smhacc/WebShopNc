package com.webshop.model;
/*
 * Copyright
 */

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The type ORDERS.
 */
@Entity
@Table(name = "ORDERS")
public class OrderEntity {
    @Id
    @SequenceGenerator(name = "IdSeq", sequenceName = "ID_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IdSeq")
    @Column(name = "ORDERS_ID")
    private Long id;

    @ManyToOne(cascade = {CascadeType.DETACH})
    @JoinColumn(name = "CUSTOMER_ID", foreignKey = @ForeignKey(name = "OR_CUST_FK"))
    private CustomerEntity customer;

    @OneToOne(cascade = {CascadeType.DETACH})
    @JoinColumn(name = "DELIVERY_ID", foreignKey = @ForeignKey(name = "OR_DELIV_FK"))
    private DeliveryEntity delivery;

    @OneToOne(cascade = {CascadeType.DETACH})
    @JoinColumn(name = "PRODUCT_ID", foreignKey = @ForeignKey(name = "OR_PROD_PR_FK"))
    private ProductEntity product;

    @Column(name="ORDER_Price")
    private Float price;

    @Column(name = "ORDERS_name")
    private String name;

    @Column(name = "ORDERS_quantity")
    private Long quantity;

    /**
     * Instantiates a new Order.
     */
    public OrderEntity() {
    }

    public OrderEntity(Long id, float price, String name, Long quantity ) {
        super();
        this.id = id;
        this.price = price;
        this.name = name;
        this.quantity = quantity;



    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets comment.
     *
     * @return the id
     */
    public String getName() {
        return name;
    }

    /**
     * Sets comment.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Gets sum.
     *
     * @return the sum
     */
    public Float getPrice() {
        return price;
    }

    /**
     * Sets id.
     *
     * @param price the price
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * Gets quantity.
     *
     * @return the quantity
     */
    public Long getQuantity() { return quantity; }

    /**
     * Sets id.
     *
     * @param quantity the quantity
     */
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
    /**
     * Gets user.
     *
     * @return the user
     */
    public CustomerEntity getCustomer() {
        return customer;
    }

    /**
     * Sets customer.
     *
     * @param customer the customer
     */
    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }

    /**
     * Gets delivery.
     *
     * @return the delivery
     */
    public DeliveryEntity getDelivery() {
        return delivery;
    }

    /**
     * Sets delivery.
     *
     * @param delivery the delivery
     */
    public void setDelivery(DeliveryEntity delivery) {
        this.delivery = delivery;
    }

}
