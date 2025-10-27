package flower;


import flower.delivery.Delivery;
import flower.delivery.PostalDeliveryStrategy;
import flower.delivery.DHLDeliveryStrategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeliveryTest {
    static final double SMALL_ORDER_PRICE_POSTAL = 100.0;
    static final double LARGE_ORDER_PRICE_POSTAL = 1500.0;
    static final double SMALL_ORDER_PRICE_DHL = 1500.0;
    static final double LARGE_ORDER_PRICE_DHL = 3500.0;

    @Test
    public void testDeliveryPostal() {
        Delivery postalDelivery = new PostalDeliveryStrategy();
        assertEquals(2.0, postalDelivery.delivery(SMALL_ORDER_PRICE_POSTAL));
        assertEquals(300.0, postalDelivery.delivery(LARGE_ORDER_PRICE_POSTAL));
    }

    @Test
    public void testDeliveryDHL() {
        Delivery dhlDelivery = new DHLDeliveryStrategy();
        assertEquals(15.0, dhlDelivery.delivery(SMALL_ORDER_PRICE_DHL));
        assertEquals(0.0, dhlDelivery.delivery(LARGE_ORDER_PRICE_DHL));
    }
}