package ApiTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.given;

public class ParseJason {
    public static void main(String[] args) {
        RestAssured.baseURI="https://regres.in/";
        Response resofSigleGet=given().when().get("/api/unknown/25").then().extract().response();
        String resofsinglegetstring=resofSigleGet.asString();
        int statusCode=resofSigleGet.statusCode();
        System.out.println(statusCode);
        System.out.println(resofsinglegetstring);

        JsonPath js= new JsonPath(resofsinglegetstring);

        String name =js.get("data.name");
        System.out.println(name);

    }
}
