package co.com.certification.dxHotels.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BookingTheHotelPage {

    public static final Target LIST_PRICES = Target.the("List Prices").located(By.xpath("//div[@class='night-button']//p[contains(text(),'$')]"));
    public static final Target TOTAL_PRICE = Target.the("Total Price").located(By.xpath("//h4[@class='total-price']"));
    public static final Target MIN_PRICE = Target.the("Min Price").locatedBy("/html/body/div/div/div/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div[{0}]/div/div[2]/div[3]/div/span");

}

