package by.epam.firsttask.entity.therapeutic;

import by.epam.firsttask.entity.VoucherType;

public enum TherapeuticType implements VoucherType {
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
}
