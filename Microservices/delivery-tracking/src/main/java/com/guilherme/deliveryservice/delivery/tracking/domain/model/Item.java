package com.guilherme.deliveryservice.delivery.tracking.domain.model;

import java.util.UUID;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PACKAGE)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Setter(AccessLevel.PRIVATE)
//@Setter(AccessLevel.PACKAGE)

@Getter


public class Item {
    @EqualsAndHashCode.Include
    private UUID id;
    private String name;
    @Setter(AccessLevel.PACKAGE)
    private Integer quantity;


    static Item brandNew(String name, Integer quantity){
        Item item = new Item();
        item.setId(UUID.randomUUID());
        item.setName(name);
        item.setQuantity(quantity);
        return item;
    }
}
