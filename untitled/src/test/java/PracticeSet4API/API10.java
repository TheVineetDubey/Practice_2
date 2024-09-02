package PracticeSet4API;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class API10 {
    public static void main(String[] args) {
            RestAssured.baseURI = "https://automationexercise.com";

            Response res = given().formParam("name", "Vineet")
                    .formParam("email", "vinqs1qdan@gmail.com")
                    .formParam("password", "yourPassword")
                    .formParam("title", "Mr")
                    .formParam("birth_date", "01")
                    .formParam("birth_month", "01")
                    .formParam("birth_year", "1995")
                    .formParam("firstname", "Vineet")
                    .formParam("lastname", "Dubey")
                    .formParam("company", "novaCorp")
                    .formParam("address1", "gzb")
                    .formParam("address2", "gzb")
                    .formParam("country", "gzb")
                    .formParam("zipcode", "12345")
                    .formParam("state", "up")
                    .formParam("city", "Los Angeles")
                    .formParam("mobile_number", "1234567890")
                    .when()
                    .put("/api/updateAccount")
                    .then()
                    .statusCode(200).extract().response();

            String resAstring = res.asString();
            System.out.println(resAstring);

            if (resAstring.contains("User updated")){
                System.out.println("Test Passed");
            }
            else
                System.out.println("failed");
        }
    }

