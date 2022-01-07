import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class MainPage {
    int timeOut = 10;
    WebDriver driver;
    By searchBarSelector = By.id("twotabsearchtextbox");
    By searchResultSelector = By.id("[data-component-type='s-search-result']");

    public MainPage(WebDriver driver) {
        this.driver= driver;

    }
    public void searchProduct(String product){
        driver.findElement(searchBarSelector).sendKeys(product + Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        wait.until(ExpectedConditions.elementToBeClickable(searchResultSelector));
    }
}
