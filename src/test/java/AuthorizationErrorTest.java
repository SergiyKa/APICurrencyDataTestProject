import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AuthorizationErrorTest {

    @Test
    public void unauthorizedKeyTest(){
        Response response = given().contentType("application/json").get(Consts.URL+Consts.LIVE_ENDPOINT+"apikey=7373788fhknkxuzhflgkjh48");
        System.out.println(response.asString());
        response.then().statusCode(401);
        response.then().body("message", containsString("Invalid authentication credentials"));

    }
    @Test
    public void noKeyTest(){
        Response response = given().contentType("application/json").get(Consts.URL+Consts.LIVE_ENDPOINT+"apikey=");
        System.out.println(response.asString());
        response.then().statusCode(401);
        response.then().body("message", containsString("No API key found in request"));
    }
    @Test
    public void zeroValueKeyTest(){
        Response response = given().contentType("application/json").get(Consts.URL+Consts.LIVE_ENDPOINT+"apikey=0");
        System.out.println(response.asString());
        response.then().statusCode(401);
        response.then().body("message", containsString("Invalid authentication credentials"));
    }
    @Test
    public void nullValueKeyTest() {
        Response response = given().contentType("application/json").get(Consts.URL + Consts.LIVE_ENDPOINT + null);
        System.out.println(response.asString());
        response.then().statusCode(401);
        response.then().body("message", containsString("No API key found in request"));

    }
}
