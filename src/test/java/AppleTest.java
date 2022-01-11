import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AppleTest {


    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.apple.com/fr");
        driver.manage().window().maximize();

    }


    @Test
    public void IPhone13ProMax256GoBleuAlpinTest(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openIphonePage();

        IphonePage iphonePage = new IphonePage(driver);
        iphonePage.openIphone13ProPage();

        Iphone13ProPage iphone13ProPage = new Iphone13ProPage(driver);
        iphone13ProPage.buy();



        BuyIphone13ProPage buyIphone13ProPage = new BuyIphone13ProPage(driver);
        buyIphone13ProPage.selectPro13Max();
        buyIphone13ProPage.selectBlueAlpin();
        buyIphone13ProPage.select256Go();
        buyIphone13ProPage.noAppleTradIn();
        buyIphone13ProPage.addToCart();


        ConfirmationAddToCartPage confirmationAddToCartPage = new ConfirmationAddToCartPage(driver);
        confirmationAddToCartPage.openCartPage();


        CartPage cartPage = new CartPage(driver);



  //Assert
        //ASSERT
        Assert.assertTrue(cartPage.getCartTitle().contains("1 379,00"), "Message d'erreur");
        Assert.assertTrue(cartPage.getCartTitle().contains("iPhone 13 Pro Max 256 Go Bleu Alpin"), "Message Lynda");
        Assert.assertTrue(cartPage.getCartTitle().contains("1 379,00"), "Message Lynda");
        Assert.assertTrue(cartPage.getCartTitle().contains("1 379,00"), "Message Lynda");
        Assert.assertTrue(cartPage.getCartTitle().contains("1 379,00"), "Message Lynda");
    }
}
