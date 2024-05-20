package org.interview2024.restassured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Example1 {

    public ResponseSpecification response;

    @Test
    public void sample() {
        RestAssured.baseURI = "https://fakestoreapi.com/";
        RequestSpecification request = RestAssured.given().log().all();
        Response response=request.get("/products");
        JsonPath js=response.jsonPath();

       List<String> imageList= js.getList("image");
        System.out.println("Total Size is : " +imageList.size());
       for(String e:imageList){
           System.out.println(e);
       }





    }
}