package by.epam.firsttask.entity.relax;

import by.epam.firsttask.entity.Guiding;

import java.util.Optional;
import java.util.stream.Stream;

public enum RelaxType implements Guiding {
    SEA ("Sea"), MOUNTAINS ("Mountains");

    private final String name;

    private RelaxType(String s) {
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

    public static Optional<RelaxType> of(String type) {
        return Stream.of(RelaxType.values())
                .filter(e -> e.name.equalsIgnoreCase(type))
                .findFirst();
    }
}
