package by.epam.firsttask.entity.relax;

import by.epam.firsttask.entity.FoodType;
import by.epam.firsttask.entity.TransportType;
import by.epam.firsttask.entity.Voucher;

public class RelaxVoucher extends Voucher {
    private RelaxType relaxType;

    public RelaxVoucher(TransportType transportType, FoodType foodType, int dayAmount, RelaxType relaxType){
        super(transportType, foodType, dayAmount);

        this.relaxType = relaxType;
    }

    public RelaxType getRelaxType() {
        return relaxType;
    }

    public void setRelaxType(RelaxType relaxType) {
        this.relaxType = relaxType;
    }

    @Override
    public String toString() {
        return getTransportType() + " " + getFoodType() + " " + getDayAmount() + " " + getRelaxType();
    }
}
