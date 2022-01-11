import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    WebDriver driver;

    //int timeoutSearch = 10;
    By openIphonePageSelector = By.cssSelector(".ac-gn-link-iphone");


    public MainPage(WebDriver driver){

        this.driver = driver;
    }

    public void openIphonePage (){

        driver.findElement(openIphonePageSelector).click();


    }

}