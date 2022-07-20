import AutomationTests.StartBrowser;
import AutomationTests.VehicleCategories;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;



public class StepsToReproduction extends StartBrowser {


    String expectedDistance = "2425";

    @Before
    public void start(){
        System.out.println("GO");
    }

    @After
    public void finish(){
        closeDriver();
    }

    @Given("Electronic navigator")
    public void electronicNavigator() throws InterruptedException {
        OpenPage("https://www.openstreetmap.org/");
    }

    @When("I enter the starting point")
    public void iEnterTheStartingPoint() throws InterruptedException {
        setStartPoint("Радищева, Київ");
    }

    @And("I enter the endpoint")
    public void iEnterTheEndpoint() throws InterruptedException {
        setEndPoint("Кембридж");
    }

    @And("I choose a vehicle")
    public void iChooseAVehicle() throws InterruptedException {
        setVehicle(VehicleCategories.ВЕЛОСИПЕД_OSRM);
    }

    @Then("The distance to the final point should be {int} km")
    public void theDistanceToTheFinalPointShouldBeKm(int arg0) {
        checkDistance(expectedDistance);
        String actualDistance = super.checkDistance(expectedDistance);
        Assertions.assertTrue(actualDistance.contains(expectedDistance));
    }
}
