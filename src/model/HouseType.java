package model;

import java.util.Arrays;

public enum HouseType {
    RESIDENTIAL("Residential House"),
    VILLA("Villa"),
    SUMMER("Summer House");


    private final String typeName;

    HouseType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

}
