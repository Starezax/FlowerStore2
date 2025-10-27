package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(Flower other) {
        this.color = other.color;
        this.price = other.price;
        this.sepalLength = other.sepalLength;
        this.flowerType = other.flowerType;
    }

    public boolean matches(Flower other) {
        return this.color == other.color
                && this.flowerType == other.flowerType
                && this.price == other.price
                && this.sepalLength == other.sepalLength;

    }

    public String getColor() {
        return color.toString();
    }
}