package org.ademozalp.model;

import java.math.BigDecimal;

public class ApartmentHouse extends House{
    private int floor;

    public ApartmentHouse(BigDecimal price, float squareMeters, int roomCount, int hallCount) {
        super(price, squareMeters, roomCount, hallCount);
    }

    public ApartmentHouse(BigDecimal price, float squareMeters, int roomCount, int hallCount, int floor) {
        super(price, squareMeters, roomCount, hallCount);
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

}
