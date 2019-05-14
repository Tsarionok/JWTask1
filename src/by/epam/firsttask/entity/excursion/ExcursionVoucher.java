package by.epam.firsttask.entity.excursion;

import by.epam.firsttask.entity.FoodType;
import by.epam.firsttask.entity.TransportType;
import by.epam.firsttask.entity.Voucher;

public class ExcursionVoucher extends Voucher {
    private ExcursionType excursionType;

    public ExcursionVoucher() {
        super();
        this.excursionType = null;
    }

    public ExcursionVoucher(TransportType transportType, FoodType foodType,
                            int dayAmount, ExcursionType excursionType, double price){
        super(transportType, foodType, dayAmount, price);

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
