package com.campusdual.classroom;

import org.junit.jupiter.api.DisplayNameGenerator;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    private Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, Date expirationDate) {
        super(name, uniqueId, responsibleId);
        this.expirationDate = expirationDate;
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;

    }

    public String getFormattedDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(expirationDate);
    }

    @Override
    public String getSpecificData() {
        StringBuilder b = new StringBuilder();
        b.append("Location: ").append(getLocation());
        b.append("\nExpiration date: ").append(getFormattedDate(expirationDate));
        return b.toString();
    }

    public void printSpecificData() {
        System.out.println(getSpecificData());
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }


}
