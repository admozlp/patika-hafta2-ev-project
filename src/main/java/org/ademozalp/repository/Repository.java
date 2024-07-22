package org.ademozalp.repository;

import org.ademozalp.model.ApartmentHouse;
import org.ademozalp.model.SummerHouse;
import org.ademozalp.model.VillaHouse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Repository {
    private final List<ApartmentHouse> apartmentHouses = new ArrayList<>();
    private final List<VillaHouse> villaHouses = new ArrayList<>();
    private final List<SummerHouse> summerHouses = new ArrayList<>();

    private static class  Helper {
        private static final Repository INSTANCE = new Repository();
    }

    public static Repository getInstance(){
        return Helper.INSTANCE;
    }

    private Repository(){
        apartmentHouses.addAll(
                List.of(
                        new ApartmentHouse(new BigDecimal("150000"), 85.5f, 3, 1, 2),
                        new ApartmentHouse(new BigDecimal("200000"), 95.0f, 4, 1, 3),
                        new ApartmentHouse(new BigDecimal("175000"), 90.0f, 3, 1, 4)
                )
        );

        villaHouses.addAll(
                List.of(
                        new VillaHouse(new BigDecimal("500000"), 150.0f, 5, 2, "White"),
                        new VillaHouse(new BigDecimal("600000"), 160.0f, 6, 2, "Blue"),
                        new VillaHouse(new BigDecimal("700000"), 180.0f, 6, 3, "Green")
                )
        );

        summerHouses.addAll(
                List.of(
                        new SummerHouse(new BigDecimal("300000"), 120.0f, 4, 1, "Miami"),
                        new SummerHouse(new BigDecimal("350000"), 130.0f, 5, 2, "Los Angeles"),
                        new SummerHouse(new BigDecimal("400000"), 140.0f, 6, 3, "San Diego")
                )
        );
    }

    public List<ApartmentHouse> getApartmentHouses() {
        return apartmentHouses;
    }

    public List<VillaHouse> getVillaHouses() {
        return villaHouses;
    }

    public List<SummerHouse> getSummerHouses() {
        return summerHouses;
    }
}
