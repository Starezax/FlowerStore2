package flower.controller;


import flower.payment.Payment;
import flower.payment.PayPalPaymentStrategy;
import flower.payment.CreditCardPaymentStrategy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping("/paypalPayment")
    public double payWithPayPal(@RequestParam double amount) {
        Payment payment = new PayPalPaymentStrategy();
        return payment.payment(amount);
    }

    @GetMapping("/creditcardPayment")
    public double payWithCreditCard(@RequestParam double amount) {
        Payment payment = new CreditCardPaymentStrategy();
        return payment.payment(amount);
    }
}