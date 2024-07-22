package org.ademozalp;

import org.ademozalp.config.ServiceFactory;
import org.ademozalp.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        Service service = ServiceFactory.getService(Service.class);

        log.info("Total price of apartments: {}", service.getTotalPriceApartment());
        log.info("Total price of villas: {}", service.getTotalPriceVilla());
        log.info("Total price of summer houses: {}", service.getTotalPriceSummerHouse());
        log.info("Total price of all houses: {}", service.getTotalPrice());
        log.info("Average square meters of apartments: {}", service.getAverageSquareMeterApartment());
        log.info("Average square meters of villas: {}", service.getAverageSquareMeterVilla());
        log.info("Average square meters of summer houses: {}", service.getAverageSquareMeterSummerHose());
        log.info("Average square meters of houses: {}", service.getAverageSquareMeter());


        service.getHouseByFilters(4, 2).forEach(house -> log.info("Filtered houses: {}", house));



    }
}