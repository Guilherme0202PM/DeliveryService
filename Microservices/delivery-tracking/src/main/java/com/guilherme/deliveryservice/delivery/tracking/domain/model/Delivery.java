package com.guilherme.deliveryservice.delivery.tracking.domain.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import lombok.EqualsAndHashCode;


@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Delivery {

    @EqualsAndHashCode.Include
    private UUID id;
    private UUID courierId;

    private DeliveryStatus Status;

    private OffsetDateTime placedAt;
    private OffsetDateTime assignedAt;
    private OffsetDateTime expectedDeliveryAt;
    private OffsetDateTime fulfilledAt;

    private BigDecimal distanceFree;
    private BigDecimal courierPayout;
    private BigDecimal totalCosy;

    private Integer totalItems;

    private ContactPoint sender;
    private ContactPoint recipient;

    private List<Item> itens = new ArrayList<>();
}
