package stepDefs.youtubeStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class youtubeUIStepDef {

    private WebDriver driver;

    private Logger logger = LoggerFactory.getLogger(youtubeUIStepDef.class);

    @Given("^We have installed the proper Webdrivers '(.*)'$")
    public void weInstalledOurDriver(String driverType){
        logger.info("This is our driver: " + driverType);
        if (driverType.equals("chrome")){
            driver = new ChromeDriver();
            logger.info("We have accessed chrome driver");
        }
        if (driverType.equals("edge")){
            driver = new EdgeDriver();
            logger.info("We have accessed edge driver");
        }
        if (driverType.equals("firefox")){
            driver = new FirefoxDriver();
            logger.info("We have accessed firefox driver");
        }
    }

    @When("^I activate the given web driver$")
    public void ourDriverIsLive(){
        Assertions.assertNotNull(driver);
    }

    @Then("^I will be brought to youtube's page with the proper browser$")
    public void weAccessYoutubeSite(){
        driver.get("https://youtube.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement searchBar = driver.findElement(By.xpath("//input[@id=\"search\"]"));
        String criteria = "Elden Ring Malenia";
        searchBar.click();
        searchBar.sendKeys(criteria, Keys.RETURN);
    }



}