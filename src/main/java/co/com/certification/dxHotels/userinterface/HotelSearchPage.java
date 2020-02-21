package co.com.certification.dxHotels.userinterface;


import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HotelSearchPage {

    public static final Target LOCATION = Target.the("Location").located(By.xpath("//*[contains(@id,'location')]"));
    public static final Target SELECT_LOCATION = Target.the("Select Location").locatedBy("//div[@class='dx-item dx-list-item']//div[contains(text(),'{0}')]");
    public static final Target CHECK_IN = Target.the("Check In").located(By.xpath("//*[contains(@id,'checkIn')]"));
    public static final Target CHECK_OUT = Target.the("Check In").located(By.xpath("//*[contains(@id,'checkOut')]"));
    public static final Target ROOMS = Target.the("Rooms").located(By.xpath("//*[contains(@id,'rooms')]"));
    public static final Target SELECTED_HOW_MANY = Target.the("Select How Many").locatedBy("/html/body/div/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[{0}]/div");
    public static final Target ADULTS = Target.the("Adults").located(By.xpath("//*[contains(@id,'adults')]"));
    public static final Target CHILDREN = Target.the("Children").located(By.xpath("//*[contains(@id,'children')]"));
    public static final Target BTN_SEARCH = Target.the("Search").located(By.xpath("//span[contains(text(),'SEARCH')]"));

}

