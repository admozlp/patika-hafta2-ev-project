package org.ademozalp.model;

import java.math.BigDecimal;

public class SummerHouse extends House {
    private String city;

    public SummerHouse(BigDecimal price, float squareMeters, int roomCount, int hallCount) {
        super(price, squareMeters, roomCount, hallCount);
    }

    public SummerHouse(BigDecimal price, float squareMeters, int roomCount, int hallCount, String city) {
        super(price, squareMeters, roomCount, hallCount);
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

