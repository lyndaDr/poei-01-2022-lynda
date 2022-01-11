import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
    WebDriver driver;

    By getCartTitleSelector = By.cssSelector("[data-autom=\"bag-header\"]");
    By getProductNameSelector = By.cssSelector("[data-autom=\"bag-item-name\"]");
    By getProductPriceSelector = By.cssSelector("div[class='rs-iteminfo-price'] p");
    By getSubTotalSelector = By.cssSelector("div[data-autom='bagrs-summary-subtotalvalue']");
    By getTotalSelector = By.cssSelector("div[data-autom='bagtotalvalue']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCartTitle(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(getCartTitleSelector));
        return driver.findElement(getCartTitleSelector).getText();}

    public String getProductName(int index){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(getProductNameSelector));
        return driver.findElements(getProductNameSelector).get(index).getText();}

    public String getProductPrice(int index){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(getProductPriceSelector));
        return driver.findElement(getProductPriceSelector).getText();}

    public String getSubTotal(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(getSubTotalSelector));
        return driver.findElement(getSubTotalSelector).getText();}

    public String getTotal(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(getTotalSelector));
        return driver.findElement(getTotalSelector).getText();}
}