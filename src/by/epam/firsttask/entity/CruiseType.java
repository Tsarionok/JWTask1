package by.epam.firsttask.entity;

import java.util.Optional;
import java.util.stream.Stream;

public enum CruiseType implements Guiding {
    SEA ("Sea"), RIVER ("River");

    private final String name;

    private CruiseType(String s) {
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

    public static Optional<CruiseType> of(String type) {
        return Stream.of(CruiseType.values())
                .filter(e -> e.name.equalsIgnoreCase(type))
                .findFirst();
    }

}
