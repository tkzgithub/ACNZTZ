package service;

import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.ResponseBody;
import logging.Logging;
import pojo.Sandbox;
import static io.restassured.RestAssured.given;
/*
 *Project: Assurity Consulting Practical Assessment
 * Author: Tom Zimba
 * Purpose: This class is for getting the response from the API after
 * querying with the GET method
 * @version 1.0.0
 * @since 27 May 2023
 */

public class Service {

    public Sandbox sendAGetRequestToSandboxAPI()
    {
        ResponseBody response = given().contentType(ContentType.JSON).when()
                .request("GET", "Categories/6327/Details.json?catalogue=false").getBody();

        Gson gson  = new Gson();// creating a JSON object
        Sandbox sandboxRes= gson.fromJson(response.asString(),Sandbox.class); //parse and generate JSON
        Logging.logInformation(response.prettyPrint());//print formatted response

        return  sandboxRes;
    }
}
