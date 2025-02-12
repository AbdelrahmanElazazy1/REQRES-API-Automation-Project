package Test;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PATCH_USER {

    @Test
    public void TestCase1() {

        // Edit User
        RestAssured.baseURI = "https://reqres.in/api";

        given()
                .header("Content-Type", "application/json")
                .body("{\"name\":\"Abdelrahman11\",\"job\":\"QA\"}")
                .when().patch("/users/728")
                .then().log().all()
                .statusCode(200);

    }
}
