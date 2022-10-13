package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Order;
import com.devsuperior.dscommerce.entities.OrderItem;
import com.devsuperior.dscommerce.entities.OrderStatus;

import javax.validation.constraints.NotEmpty;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartOrderDTO {

    private Long id;
    private Instant moment;
    private OrderStatus status;

    private ShoppingCartClientDTO client;

    private ShoppingCartPaymentDTO payment;

    @NotEmpty(message = "Deve ter pelo menos um item")
    private List<ShoppingCartOrderItemDTO> items = new ArrayList<>();

    public ShoppingCartOrderDTO(Long id, Instant moment, OrderStatus status, ShoppingCartClientDTO client, ShoppingCartPaymentDTO payment) {
        this.id = id;
        this.moment = moment;
        this.status = status;
        this.client = client;
        this.payment = payment;
    }

    public ShoppingCartOrderDTO(Order entity) {
        this.id = entity.getId();
        this.moment = entity.getMoment();
        this.status = entity.getStatus();
        this.client = new ShoppingCartClientDTO(entity.getClient());
        this.payment = (entity.getPayment() == null) ? null : new ShoppingCartPaymentDTO(entity.getPayment());
        for (OrderItem item : entity.getItems()) {
            ShoppingCartOrderItemDTO itemDto = new ShoppingCartOrderItemDTO(item);
            items.add(itemDto);
        }
    }

    public Long getId() {
        return id;
    }

    public Instant getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public ShoppingCartClientDTO getClient() {
        return client;
    }

    public ShoppingCartPaymentDTO getPayment() {
        return payment;
    }

    public List<ShoppingCartOrderItemDTO> getItems() {
        return items;
    }

    public Double getTotal(){
        double sum = 0.0;
        for (ShoppingCartOrderItemDTO item : items) {
            sum = sum + item.getSubTotal();
        }
        return sum;
    }
}
