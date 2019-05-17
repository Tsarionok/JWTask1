package by.epam.firsttask.entity.therapeutic;

import by.epam.firsttask.entity.Guiding;

import java.util.Optional;
import java.util.stream.Stream;

public enum TherapeuticType implements Guiding {
    FITNESS ("Fitness"),
    SPA ("Spa"),
    WEIGHT_LOSS ("Weight_loss");

    private final String name;

    private TherapeuticType(String s) {
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

    public static Optional<TherapeuticType> of(String type) {
        return Stream.of(TherapeuticType.values())
                .filter(e -> e.name.equalsIgnoreCase(type))
                .findFirst();
    }

}
