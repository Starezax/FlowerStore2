package flower.store;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import flower.delivery.Delivery;

@Data
public class Order {
    private List<Item> items;
    private Delivery delivery;


    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

}