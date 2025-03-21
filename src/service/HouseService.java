package service;

import model.HasHouse;

import java.util.List;
import java.util.stream.Collectors;

public class HouseService {
    public double calculateTotalPrice(List<HasHouse> houses) {
        return houses.stream()
                .mapToDouble(HasHouse::getPrice)
                .sum();
    }

    public double calculateAverageArea(List<HasHouse> houses) {
        return houses.stream()
                .mapToDouble(HasHouse::getArea)
                .average()
                .orElse(0);
    }

    public double calculateTotalPriceForAllTypes(List<? extends HasHouse> houses) {
        return houses.stream()
                .mapToDouble(HasHouse::getPrice)
                .sum();
    }

    public double calculateAverageAreaForAllTypes(List<? extends HasHouse> houses) {
        return houses.stream()
                .mapToDouble(HasHouse::getArea)
                .average()
                .orElse(0);
    }

    public List<HasHouse> filterHousesByRoomsAndLivingRooms(List<HasHouse> houses, int rooms, int livingRooms) {
        return houses.stream()
                .filter(house -> hasRequiredRoomsAndLivingRooms(house, rooms, livingRooms))
                .collect(Collectors.toList());
    }

    private boolean hasRequiredRoomsAndLivingRooms(HasHouse house, int rooms, int livingRooms) {
        return house.getRooms() == rooms && house.getLivingRooms() == livingRooms;
    }

}
