package by.epam.firsttask.presentation;

import by.epam.firsttask.dao.TravelCompany;
import by.epam.firsttask.entity.FoodType;
import by.epam.firsttask.entity.TransportType;
import by.epam.firsttask.entity.Voucher;
import by.epam.firsttask.entity.cruise.CruiseType;
import by.epam.firsttask.entity.cruise.CruiseVoucher;
import by.epam.firsttask.entity.relax.RelaxType;
import by.epam.firsttask.entity.relax.RelaxVoucher;

public class Presentation {
    public static void main(String[] args) {
        TravelCompany travelCompany = new TravelCompany();

        Voucher travel = new CruiseVoucher(TransportType.BUS, FoodType.MEAT, 15, CruiseType.RIVER);
        Voucher chill = new RelaxVoucher(TransportType.CAR, FoodType.FISH, 25, RelaxType.MOUNTAINS);

        travelCompany.addVoucher(travel);
        travelCompany.addVoucher(chill);

        for (int i = 0; i < travelCompany.getVouchers().size(); i++) {
            System.out.println(travelCompany.getVouchers().get(i).toString());
        }
    }
}
