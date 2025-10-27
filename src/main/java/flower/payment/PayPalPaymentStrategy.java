package flower.payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public double payment(double amount) {
        System.out.println(amount + "with PayPal");
        return amount;
    }
}
