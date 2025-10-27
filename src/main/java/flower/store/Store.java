package flower.store;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Store {
    private List<Flower> inventory;

    public Store() {
        this.inventory = new ArrayList<Flower>();
    }

    public void addFlower(Flower flower) {
        inventory.add(flower);
    }

    public List<Flower> searchFlower(Flower flower) {
        return inventory.stream().filter(f -> f.matches(flower))
                .collect(Collectors.toList());
    }
}