package com.guilherme.deliveryservice.delivery.tracking.domain.service;

import com.guilherme.deliveryservice.delivery.tracking.domain.repository.DeliveryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
@RequiredArgsConstructor
public class DeliveryCheckpointService {

    private final DeliveryRepository deliveryRepository;

    public void place(UUID deliveryId) {

    }

    public void pickUp(UUID deliveryId, UUID courierId) {

    }

    public void complete(UUID deliveryId) {

    }
}