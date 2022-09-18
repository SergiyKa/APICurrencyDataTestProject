import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class HistoricalCurrencyTest {

    @Test
    public void usdCadCurrencyTest(){
        Response response = given().contentType("application/json").get(Consts.URL+Consts.HISTORIC_ENDPOINT+Consts.APIKEY+"&currencies=CAD&date=2020-01-31");
        System.out.println(response.asString());
        response.then().statusCode(200);
    }
    @Test
    public void usdEurCurrencyTest(){
        Response response = given().contentType("application/json").get(Consts.URL+Consts.HISTORIC_ENDPOINT+Consts.APIKEY+"&currencies=EUR&date=2020-01-31");
        System.out.println(response.asString());
        response.then().statusCode(200);
    }
    @Test
    public void usdNisCurrencyTest(){
        Response response = given().contentType("application/json").get(Consts.URL+Consts.HISTORIC_ENDPOINT+Consts.APIKEY+"&currencies=NIS&date=2020-01-31");
        System.out.println(response.asString());
        response.then().statusCode(200);
    }
    @Test
    public void usdRubCurrencyTest(){
        Response response = given().contentType("application/json").get(Consts.URL+Consts.HISTORIC_ENDPOINT+Consts.APIKEY+"&currencies=RUB&date=2020-01-31");
        System.out.println(response.asString());
        response.then().statusCode(200);
    }
    @Test
    public void usdAllCurrencyTest(){
        Response response = given().contentType("application/json").get(Consts.URL+Consts.HISTORIC_ENDPOINT+Consts.APIKEY+"&currencies=CAD, EUR, NIS, RUB&date=2020-01-31");
        System.out.println(response.asString());
        response.then().statusCode(200);
    }
}
