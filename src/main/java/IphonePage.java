import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IphonePage {

    WebDriver driver;

    int timeoutSearch = 10;
    By iphone13ProResultSelector = By.cssSelector(".chapternav-item-iphone-13-pro ");

    public IphonePage(WebDriver driver){
        this.driver = driver;
    }


    public void openIphone13ProPage(){

        driver.findElement(iphone13ProResultSelector).click();


    }
}