package by.epam.firsttask.entity;

public abstract class Voucher {
    private TransportType transportType;
    private FoodType foodType;
    private int dayAmount;
    private double price;
    private VoucherType voucherType;

    public Voucher() {
        this.transportType = null;
        this.foodType = null;
        this.dayAmount = 0;
        this.price = 0.0d;
    }

    public Voucher(TransportType transportType, FoodType foodType, int dayAmount, double price) {
        this.transportType = transportType;
        this.foodType = foodType;
        this.dayAmount = dayAmount;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public VoucherType getVoucherType() {
        return voucherType;
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

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVoucherType(VoucherType voucherType) {this.voucherType = voucherType;}
}

