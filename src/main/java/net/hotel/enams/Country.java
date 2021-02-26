package net.hotel.enams;

public enum Country {
    USA ("USA"),
    UKRAINE ("Ukrine"),
    UK ("UK");
    private String name;

     Country (String name) {
        this.name=name;
    }

    public String getName() {
        return this.name;
    }
}
