package com.aor.refactoring.example6;

public class Location {
    private String locationLatitude;
    private String locationLongitude;
    private String locationName;

    Location(String locationLatitude, String locationLongitude, String locationName){
        this.locationLatitude = locationLatitude;
        this.locationLongitude = locationLongitude;
        this.locationName = locationName;
    }
    public void setLocation(String locationLatitude, String locationLongitude, String locationName) {
        this.locationLatitude = locationLatitude;
        this.locationLongitude = locationLongitude;
        this.locationName = locationName;
    }

    public String getLocationLatitude() {
        return locationLatitude;
    }

    public String getLocationLongitude() {
        return locationLongitude;
    }

    public String getLocationName() {
        return locationName;
    }

    String location(){
        return " in location " + this.locationLatitude + "," + this.locationLongitude + " (" + this.locationName + ")";
    }
}