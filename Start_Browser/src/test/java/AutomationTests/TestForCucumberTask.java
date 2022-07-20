package AutomationTests;

import org.junit.jupiter.api.*;

public class TestForCucumberTask {

    private StartBrowser browser;

    @BeforeAll
    public static void BeforeAll (){
        System.out.println("Start Test");
    }
    @BeforeEach
    public void BeforeEach(){
        System.out.println("Go");
        browser = new StartBrowser();
    }

    @Test
    public void CheckDistance() throws InterruptedException {
        //GIVEN
        String usefulLink = "https://www.openstreetmap.org/";
        String expectedDistance = "2424km";
        String startPoint = "Радищева, Київ";
        String endPoint = "Кембридж";
        VehicleCategories vehicleCategories = VehicleCategories.ВЕЛОСИПЕД_OSRM;

        //WHEN
        browser.OpenPage(usefulLink);
        browser.setStartPoint(startPoint);
        browser.setEndPoint(endPoint);
        browser.setVehicle(vehicleCategories);

        //THEN
        String actualDistance = browser.checkDistance(expectedDistance);
        Assertions.assertTrue(actualDistance.contains(expectedDistance));

    }

    @AfterEach

    void clean(){

        browser.closeDriver();

    }
}


