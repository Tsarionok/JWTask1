package by.epam.firsttask.entity;

public enum FoodType implements VoucherType{
    MEAT ("Meat"),
    FISH ("Fish"),
    VEGETABLES ("Vegetables"),
    FRUITS ("Fruits"),
    EGGS ("Eggs");

    private final String name;

    private FoodType(String s) {
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
