package model;

public class ResidentialHouse extends House {
    public ResidentialHouse(double price, double area, int rooms, int livingRooms) {
        super(HouseType.RESIDENTIAL, price, area, rooms, livingRooms);
    }



}