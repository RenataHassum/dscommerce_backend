package com.devsuperior.dscommerce.services;

import com.devsuperior.dscommerce.dto.ShoppingCartOrderDTO;
import com.devsuperior.dscommerce.dto.ShoppingCartOrderItemDTO;
import com.devsuperior.dscommerce.entities.*;
import com.devsuperior.dscommerce.repositories.ShoppingCartOrderItemRepository;
import com.devsuperior.dscommerce.repositories.ShoppingCartOrderRepository;
import com.devsuperior.dscommerce.repositories.ProductRepository;
import com.devsuperior.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Service
public class ShoppingCartOrderService {

    @Autowired
    private ShoppingCartOrderRepository repository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private ShoppingCartOrderItemRepository shoppingCartOrderItemRepository;

    @Transactional(readOnly = true)
    public ShoppingCartOrderDTO findbyId(Long id) {
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        return new ShoppingCartOrderDTO(order);
    }

    @Transactional(readOnly = true)
    public ShoppingCartOrderDTO insert(ShoppingCartOrderDTO dto) {

        Order order = new Order();

        order.setMoment(Instant.now());
        order.setStatus(OrderStatus.WAITING_PAYMENT);

        User user = userService.authenticated();
        order.setClient(user);

        for (ShoppingCartOrderItemDTO itemDto : dto.getItems()) {
            Product product = productRepository.getReferenceById(itemDto.getProductId());
            OrderItem item = new OrderItem(order, product, itemDto.getQuantity(), product.getPrice());
            order.getItems().add(item);
        }
        repository.save(order);
        shoppingCartOrderItemRepository.saveAll(order.getItems());

        return new ShoppingCartOrderDTO(order);
    }
}


