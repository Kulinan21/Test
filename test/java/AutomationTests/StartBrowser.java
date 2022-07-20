package AutomationTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class StartBrowser {

    private static WebDriver driver;
    VehicleCategories vehicleCategories;


    public StartBrowser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Misha\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000L));
    }


    public void OpenPage(String usefulLink) throws InterruptedException {

        driver.get(usefulLink);
        WebElement press = driver.findElement(By.cssSelector("#sidebar .switch_link"));
        press.click();
    }

    public void setStartPoint(String startPoint) throws InterruptedException {

        WebElement start = driver.findElement(By.cssSelector("#sidebar #route_from"));
        start.sendKeys(startPoint);
    }

    public void setEndPoint(String endPoint) throws InterruptedException {

            WebElement start = driver.findElement(By.cssSelector("#sidebar #route_to"));
            start.sendKeys(endPoint);
    }

    public void setVehicle(VehicleCategories vehicleCategories) throws InterruptedException {

        Select selectVehicle = new Select(driver.findElement(By.cssSelector("#sidebar .routing_engines")));
        selectVehicle.selectByValue(vehicleCategories.getValue());
    }

    public String checkDistance(String expectedDistance) {

        WebElement distance = driver.findElement(By.xpath("//*[@id=\"sidebar_content\"]/p[1]"));
        return distance.getText();
    }

    public void closeDriver (){
        driver.close();
    }
}

