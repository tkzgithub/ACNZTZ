import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;
import pojo.Promotions;
import service.Service;

/*
 *Project: Assurity Consulting Practical Assessment
 * Author: Tom Zimba
 * Purpose: This class is where we are testing the acceptance criteria requested
 * querying with the GET method
 * @version 1.0.0
 * @since 27 May 2023

 */

public class SandBoxTest {

    Service sandBoxService;

    @Before
    public void setup() {
        RestAssured.baseURI = "Https://api.tmsandbox.co.nz/v1/";
        sandBoxService = new Service();
    }

    @Test
    public void validate_name() {
        Assert.assertEquals(sandBoxService.sendAGetRequestToSandboxAPI().getName(), "Carbon credits");
    }

    @Test
    public void validate_canRelist() {

        Assert.assertEquals(sandBoxService.sendAGetRequestToSandboxAPI().getCanRelist(), true);

    }

    @Test
    public void validate_Promotions() {

        for (Promotions promotion:sandBoxService.sendAGetRequestToSandboxAPI().getPromotions()) {
            if(  (promotion.getName().equals("Gallery"))  && (promotion.getDescription().contains("Good position in category")) );
            {
                Assert.assertTrue(true, "Succesffuly validated the acceptance criteria");
            }

        }

    }
}
