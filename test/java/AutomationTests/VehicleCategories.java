package AutomationTests;

public enum VehicleCategories {
    ВЕЛОСИПЕД_GRAPHHOPPER("0"),
    ВЕЛОСИПЕД_OSRM("1"),
    МАШИНА_GRAPHHOPPER("2"),
    МАШИНА_OSRM("3"),
    ПІШКИ_GRAPHHOPPER("4"),
    ПІШКИ_OSRM("5");

    String value;

    VehicleCategories(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}



