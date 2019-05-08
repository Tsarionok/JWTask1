package by.epam.firsttask.entity.excursion;

import by.epam.firsttask.entity.FoodType;
import by.epam.firsttask.entity.TransportType;
import by.epam.firsttask.entity.Voucher;

public class ExcursionVoucher extends Voucher {
    private ExcursionType excursionType;

    public ExcursionVoucher(TransportType transportType, FoodType foodType, int dayAmount, ExcursionType excursionType){
        super(transportType, foodType, dayAmount);

        this.excursionType = excursionType;
    }

    public ExcursionType getExcursionType() {
        return excursionType;
    }

    public void setExcursionType(ExcursionType excursionType) {
        this.excursionType = excursionType;
    }

    @Override
    public String toString() {
        return getTransportType() + " " + getFoodType() + " " + getDayAmount() + " " + getExcursionType();
    }
}