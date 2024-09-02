package PracticeSet4API;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;

public class API6 {
    public static void main(String[] args) {

        RestAssured.baseURI = "https://automationexercise.com";
        String payload = "{\n" +
                "    \"search_product\": \"tshirt\"\n" +
                "}";


        Response res = given().contentType(ContentType.JSON).
                body(payload)
                .when()
                .post("/api/searchProduct")
                .then()
                .statusCode(200).extract().response();

        String resAstring = res.asString();
        System.out.println(resAstring);

        int statuscode=res.statusCode();
        System.out.println("statuscode" +" " + statuscode);

        List<String> productList = res.jsonPath().getList("products");
        given().when().get().then().assertThat().statusCode(200);


    }


}
