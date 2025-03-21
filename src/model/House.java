package model;

public abstract class House implements HasHouse {
    private double price;
    private double area;
    private int rooms;
    private int livingRooms;
    private HouseType houseType;

    public House(HouseType houseType, double price, double area, int rooms, int livingRooms) {
        this.houseType = houseType;
        this.price = price;
        this.area = area;
        this.rooms = rooms;
        this.livingRooms = livingRooms;
    }

    @Override
    public HouseType getHouseType() {
        return houseType;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int getRooms() {
        return rooms;
    }

    @Override
    public int getLivingRooms() {
        return livingRooms;
    }

    @Override
    public String toString() {
        return houseType.getTypeName() + " [price=" + price + ", area=" + area +
                ", rooms=" + rooms + ", livingRooms=" + livingRooms + "]";
    }
}

