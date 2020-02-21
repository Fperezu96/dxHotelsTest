package co.com.certification.dxHotels.task;

import co.com.certification.dxHotels.model.Booking;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static co.com.certification.dxHotels.model.builder.BookingBuilder.defaultConditions;
import static co.com.certification.dxHotels.userinterface.HotelSearchPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HotelSearch implements Task {

    private Booking booking;

    public HotelSearch(String place, String checkin, String checkout) {
        this.booking = defaultConditions()
                .withLocation(place)
                .withCheckIn(checkin)
                .withCheckOut(checkout)
                .build();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LOCATION),
                Click.on(SELECT_LOCATION.of(booking.getLocation())),
                Enter.theValue(booking.getCheckIn()).into(CHECK_IN).thenHit(Keys.ENTER),
                Enter.theValue(booking.getCheckOut()).into(CHECK_OUT),
                Click.on(ROOMS),
                Click.on(SELECTED_HOW_MANY.of(booking.getRooms())),
                Click.on(ADULTS),
                Click.on(SELECTED_HOW_MANY.of(booking.getAdults())),
                Click.on(CHILDREN),
                Click.on(SELECTED_HOW_MANY.of(booking.getChildren())),
                Click.on(BTN_SEARCH));
    }

    public static HotelSearch beforeBooking(String place, String checkin, String checkout)
    {return instrumented(HotelSearch.class, place, checkin, checkout);}

}
