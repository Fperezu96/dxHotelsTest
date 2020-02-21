package co.com.certification.dxHotels.utils;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;


public class SearchPrice {

    public static String cheapest(List<WebElementFacade> prices) {
        int precioMenor = Integer.parseInt(prices.get(0).getText().replace("$", "").replace(".", "").trim());
        int indice = 0;

        for (int i = 0; i < prices.size(); i++) {
            int precio = Integer.parseInt(prices.get(i).getText().replace("$", "").replace(".", "").trim());
            if (precioMenor>precio){
                precioMenor= precio;
                indice= i;
            }
        }

    return String.valueOf(indice+1);
    }
    public static String lastPrice(List<WebElementFacade> prices) {
        return String.valueOf(prices.size());

    }
}
