import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class HistoricalNegativeTest {

    @Test
    public void usdAllCurrencyYearTest(){
        Response response = given().contentType("application/json").get(Consts.URL+Consts.HISTORIC_ENDPOINT+Consts.APIKEY+"&currencies=CAD, EUR, NIS, RUB&date=2023-01-31");
        System.out.println(response.asString());
        response.then().statusCode(302);
    }
    @Test
    public void usdAllCurrencyMonthTest(){
        Response response = given().contentType("application/json").get(Consts.URL+Consts.HISTORIC_ENDPOINT+Consts.APIKEY+"&currencies=CAD, EUR, NIS, RUB&date=2020-13-31");
        System.out.println(response.asString());
        response.then().statusCode(200);
    }
    @Test
    public void usdAllCurrencyDayTest(){
        Response response = given().contentType("application/json").get(Consts.URL+Consts.HISTORIC_ENDPOINT+Consts.APIKEY+"&currencies=CAD, EUR, NIS, RUB&date=2020-02-31");
        System.out.println(response.asString());
        response.then().statusCode(200);
    }
    @Test
    public void usdAllCurrencyNoDateTest(){
        Response response = given().contentType("application/json").get(Consts.URL+Consts.HISTORIC_ENDPOINT+Consts.APIKEY+"&currencies=CAD, EUR, NIS, RUB&date=");
        System.out.println(response.asString());
        response.then().statusCode(200);
    }
    @Test
    public void usdAllCurrencyZeroValueDateTest(){
        Response response = given().contentType("application/json").get(Consts.URL+Consts.HISTORIC_ENDPOINT+Consts.APIKEY+"&currencies=CAD, EUR, NIS, RUB&date=0000-00-00");
        System.out.println(response.asString());
        response.then().statusCode(200);
    }
    @Test
    public void usdAllCurrencyOldDateTest(){
        Response response = given().contentType("application/json").get(Consts.URL+Consts.HISTORIC_ENDPOINT+Consts.APIKEY+"&currencies=CAD, EUR, NIS, RUB&date=1998-01-01");
        System.out.println(response.asString());
        response.then().statusCode(500);
    }
}
