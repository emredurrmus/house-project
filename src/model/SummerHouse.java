package model;


public class SummerHouse extends House {
    public SummerHouse(double price, double area, int rooms, int livingRooms) {
        super(HouseType.SUMMER, price, area, rooms, livingRooms);
    }

    @Override
    public String toString() {
        return "Summer House -> " + super.toString();
    }

}
