package com.guilherme.deliveryservice.delivery.manager.domain.repository;

import com.guilherme.deliveryservice.delivery.manager.domain.model.Courier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourierRepository extends JpaRepository<Courier, UUID> {
}
