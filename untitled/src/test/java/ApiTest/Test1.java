package ApiTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Test1 {
    public static void main(String[] args) {

        RestAssured.baseURI = "https://reqres.in/API/USERS?PAGE=2";

        Response res = given().when().get().then().extract().response();
        System.out.println(res);
        String resAstring = res.asString();
        System.out.println(resAstring);
    }

}
