package com.guilherme.deliveryservice.delivery.tracking.domain.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class Delivery {
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
}
