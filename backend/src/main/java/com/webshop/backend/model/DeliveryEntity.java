package com.webshop.backend.model;

/*
 * Copyright
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The type Delivery.
 *
 * @since 0.0.1
 */
@Entity
@Table(name = "delivery")
public class DeliveryEntity {
    @Id
    @SequenceGenerator(name = "IdSeq", sequenceName = "ID_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IdSeq")
    @Column(name = "DELIVERY_ID")
    private Long id;

    @Column(name = "delivery_city", nullable = false)
    private String city;

    @Column(name = "delivery_street", nullable = false)
    private String street;

    @Column(name = "delivery_home", nullable = false)
    private String home;

    @Column(name = "delivery_apartments")
    private String apartment;

    /**
     * Instantiates a new Delivery.
     */
    public DeliveryEntity() {
    }

    /**
     * Gets id.
     *
     * @return The id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Sets id.
     *
     * @param id The id
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * Gets city.
     *
     * @return The city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Sets city.
     *
     * @param city The city
     */
    public void setCity(final String city) {
        this.city = city;
    }

    /**
     * Gets street.
     *
     * @return The street
     */
    public String getStreet() {
        return this.street;
    }

    /**
     * Sets street.
     *
     * @param street The street
     */
    public void setStreet(final String street) {
        this.street = street;
    }

    /**
     * Gets home.
     *
     * @return The home
     */
    public String getHome() {
        return this.home;
    }

    /**
     * Sets home.
     *
     * @param home The home
     */
    public void setHome(final String home) {
        this.home = home;
    }

    /**
     * Gets apartment.
     *
     * @return The apartment
     */
    public String getApartment() {
        return this.apartment;
    }

    /**
     * Sets apartment.
     *
     * @param apartment The apartment
     */
    public void setApartment(final String apartment) {
        this.apartment = apartment;
    }
}