package co.com.certification.dxHotels.model.builder;

import co.com.certification.dxHotels.utils.Builder;
import co.com.certification.dxHotels.model.Booking;
import co.com.certification.dxHotels.utils.ConstantsValues;
import co.com.certification.dxHotels.utils.GetDate;


public class BookingBuilder implements Builder<Booking> {

    private String location;
    private String rooms;
    private String adults;
    private String children;
    private String checkIn;
    private String checkOut;

    public BookingBuilder(String location, String rooms, String adults, String children, String checkIn, String checkOut) {
        this.location = location;
        this.rooms = rooms;
        this.adults = adults;
        this.children = children;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public BookingBuilder() {
        this.location = "Los Angeles";
        this.rooms = ConstantsValues.ONE;
        this.adults = ConstantsValues.ONE;
        this.children = ConstantsValues.ONE;
        this.checkIn = GetDate.today();
        this.checkOut = GetDate.tomorrow();
    }

    public static BookingBuilder defaultConditions() {
        return new BookingBuilder();
    }

    public BookingBuilder withLocation(String location) {
        this.location = location;
        return this;
    }
    public BookingBuilder withRooms(String rooms) {
        this.location = location;
        return this;
    }
    public BookingBuilder withChildren(String children) {
        this.location = location;
        return this;
    }
    public BookingBuilder withCheckIn(String checkIn) {
        this.checkIn = checkIn;
        return this;
    }
    public BookingBuilder withCheckOut(String checkOut) {
        this.checkOut = checkOut;
        return this;
    }
    public String getLocation() {
        return location;
    }

    public String getRooms() {
        return rooms;
    }

    public String getAdults() {
        return adults;
    }

    public String getChildren() {
        return children;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    @Override
    public Booking build() {
        return new Booking(this);
    }
}
