package com.guilherme.deliveryservice.delivery.tracking.domain.model;

import com.guilherme.deliveryservice.delivery.tracking.domain.exception.DomainException;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryTest {
    @Test
    public void shouldChangeToPlaced(){
        Delivery delivery = Delivery.draft();

        delivery.editPreparationDetails(createdValidPreparationDetails());
        delivery.place();

        assertEquals(DeliveryStatus.WAITING_FOR_COURIER, delivery.getStatus());
        assertNotNull(delivery.getPlacedAt());
    }

    @Test
    public  void shouldNotPlace(){
        Delivery delivery = Delivery.draft();

        assertThrows(DomainException.class, ()->{
            delivery.place();
        });

        assertEquals(DeliveryStatus.DRAFT, delivery.getStatus());
        assertNull(delivery.getPlacedAt());
    }

    private Delivery.PreparationDetails createdValidPreparationDetails(){
        ContactPoint sender = ContactPoint.builder()
                .zipCode("00000-000")
                .street("Av. João Naves de Ávila")
                .number("2121")
                .complement("Sala 007")
                .name("Guilherme")
                .phone("(34) 90000-0000")
                .build();

        ContactPoint recipient = ContactPoint.builder()
                .zipCode("111111-000")
                .street("R. Ceará - Umuarama")
                .number("018")
                .complement("")
                .name("João")
                .phone("(34) 91234-4321")
                .build();

        return  Delivery.PreparationDetails.builder()
                .sender(sender)
                .recipient(recipient)
                .distanceFee(new BigDecimal("15.00"))
                .courierPayout(new BigDecimal("5.00"))
                .expectedDeliveryTime(Duration.ofHours(5))
                .build();
    }
}