package PracticeSet4API;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class API4 {
    public static void main(String[] args) {

        RestAssured.baseURI = "https://automationexercise.com";


        Response res = given().when().post("/api/verifyLogin").then().extract().response();
        String resAstring = res.asString();
        System.out.println(resAstring);
        int statuscode=res.statusCode();
        System.out.println("statuscode" +" " + statuscode);

        given().when().get().then().assertThat().statusCode(200);

        //to be done

    }

}

