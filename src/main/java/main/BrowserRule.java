package main;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class BrowserRule extends ExternalResource {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }




    @Override
    protected void before() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "/Users/alinaslugina/WebDriver/bin/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "/Users/alinaslugina/WebDriver/bin/geckodriver");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

        @Override
    protected void after() {
        driver.quit();

    }

}
