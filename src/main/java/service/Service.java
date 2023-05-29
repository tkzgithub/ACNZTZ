package service;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.ResponseBody;
import logging.Logging;
import pojo.Sandbox;

import static io.restassured.RestAssured.given;


public class Service {

    public Sandbox sendAGetRequestToSandboxAPI()
    {
        ResponseBody response = given().contentType(ContentType.JSON).when()
                .request("GET", "Categories/6327/Details.json?catalogue=false").getBody();

        Gson gson  = new Gson();
        Sandbox sandboxRes= gson.fromJson(response.asString(),Sandbox.class);
        Logging.logInformation(response.prettyPrint());

        return  sandboxRes;
    }
}
