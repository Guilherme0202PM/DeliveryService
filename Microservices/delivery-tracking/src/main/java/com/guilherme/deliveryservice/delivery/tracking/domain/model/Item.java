package com.guilherme.deliveryservice.delivery.tracking.domain.model;

import java.util.UUID;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PACKAGE)

@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Item {
    @EqualsAndHashCode.Include
    private UUID id;
    private String name;
    private Integer quantity;

    static Item brandNew(String name, Integer quantity){
        Item item = new Item();
        item.id = UUID.randomUUID();
        item.name = name;
        item.quantity = quantity;
        return item;
    }
}
