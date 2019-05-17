package by.epam.firsttask.entity;

import java.util.Optional;
import java.util.stream.Stream;

public enum FoodType implements Guiding {
    MEAT ("Meat"),
    FISH ("Fish"),
    VEGETABLES ("Vegetables"),
    FRUITS ("Fruits"),
    EGGS ("Eggs");

    private final String name;

    private FoodType(String s) {
        name = s;
    }

    @Override
    public boolean equalsName(String otherName) {

        return name.equals(otherName);
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static Optional<FoodType> of(String type) {
        return Stream.of(FoodType.values())
                .filter(e -> e.name.equalsIgnoreCase(type))
                .findFirst();
    }
}
