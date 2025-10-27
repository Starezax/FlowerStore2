package flower.delivery;

public class PostalDeliveryStrategy implements Delivery {
    @Override
    public double delivery(double orderPrice){
        System.out.println("PostalDelivery delivery ");
        if (orderPrice < 1000){
            return 0.02*orderPrice;
        }
        else{
            return 300;
        }
    }
}
