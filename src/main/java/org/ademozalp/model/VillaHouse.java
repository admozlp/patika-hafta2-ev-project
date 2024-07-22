package org.ademozalp.model;

import java.math.BigDecimal;

public class VillaHouse extends House{
    private String color;

    public VillaHouse(BigDecimal price, float squareMeters, int roomCount, int hallCount) {
        super(price, squareMeters, roomCount, hallCount);
    }

    public VillaHouse(BigDecimal price, float squareMeters, int roomCount, int hallCount, String color) {
        super(price, squareMeters, roomCount, hallCount);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
