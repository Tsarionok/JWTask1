package by.epam.firsttask.entity.cruise;

import by.epam.firsttask.entity.VoucherType;

public enum CruiseType implements VoucherType {
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

}
