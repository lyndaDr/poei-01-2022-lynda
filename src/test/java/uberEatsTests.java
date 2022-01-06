import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class uberEatsTests {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.ubereats.com/fr");
        //pour max la page
        driver.manage().window().maximize();
        WebElement buttonCookies = driver.findElement(new By.
                ByCssSelector("#cookie-banner > div > div > div.ah.gg > button.bc.gh.gi.gl.bj.bk.bl.bm.bn.bo.bt.bu.ba.bb"));
        buttonCookies.click();
    }

    @Test
    public void testCommandeUber (){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Arrange
        String keyword1= "la defense";
        By searchBarSelector1 = By.cssSelector("[placeholder=\"Saisissez l'adresse de livraison.\"]");
        By searchBarSelector2 = By.cssSelector("[alt='Burgers']");
        By searchBarSelector3 = By.cssSelector("a[href='/fr/store/king-marcel-nanterre/07TTIgUiQPWyz4uq4_H35w'] > h3");
        By searchMenuSelector = By.cssSelector("[alt='Le Marcel Jackson']");
        By searchAjoutMenu = By.cssSelector(".spacer._24 + button.b8");

        By cartSelector = By.cssSelector("button[aria-label='checkout'] > div");



    //Act

        WebElement barreRecherche1= driver.findElement(searchBarSelector1);
        barreRecherche1.sendKeys(keyword1);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        barreRecherche1.sendKeys(Keys.ENTER);

        WebElement selectBurger = wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchBarSelector2));
        selectBurger.click();


        WebElement selectRestorant = wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchBarSelector3));
        selectRestorant.click();


       WebElement selectMenu = wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchMenuSelector));
        selectMenu.click();


       WebElement ajoutBurgerPanier = wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchAjoutMenu));
        ajoutBurgerPanier.click();



    //Assert
        WebElement cart = wait.until(
                ExpectedConditions.visibilityOfElementLocated(cartSelector));

        Assert.assertTrue(cart.getText().contains("1"), "le panier est different de 1");

   /* WebElement cart = driver.findElement(cartSelector);
    if ((cart.getText() .equalsIgnoreCase ("1")))
        {
        System.out.println("vide");}
          else  {
            System.out.println("The cart  contain 1 item");
        }*/

  }

  @AfterMethod
  public void tearDown() {
    driver.quit();


    }

}
