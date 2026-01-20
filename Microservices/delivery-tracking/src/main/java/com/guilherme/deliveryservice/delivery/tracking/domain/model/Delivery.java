package com.guilherme.deliveryservice.delivery.tracking.domain.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PACKAGE)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Delivery {

    @EqualsAndHashCode.Include
    private UUID id;
    private UUID courierId;

    private DeliveryStatus status;

    private OffsetDateTime placedAt;
    private OffsetDateTime assignedAt;
    private OffsetDateTime expectedDeliveryAt;
    private OffsetDateTime fulfilledAt;

    private BigDecimal distanceFree;
    private BigDecimal courierPayout;
    private BigDecimal totalCost;

    private Integer totalItems;

    private ContactPoint sender;
    private ContactPoint recipient;

    private List<Item> itens = new ArrayList<>();

    //factory
    public static Delivery draft(){
        Delivery delivery = new Delivery();
        delivery.id = UUID.randomUUID();
        delivery.status = DeliveryStatus.DRAFT;
        delivery.totalItems = 0;
        delivery.totalCost = BigDecimal.ZERO;
        delivery.courierPayout = BigDecimal.ZERO;
        delivery.distanceFree = BigDecimal.ZERO;
        return delivery;
    }

}
