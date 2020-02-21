package co.com.certification.dxHotels.interactions;

import co.com.certification.dxHotels.userinterface.BookingTheHotelPage;
import co.com.certification.dxHotels.userinterface.HotelSearchPage;
import co.com.certification.dxHotels.utils.SearchPrice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.awt.print.Book;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SelectPrice implements Interaction {

    @Override
        public <T extends Actor> void performAs(T actor) {
            String min= SearchPrice.cheapest(BookingTheHotelPage.LIST_PRICES.resolveAllFor(actor));
            String last= SearchPrice.lastPrice(BookingTheHotelPage.LIST_PRICES.resolveAllFor(actor));

            actor.attemptsTo(Scroll.to(BookingTheHotelPage.MIN_PRICE.of(last)).andAlignToBottom(),
                Click.on(BookingTheHotelPage.MIN_PRICE.of(min)),
                    WaitUntil.the(BookingTheHotelPage.TOTAL_PRICE, isCurrentlyVisible()),
                    Scroll.to(BookingTheHotelPage.TOTAL_PRICE).andAlignToTop());
        }

        public static SelectPrice cheapest(){
            return Tasks.instrumented(SelectPrice.class);
        }
    }


