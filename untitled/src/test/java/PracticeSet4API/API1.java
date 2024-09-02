package PracticeSet4API;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class API1 {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://automationexercise.com/api/productsList";


        Response res = given().when().get().then().extract().response();
        String resAstring = res.asString();
        System.out.println(resAstring);
        int statuscode=res.statusCode();
        System.out.println("statuscode" +" " + statuscode);

        given().when().get().then().assertThat().statusCode(200);
    }

}
