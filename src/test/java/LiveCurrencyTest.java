import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class LiveCurrencyTest {

@Test
    public void usdCadCurrencyTest(){
    Response response = given().contentType("application/json").get(Consts.URL+Consts.LIVE_ENDPOINT+Consts.APIKEY+"&currencies=CAD");
    System.out.println(response.asString());
    response.then().statusCode(200);

    }
    @Test
    public void usdEurCurrencyTest(){
        Response response = given().contentType("application/json").get(Consts.URL+Consts.LIVE_ENDPOINT+Consts.APIKEY+"&currencies=EUR");
        System.out.println(response.asString());
        response.then().statusCode(200);
    }
    @Test
    public void usdNisCurrencyTest(){
        Response response = given().contentType("application/json").get(Consts.URL+Consts.LIVE_ENDPOINT+Consts.APIKEY+"&currencies=NIS");
        System.out.println(response.asString());
        response.then().statusCode(200);
    }
    @Test
    public void usdRubCurrencyTest(){
        Response response = given().contentType("application/json").get(Consts.URL+Consts.LIVE_ENDPOINT+Consts.APIKEY+"&currencies=RUB");
        System.out.println(response.asString());
        response.then().statusCode(200);
    }
    @Test
    public void usdUsdCurrencyTest(){
        Response response = given().contentType("application/json").get(Consts.URL+Consts.LIVE_ENDPOINT+Consts.APIKEY+"&currencies=USD");
        System.out.println(response.asString());
        response.then().statusCode(200);
    }
    @Test
    public void usdAllCurrencyTest(){
        Response response = given().contentType("application/json").get(Consts.URL+Consts.LIVE_ENDPOINT+Consts.APIKEY+"&currencies=CAD, EUR, NIS, RUB");
        System.out.println(response.asString());
        response.then().statusCode(200);
    }
    @Test
    public void usdAusincorrectCodeCurrencyTest(){
        Response response = given().contentType("application/json").get(Consts.URL+Consts.LIVE_ENDPOINT+Consts.APIKEY+"&currencies=AUS");
        System.out.println(response.asString());
        response.then().statusCode(200);
    }




}
