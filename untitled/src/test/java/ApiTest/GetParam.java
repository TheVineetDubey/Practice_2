package ApiTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetParam {

        public static void main(String[] args) {

            RestAssured.baseURI = "https://reqres.in/API/USERS";


            Response res = given().queryParam("page",2).when().get().then().extract().response();
            System.out.println(res);
            String resAstring = res.asString();
            System.out.println(resAstring);
            int statuscode=res.statusCode();
            System.out.println("statuscode" +" " + statuscode);

            given().when().get().then().assertThat().statusCode(200);
        }

    }

