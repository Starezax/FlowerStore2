package flower.delivery;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public double delivery(double orderPrice){
        System.out.println("DHL delivery ");
        if (orderPrice < 3000){
            return 0.01*orderPrice;
        }
        else{
            return 0;
        }
    }
}
