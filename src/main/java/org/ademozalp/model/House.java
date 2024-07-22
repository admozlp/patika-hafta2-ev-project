package org.ademozalp.model;


import java.math.BigDecimal;
import java.util.UUID;


public class House {
    private String id;

    private BigDecimal price;

    private float squareMeters;

    private int roomCount;

    private int hallCount;

    public House(BigDecimal price, float squareMeters, int roomCount, int hallCount){
        this.id = UUID.randomUUID().toString();
        this.price = price;
        this.squareMeters = squareMeters;
        this.roomCount = roomCount;
        this.hallCount = hallCount;
    }

    private House(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public float getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(float squareMeters) {
        this.squareMeters = squareMeters;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getHallCount() {
        return hallCount;
    }

    public void setHallCount(int hallCount) {
        this.hallCount = hallCount;
    }

    @Override
    public String toString() {
        return "House{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", squareMeters=" + squareMeters +
                ", roomCount=" + roomCount +
                ", hallCount=" + hallCount +
                '}';
    }
}
