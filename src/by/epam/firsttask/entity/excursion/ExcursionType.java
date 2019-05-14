package by.epam.firsttask.entity.excursion;

import by.epam.firsttask.entity.VoucherType;

public enum ExcursionType implements VoucherType {
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
}
