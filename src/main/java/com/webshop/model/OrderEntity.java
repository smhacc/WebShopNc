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

    @Column(name="ORDER_SUM")
    private Float sum;

    @Column(name = "ORDERS_COMMENT")
    private String comment;

    /**
     * Instantiates a new Order.
     */
    public OrderEntity() {
    }

    public OrderEntity(Long id, String comment, float sum/*, DeliveryEntity delivery, CustomerEntity customer*/) {
        super();
        this.id = id;
        this.comment = comment;
        this.sum = sum;
        /*this.customer = customer;
        this.delivery = delivery;*/

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
    public String getComment() {
        return comment;
    }

    /**
     * Sets comment.
     *
     * @param comment the comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    /**
     * Gets sum.
     *
     * @return the sum
     */
    public Float getSum() {
        return sum;
    }

    /**
     * Sets id.
     *
     * @param sum the sum
     */
    public void setSum(Float sum) {
        this.sum = sum;
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
    public DeliveryEntity getAddress() {
        return delivery;
    }

    /**
     * Sets delivery.
     *
     * @param delivery the delivery
     */
    public void setAddress(DeliveryEntity delivery) {
        this.delivery = delivery;
    }

}
