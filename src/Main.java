import model.*;
import service.HouseService;
import util.HouseUtil;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<HasHouse> residentialHouses = HouseUtil.getResidentialHouseList();
        List<HasHouse> villas = HouseUtil.getVillaList();
        List<HasHouse> summerHouses = HouseUtil.getSummerHouseList();

        // Print Residential Houses
        System.out.println("==============================================");
        System.out.println("Residential Houses:");
        residentialHouses.forEach(System.out::println);

        // Print Villas
        System.out.println("\n==============================================");
        System.out.println("Villas:");
        villas.forEach(System.out::println);

        // Print Summer Houses
        System.out.println("\n==============================================");
        System.out.println("Summer Houses:");
        summerHouses.forEach(System.out::println);


        HouseService houseService = new HouseService();

        // Print the total price for each house
        System.out.println("\n==============================================");
        System.out.println("Total price of residential houses: " + houseService.calculateTotalPrice(residentialHouses));
        System.out.println("Total price of villas: " + houseService.calculateTotalPrice(villas));
        System.out.println("Total price of summer houses: " + houseService.calculateTotalPrice(summerHouses));

        // Print the average area for each house
        System.out.println("\n==============================================");
        System.out.println("Average area of residential houses: " + houseService.calculateAverageArea(residentialHouses));
        System.out.println("Average area of villas: " + houseService.calculateAverageArea(villas));
        System.out.println("Average area of summer houses: " + houseService.calculateAverageArea(summerHouses));


        List<HasHouse> allHouses = HouseUtil.getTotalList(residentialHouses, villas, summerHouses);
        double totalPrice = houseService.calculateTotalPriceForAllTypes(allHouses);
        System.out.println("\n==============================================");
        System.out.println("Total price for all houses: " + totalPrice);


        double averageArea = houseService.calculateAverageAreaForAllTypes(allHouses);
        System.out.println("Average area for all houses: " + averageArea);


        List<HasHouse> filteredHouses = houseService.filterHousesByRoomsAndLivingRooms(allHouses, 4, 3);
        System.out.println("\n==============================================");
        System.out.println("Filtered Houses (4 rooms, 3 living rooms):");
        filteredHouses.forEach(System.out::println);
        System.out.println("==============================================");
    }



}