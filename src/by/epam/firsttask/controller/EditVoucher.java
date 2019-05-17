package by.epam.firsttask.controller;

import by.epam.firsttask.service.FromMenuToMenu;

public class EditVoucher {
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
