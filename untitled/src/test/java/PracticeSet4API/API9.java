package PracticeSet4API;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class API9 {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://automationexercise.com";
        Response res = given()
                .formParam("email", "vinqs1qdan@gmail.com")
                .formParam("password", "yourPassword")
                .when()
                .delete("/api/deleteAccount")
                .then()
                .statusCode(200).extract().response();

        String resAsString = res.asString();
        System.out.println(resAsString);

        if (resAsString.contains("Account deleted!")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
