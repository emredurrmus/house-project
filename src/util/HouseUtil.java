package util;

import model.HasHouse;
import model.ResidentialHouse;
import model.SummerHouse;
import model.Villa;

import java.util.ArrayList;
import java.util.List;

public class HouseUtil {


    public static List<HasHouse> getResidentialHouseList() {
        List<HasHouse> houses = new ArrayList<>();
        houses.add(new ResidentialHouse(100000, 120, 3, 2));
        houses.add(new ResidentialHouse(150000, 150, 4, 3));
        houses.add(new ResidentialHouse(200000, 180, 5, 3));
        return houses;
    }

    public static List<HasHouse> getVillaList() {
        List<HasHouse> villas = new ArrayList<>();
        villas.add(new Villa(300000, 200, 5, 4));
        villas.add(new Villa(350000, 250, 6, 4));
        villas.add(new Villa(400000, 300, 7, 5));
        return villas;
    }

    public static List<HasHouse> getSummerHouseList() {
        List<HasHouse> summerHouses = new ArrayList<>();
        summerHouses.add(new SummerHouse(120000, 90, 2, 1));
        summerHouses.add(new SummerHouse(140000, 100, 3, 2));
        summerHouses.add(new SummerHouse(160000, 120, 3, 2));
        return summerHouses;
    }

    @SafeVarargs
    public static List<HasHouse> getTotalList(List<HasHouse>... lists) {
        List<HasHouse> totalList = new ArrayList<>();

        for (List<HasHouse> list : lists) {
            totalList.addAll(list);
        }

        return totalList;
    }


}
