package co.com.certification.dxHotels.questions;

import co.com.certification.dxHotels.userinterface.BookingTheHotelPage;
import co.com.certification.dxHotels.userinterface.HotelSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CheckBooking implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        String totalPrice = Text.of(BookingTheHotelPage.TOTAL_PRICE).viewedBy(actor).asString();
        return totalPrice;
    }

    public static CheckBooking totalPrice() {
        return new CheckBooking();
    }
}
