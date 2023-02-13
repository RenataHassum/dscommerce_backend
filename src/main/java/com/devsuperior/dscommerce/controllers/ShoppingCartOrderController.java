package com.devsuperior.dscommerce.controllers;

import com.devsuperior.dscommerce.dto.ShoppingCartOrderDTO;
import com.devsuperior.dscommerce.services.ShoppingCartOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping(value = "/orders")
public class ShoppingCartOrderController {

    @Autowired
    private ShoppingCartOrderService service;

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_CLIENT')")
    @GetMapping(value = "/{id}")
    public ResponseEntity<ShoppingCartOrderDTO> findById(@PathVariable Long id) {
        ShoppingCartOrderDTO dto = service.findbyId(id);
        return ResponseEntity.ok(dto);
    }

    @PreAuthorize("hasRole('ROLE_CLIENT')")
    @PostMapping
    public ResponseEntity<ShoppingCartOrderDTO> insert(@Valid @RequestBody ShoppingCartOrderDTO dto) {
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

}
