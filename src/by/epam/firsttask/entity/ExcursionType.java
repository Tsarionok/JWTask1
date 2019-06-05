package by.epam.firsttask.entity;

import java.util.Optional;
import java.util.stream.Stream;

public enum ExcursionType implements Guiding {
    ONE_DAY ("One"), MANY_DAY ("Many");

    private final String name;

    private ExcursionType(String s) {
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

    public static Optional<ExcursionType> of(String type) {
        return Stream.of(ExcursionType.values())
                .filter(e -> e.name.equalsIgnoreCase(type))
                .findFirst();
    }
}
