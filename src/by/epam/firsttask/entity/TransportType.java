package by.epam.firsttask.entity;

public enum TransportType implements VoucherType{
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
}
