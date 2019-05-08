package by.epam.firsttask.dao;

import by.epam.firsttask.entity.Voucher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class TravelCompany {
    public static final Logger LOGGER = Logger.getLogger(TravelCompany.class.getName());
    List<Voucher> vouchers;

    public TravelCompany() {
        this.vouchers = new ArrayList<>();
        try {
            Files.createDirectories(Paths.get("/client base"));
        }
        catch (IOException ioexception){
            LOGGER.warning("efefefefef");
        }
    }

    public TravelCompany(List<Voucher> vouchers) {
        this.vouchers = vouchers;
    }

    public List<Voucher> getVouchers() {
        return vouchers;
    }

    public void addVoucher(Voucher someVoucher) {
        this.vouchers.add(someVoucher);
    }

    public void removeVoucher(Voucher someVoucher) {
        this.vouchers.remove(someVoucher);
    }
}
