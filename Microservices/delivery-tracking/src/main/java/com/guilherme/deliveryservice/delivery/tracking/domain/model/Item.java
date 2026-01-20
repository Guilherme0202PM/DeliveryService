package com.guilherme.deliveryservice.delivery.tracking.domain.model;

import java.util.UUID;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Item {
    @EqualsAndHashCode.Include
    private UUID id;
    private String name;
    private Integer quantity;
}
