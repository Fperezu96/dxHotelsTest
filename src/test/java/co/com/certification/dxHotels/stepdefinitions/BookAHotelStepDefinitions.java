package co.com.certification.dxHotels.stepdefinitions;

import co.com.certification.dxHotels.interactions.SelectPrice;
import co.com.certification.dxHotels.questions.CheckBooking;
import co.com.certification.dxHotels.task.HotelSearch;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.certification.dxHotels.utils.ConstantsValues.DX_HOTELS_HOME;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BookAHotelStepDefinitions {

    @Managed
    private WebDriver browser;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(browser)));
        theActorCalled("Felipe");
    }

    @Given("^the user opens the booking site$")
    public void the_user_opens_the_booking_site(){
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(DX_HOTELS_HOME));
    }

    @When("^the user is planning to travel to (.+) since (.+) to (.+)$")
    public void the_user_is_planning_to_travel_to_since_to(String place, String checkin, String checkout){
        theActorInTheSpotlight().attemptsTo(HotelSearch.beforeBooking(place, checkin, checkout));
        theActorInTheSpotlight().attemptsTo(SelectPrice.cheapest());
    }

      @Then("^should see the total (.+) for reservation$")
    public void shouldSeeTheReservationCosts(int price) {
          theActorInTheSpotlight().should(seeThat(String.valueOf(price), CheckBooking.totalPrice()));
    }
}
