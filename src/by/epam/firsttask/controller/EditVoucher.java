package by.epam.firsttask.controller;

import by.epam.firsttask.service.FromMenuToMenu;
import by.epam.firsttask.entity.Voucher;

public class EditVoucher {
    private Voucher voucher;
    private FromMenuToMenu fromMenuToMenu = new FromMenuToMenu();

    public void createVoucher() {
        fromMenuToMenu.travelFromMainMenu();
        fromMenuToMenu.travelFromTransportMenu();
        fromMenuToMenu.travelFromFoodMenu();
        fromMenuToMenu.enterDaysAmount();
        fromMenuToMenu.enterCost();
        fromMenuToMenu.saveVoucherInBase();
    }
}
