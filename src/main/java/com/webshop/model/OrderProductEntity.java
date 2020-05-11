package com.webshop.model;


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
 * The type Order detail.
 */
@Entity
@Table(name = "ORDER_PRODUCT")
public class OrderProductEntity {
    @Id
    @SequenceGenerator(name = "IdSeq", sequenceName = "ID_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IdSeq")
    @Column(name = "ORDER_PRODUCT_ID")
    private Long id;

    @ManyToOne(cascade = {CascadeType.DETACH})
    @JoinColumn(name = "ORDER_ID", foreignKey = @ForeignKey(name = "ORDER_FK"))
    private OrderEntity order;

    @OneToOne(cascade = {CascadeType.DETACH})
    @JoinColumn(name = "PRODUCT_ID", foreignKey = @ForeignKey(name = "OR_PROD_PR_FK"))
    private ProductEntity product;

    /**
     * Instantiates a new Order detail.
     */
    public OrderProductEntity() {
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
     * Gets cart.
     *
     * @return the cart
     */
    public OrderEntity getOrder() {
        return order;
    }

    /**
     * Sets cart.
     *
     * @param order the order
     */
    public void setOrder(OrderEntity order) {
        this.order = order;
    }

    /**
     * Gets product.
     *
     * @return the product
     */
    public ProductEntity getProduct() {
        return product;
    }

    /**
     * Sets product.
     *
     * @param product the product
     */
    public void setProduct(ProductEntity product) {
        this.product = product;
    }
}
