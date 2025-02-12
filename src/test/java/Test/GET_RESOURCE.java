package Test;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.emptyOrNullString;
import static org.hamcrest.Matchers.not;

public class GET_RESOURCE {

    @Test
    public void TestCase1() {

        // Get All RESOURCES
        RestAssured.baseURI = "https://reqres.in/api";

        given()

                .when().get("/unknown")
                .then().log().all()
                .statusCode(200)
                .body("data.unknown", not(emptyOrNullString()));
    }



    @Test
    public void TestCase2() {

        // Get Specific RESOURCE
        RestAssured.baseURI = "https://reqres.in/api";

        given()

                .when().get("/unknown/2")
                .then().log().all()
                .statusCode(200)
                .body("data.unknown", not(emptyOrNullString()));
    }





}
