package flower.controller;


import flower.delivery.Delivery;
import flower.delivery.PostalDeliveryStrategy;
import flower.delivery.DHLDeliveryStrategy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @GetMapping("/postalDelivery")
    public double deliverByPostal(@RequestParam double orderPrice) {
        Delivery delivery = new PostalDeliveryStrategy();
        return delivery.delivery(orderPrice);
    }

    @GetMapping("/dhlDelivery")
    public double deliverByDHL(@RequestParam double orderPrice) {
        Delivery delivery = new DHLDeliveryStrategy();
        return delivery.delivery(orderPrice);
    }

}