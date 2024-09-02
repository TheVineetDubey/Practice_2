package PracticeSet4API;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class API7 {
    public static void main(String[] args) {

        RestAssured.baseURI = "https://automationexercise.com";

        Response res = given().formParam("password","yourPassword")
                .when()
                .post("/api/verifyLogin")
                .then()
                .statusCode(200).extract().response();

        String resAstring = res.asString();
        System.out.println(resAstring);

    }


}
