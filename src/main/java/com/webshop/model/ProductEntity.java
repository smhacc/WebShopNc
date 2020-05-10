/*
 * Copyright
 */
package com.webshop.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The type Product.
 */
@Entity
@Table(name = "PRODUCT")
public class ProductEntity {
    @Id
    @SequenceGenerator(name = "IdSeq", sequenceName = "ID_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IdSeq")
    @Column(name = "PRODUCT_ID")
    private Long id;

    @Column(name = "PRODUCT_NAME")
    private String name;

    @Column(name = "PRODUCT_PRICE")
    private Float price;

    @Column(name = "PRODUCT_DESCRIPTION")
    private String description;

    @Column(name = "PRODUCT_PICTURE")
    private byte[] picture;

    @Column(name = "PRODUCT_COUNT")
    private Long count;

    @ManyToOne(cascade = {CascadeType.DETACH}, fetch = FetchType.EAGER)
    @JoinColumn(name = "CATEGORY_ID", foreignKey = @ForeignKey(name = "PROD_CAT_FK"), unique = true)
    private CategoriesEntity category;

    /**
     * Instantiates a new Product.
     */
    public ProductEntity(Long id, String name, float price, String description, Long count) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.count = count;

    }


    public ProductEntity() {
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
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public Float getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets category.
     *
     * @return the category
     */
    public CategoriesEntity getCategory() {
        return category;
    }

    /**
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(CategoriesEntity category) {
        this.category = category;
    }
    /**
     * Gets count.
     *
     * @return the count
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets count.
     *
     * @param count the category
     */
    public void setCount(Long count) {
        this.count = count;
    }


}
