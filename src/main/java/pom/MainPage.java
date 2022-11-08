package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private final String url = "https://qa-scooter.praktikum-services.ru/";

    private final By orderStatusButton = By.xpath(".//button[@class='Header_Link__1TAG7']");
    private final By inputOrder = By.xpath(".//div[contains(@class,'Input_InputContainer__3NykH')]/input[contains(@placeholder,'Введите')]");
    private final By goButton = By.xpath(".//button[contains(text(),'Go')]");

    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public MainPage open(){
        driver.get(url);
        return this;
    }

    public MainPage clickOrderStatusButton () {
        driver.findElement(orderStatusButton).click();
        return this;
    }

    public MainPage inputOrder(String text){
        driver.findElement(inputOrder).sendKeys(text);
        return this;
    }

    public MainPage clickGoButton(){
        driver.findElement(goButton).click();
        return this;
    }

    public NotFoundPage notFoundPage(){
        return new NotFoundPage(driver);
    }
}
