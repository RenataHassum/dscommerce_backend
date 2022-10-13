package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Payment;

import java.time.Instant;

public class ShoppingCartPaymentDTO {
    private Long id;
    private Instant moment;

    public ShoppingCartPaymentDTO(Long id, Instant moment) {
        this.id = id;
        this.moment = moment;
    }

    public ShoppingCartPaymentDTO(Payment entity) {
        id = entity.getId();
        moment = entity.getMoment();
    }

    public Long getId() {
        return id;
    }

    public Instant getMoment() {
        return moment;
    }
}
