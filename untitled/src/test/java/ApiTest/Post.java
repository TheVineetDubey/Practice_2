package ApiTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Post {
    public static void main(String[] args) {

        RestAssured.baseURI = "https://reqres.in";
        String inputBody = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";

        //apa/users additional part can be kept in post.
        Response res = given().body(inputBody).when().post("/api/users").then().extract().response();
        System.out.println(res);
        String resAstring = res.asString();
        System.out.println(resAstring);
        int statuscode = res.statusCode();
        System.out.println("statuscode" + " " + statuscode);

        //given().when().get().then().assertThat().statusCode(200);
    }
}