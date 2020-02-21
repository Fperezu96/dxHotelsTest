package co.com.certification.dxHotels.model;

import co.com.certification.dxHotels.model.builder.BookingBuilder;

public class Booking {
    private String location;
    private String rooms;
    private String adults;
    private String children;
    private String checkIn;
    private String checkOut;

    public Booking(String location, String rooms, String adults, String children, String checkIn, String checkOut) {
        this.location = location;
        this.rooms = rooms;
        this.adults = adults;
        this.children = children;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getAdults() {
        return adults;
    }

    public void setAdults(String adults) {
        this.adults = adults;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public Booking(BookingBuilder builder) {
        this.location = builder.getLocation();
        this.rooms = builder.getRooms();
        this.adults = builder.getAdults();
        this.children = builder.getChildren();
        this.checkIn = builder.getCheckIn();
        this.checkOut = builder.getCheckOut();
    }

}
