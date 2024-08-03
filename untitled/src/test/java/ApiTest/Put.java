package ApiTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Put {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in";
        String input = "{\n" +
                "    \"name\": \"Johny Singh\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";

        //apa/users additional part can be kept in post.
        Response res = given().body(input).when().put("/api/users/2").then().extract().response();
        int status = res.statusCode();
        String resAstring = res.asString();
        System.out.println(resAstring);
        System.out.println("statuscode" + " " + status);
    }
}
