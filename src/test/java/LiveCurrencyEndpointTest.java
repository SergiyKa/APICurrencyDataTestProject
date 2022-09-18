import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static io.restassured.RestAssured.*;

public class LiveCurrencyEndpointTest {

    private static Response response;

    @BeforeAll
    public static void setup(){
        response = given().contentType("application/json").get(Consts.URL+Consts.LIVE_ENDPOINT+Consts.APIKEY);
        System.out.println(response.asString());

    }
    @Test
    public void getLiveCurrencyResponseCodeTest(){
        response.then().statusCode(200);

    }

}
