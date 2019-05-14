package by.epam.firsttask.entity.cruise;

import by.epam.firsttask.entity.FoodType;
import by.epam.firsttask.entity.TransportType;
import by.epam.firsttask.entity.Voucher;

public class CruiseVoucher extends Voucher {
    private CruiseType cruiseType;

    public CruiseVoucher() {
        super();
        this.cruiseType = null;
    }

    public CruiseVoucher(TransportType transportType, FoodType foodType,
                         int dayAmount, CruiseType cruiseType, double price){
        super(transportType, foodType, dayAmount, price);

        this.cruiseType = cruiseType;
    }

    public CruiseType getCruiseType() {
        return cruiseType;
    }

    public void setCruiseType(CruiseType cruiseType) {
        this.cruiseType = cruiseType;
    }

    @Override
    public String toString() {
        return getTransportType() + " " + getFoodType() + " " + getDayAmount() + " " + getCruiseType();
    }
}
