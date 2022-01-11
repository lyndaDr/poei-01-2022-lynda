import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationAddToCartPage {
    WebDriver driver;

    By openCartPageSelector = By.cssSelector("button[value='proceed']");
    public ConfirmationAddToCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openCartPage(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(openCartPageSelector)).click();
    }
}
