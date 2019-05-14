package by.epam.firsttask.entity.relax;

import by.epam.firsttask.entity.VoucherType;

public enum RelaxType implements VoucherType {
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
}
