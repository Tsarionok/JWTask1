package by.epam.firsttask.entity;

import java.util.Optional;
import java.util.stream.Stream;

public enum TransportType implements Guiding {
    CAR ("Car"),
    PLAIN ("Plain"),
    BUS ("Bus"),
    LINER ("Liner");

    private final String name;

    private TransportType(String s) {
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

    public static Optional<TransportType> of(String type) {
        return Stream.of(TransportType.values())
                .filter(e -> e.name.equalsIgnoreCase(type))
                .findFirst();
    }
}
