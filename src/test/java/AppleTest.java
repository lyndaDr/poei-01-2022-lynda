import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ApplTests {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.apple.com/fr/");
        driver.manage().window().maximize();


    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void iphone13AddToCartPriceTest() {


//Arrange

//Act
       /* MainPage mainPage = new MainPage(driver);
        mainPage.openIphone();


        IphonePage iphonePage = new IphonePage(driver);
        iphonePage.openIphone13ProPage();


        Iphone13ProPage iphone13ProPage = new Iphone13ProPage(driver);
        iphone13ProPage.buy();*/

        MainPage mainPage = new MainPage(driver);
        CartPage cartPage = mainPage.IphonePage(productName)
                .openResult(0)
                .addToCart()
                .noCoverage()
                .openCart();


//Assert

    }
}


