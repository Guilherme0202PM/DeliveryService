package com.guilherme.deliveryservice.delivery.tracking.domain.model;

import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.*;

public class DeliveryStatusTest {

    @Test
    void draft_canChangeToWaitingForCourier(){
        assertTrue(
                DeliveryStatus.DRAFT.canChangeTo(DeliveryStatus.WAITING_FOR_COURIER)
        );
    }

    @Test
    void draft_canChangeToInTransit(){
        assertTrue(
                DeliveryStatus.DRAFT.canNotChangeTo(DeliveryStatus.IN_TRANSIT)
        );
    }
}
