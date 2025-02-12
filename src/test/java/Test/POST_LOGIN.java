package Test;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class POST_LOGIN {


    @Test
    public void TestCase1() {

        // Login Page
        RestAssured.baseURI = "https://reqres.in/api";

        given()
                .header("Content-Type", "application/json")
                .body("{\"email\":\"eve.holt@reqres.in\",\"password\":\"cityslicka\"}")
                .when().post("/login")
                .then().log().all()
                .statusCode(200);


    }

}
