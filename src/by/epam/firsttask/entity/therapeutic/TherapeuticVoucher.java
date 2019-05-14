package by.epam.firsttask.entity.therapeutic;

import by.epam.firsttask.entity.FoodType;
import by.epam.firsttask.entity.TransportType;
import by.epam.firsttask.entity.Voucher;

public class TherapeuticVoucher extends Voucher {
    private TherapeuticType therapeuticType;

    public TherapeuticVoucher() {
        super();
        this.therapeuticType = null;
    }

    public TherapeuticVoucher(TransportType transportType, FoodType foodType,
                              int dayAmount, TherapeuticType therapeuticType, double price) {
        super(transportType, foodType, dayAmount, price);

        this.therapeuticType = therapeuticType;
    }

    public TherapeuticType getTherapeuticType() {
        return therapeuticType;
    }

    public void setTherapeuticType(TherapeuticType therapeuticType) {
        this.therapeuticType = therapeuticType;
    }

    @Override
    public String toString() {
        return getTransportType() + " " + getFoodType() + " " + getDayAmount() + " " + getTherapeuticType();
    }
}
