package flower.payment;

public class CreditCardPaymentStrategy implements Payment{
    static final double COMMISSION = 0.01;
    @Override
    public double payment(double amount) {
        double toPay = amount * (1 + COMMISSION);
        System.out.println(toPay + "with credit card");
        return toPay;
    }
}
