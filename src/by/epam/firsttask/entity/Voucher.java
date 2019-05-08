package by.epam.firsttask.entity;

public abstract class Voucher {
    private TransportType transportType;
    private FoodType foodType;
    private int dayAmount;

    public Voucher(TransportType transportType, FoodType foodType, int dayAmount) {
        this.transportType = transportType;
        this.foodType = foodType;
        this.dayAmount = dayAmount;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public int getDayAmount() {
        return dayAmount;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public void setDayAmount(int dayAmount) {
        this.dayAmount = dayAmount;
    }
}

