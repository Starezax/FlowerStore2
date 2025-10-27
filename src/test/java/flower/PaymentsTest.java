package flower;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import flower.payment.Payment;
import flower.payment.PayPalPaymentStrategy;
import flower.payment.CreditCardPaymentStrategy;

public class PaymentsTest {
    static final double AMOUNT = 10000.0;
    static final double COMMISSION_PAYPAL = 0.0;
    static final double COMMISSION_CREDIT_CARD = 0.01;

    @Test
    public void testPaymentPayPal() {

        Payment payment = new PayPalPaymentStrategy();
        double finalAmount = AMOUNT * (1 + COMMISSION_PAYPAL);
        assertEquals(payment.payment(AMOUNT), finalAmount);
    }

    @Test
    public void testPaymentCreditCard() {
        Payment payment = new CreditCardPaymentStrategy();
        double finalAmount = AMOUNT * (1 + COMMISSION_CREDIT_CARD);
        assertEquals(payment.payment(AMOUNT), finalAmount);
    }
}
