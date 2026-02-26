package com.guilherme.deliveryservice.delivery.manager.api.controller;

import com.guilherme.deliveryservice.delivery.manager.api.model.CourierInput;
import com.guilherme.deliveryservice.delivery.manager.domain.model.Courier;
import com.guilherme.deliveryservice.delivery.manager.domain.repository.CourierRepository;
import com.guilherme.deliveryservice.delivery.manager.domain.service.CourierRegistrationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/couriers")
@RequiredArgsConstructor
public class CourierController {

    private final CourierRegistrationService courierRegistrationService;
    private final CourierRepository courierRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Courier create(@Valid @RequestBody CourierInput input) {
        return courierRegistrationService.create(input);
    }

    @PutMapping("/{courierId}")
    public Courier update(@PathVariable UUID courierId,
                          @Valid @RequestBody CourierInput input) {
        return courierRegistrationService.update(courierId, input);
    }

    @GetMapping
    public PagedModel<Courier> findAll(@PageableDefault Pageable pageable) {
        return new PagedModel<>(courierRepository.findAll(pageable));
    }

    @GetMapping("/{courierId}")
    public Courier findById(@PathVariable UUID courierId) {
        return courierRepository.findById(courierId)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
