package model;


public class Villa extends House {
    public Villa(double price, double area, int rooms, int livingRooms) {
        super(HouseType.VILLA, price, area, rooms, livingRooms);
    }


}