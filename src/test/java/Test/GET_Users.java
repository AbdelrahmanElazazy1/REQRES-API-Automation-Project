package Test;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

//@Listeners(Listener.class)

public class GET_Users {




        @Test
        public void TestCase1() {

            // Get All Users
            RestAssured.baseURI = "https://reqres.in/api";

            given()
                    .when().get("/users")
                    .then().log().all()
                    .statusCode(200)
                    .body("data.users", not(emptyOrNullString()));

        }

    @Test
    public void TestCase2() {

        // Get Specific User
        RestAssured.baseURI = "https://reqres.in/api";

        given()

                .when().get("/users/2")
                .then().log().all()
                .statusCode(200)
                .body("data.user", not(emptyOrNullString()));
    }







}
