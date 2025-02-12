package Test;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class POST_User {

    @Test
    public void TestCase1() {

        // Create New User
        RestAssured.baseURI = "https://reqres.in/api";

        given()
                .header("Content-Type", "application/json")
                .body("{\"name\":\"Abdelrahman\",\"job\":\"QA\"}")
                .when().post("/users")
                .then().log().all()
                .statusCode(201);

    }



}
