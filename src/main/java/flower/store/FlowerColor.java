package flower.store;

public enum FlowerColor {

    RED("#FF0000"), YELLOW("#FFFF00"), BLUE("#0000FF");

    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}