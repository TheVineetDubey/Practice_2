package ApiTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Pract {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://api.coindesk.com";


        Response res = given().when().get("/v1/bpi/currentprice.json").then().extract().response();
        String resAstring = res.asString();
        System.out.println(resAstring);
        int statuscode=res.statusCode();
        System.out.println("statuscode" +" " + statuscode);

        given().when().get().then().assertThat().statusCode(200);

        Response res1 = given().when().get("/v1/bpi/currentprice.json").then().extract().response();
        String res1Astring = res1.asString();
        System.out.println(res1Astring);
        int statuscode1=res.statusCode();
        System.out.println("statuscode" +" " + statuscode1);




    }

}

