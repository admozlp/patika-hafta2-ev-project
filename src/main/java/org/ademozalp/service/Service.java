package org.ademozalp.service;

import org.ademozalp.model.House;
import org.ademozalp.repository.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

public class Service {

    private final Repository repository;

    private Service(Repository repository) {
        this.repository = repository;
    }

    private static class Helper {
        private static final Service INSTSNCE = new Service(Repository.getInstance());
    }

    public static Service getInstance() {
        return Helper.INSTSNCE;
    }

    //  Evlerin toplam fiyatlarını dönen bir metot
    public BigDecimal getTotalPriceApartment() {
        return repository.getApartmentHouses().stream()
                .map(House::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    //  Villaların toplam fiyatlarını dönen bir metot
    public BigDecimal getTotalPriceVilla() {
        return repository.getVillaHouses().stream()
                .map(House::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    //  Yazlıkların toplam fiyatlarını dönen bir metot
    public BigDecimal getTotalPriceSummerHouse() {
        return repository.getSummerHouses().stream()
                .map(House::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    //   Tüm tipteki evlerin toplam fiyatını dönen metot
    public BigDecimal getTotalPrice() {
        return getTotalPriceApartment()
                .add(getTotalPriceVilla())
                .add(getTotalPriceSummerHouse());
    }

    //  Evlerin ortalama metrekaresini dönen bir metot
    public float getAverageSquareMeterApartment() {
        Float totalSquareMeter = repository.getApartmentHouses().stream()
                .map(House::getSquareMeters)
                .reduce(0f, Float::sum);

        return totalSquareMeter / repository.getApartmentHouses().size();
    }

    //  Villaların ortalama metrekaresini dönen bir metot
    public float getAverageSquareMeterVilla() {
        Float totalSquareMeter = repository.getVillaHouses().stream()
                .map(House::getSquareMeters)
                .reduce(0f, Float::sum);

        return totalSquareMeter / repository.getVillaHouses().size();
    }

    //  Yazlıkların ortalama metrekaresini dönen bir metot
    public float getAverageSquareMeterSummerHose() {
        Float totalSquareMeter = repository.getSummerHouses().stream()
                .map(House::getSquareMeters)
                .reduce(0f, Float::sum);

        return totalSquareMeter / repository.getSummerHouses().size();
    }

    //   Tüm tipteki evlerin ortalama metrekaresini dönen metot
    public double getAverageSquareMeter() {
        Stream<House> allHouses = Stream.concat(
                Stream.concat(
                        repository.getApartmentHouses().stream(),
                        repository.getVillaHouses().stream()
                ),
                repository.getSummerHouses().stream()
        );

        return allHouses
                .mapToDouble(House::getSquareMeters)
                .average()
                .orElse(0);
    }


    // Oda ve salon sayısına göre tüm tipteki evleri filtreleyip dönen metot. filtrede or kulanıldı.
    public List<House> getHouseByFilters(int roomCount, int hallCount) {
        return Stream.concat(
                        Stream.concat(
                                repository.getApartmentHouses().stream(),
                                repository.getVillaHouses().stream()
                        ),
                        repository.getSummerHouses().stream()
                )
                .filter(house -> house.getRoomCount() == roomCount || house.getHallCount() == hallCount)
                .toList();
    }


}
