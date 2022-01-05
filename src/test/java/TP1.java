import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TP1 {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        //Implicite wait 2sc ici
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.get("https://www.amazon.fr");
        //pour max la page
        driver.manage().window().maximize();
        WebElement buttonCookies = driver.findElement(By.id("sp-cc-accept"));
        buttonCookies.click();
    }

    @Test
    public void test1 () {

        //Afficher barre de recherche et chercher un produit et clicker sur entrer
        WebElement barreRecherche= driver.findElement(By.id("twotabsearchtextbox"));
        barreRecherche.sendKeys("machine a raclette");
        barreRecherche.sendKeys(Keys.ENTER);

    }
    @Test
    public void test2 () {

        //Afficher barre de recherche et chercher un produit et clicker sur entrer
        WebElement barreRecherche= driver.findElement(By.id("twotabsearchtextbox"));
        barreRecherche.sendKeys("machine a raclette");
        barreRecherche.sendKeys(Keys.ENTER);

        //1er Resultat de la recherche
        WebElement resultatRecherche= driver.findElement(By.cssSelector("[data-cel-widget='search_result_1']"));
        resultatRecherche.click();

        //Ajouter au panier
        WebElement buttonPanier= driver.findElement(By.id("add-to-cart-button"));
        buttonPanier.click();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
    @Test
    public void testExplicitWait() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.findElement(By.id("nav-hamburger-menu")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".hmenu-item[data-menu-id='10']")));
        driver.findElement(By.cssSelector(".hmenu-item[data-menu-id='10']")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("ul.hmenu-visible > li:nth-child(3)")));
        driver.findElement(By.cssSelector("ul.hmenu-visible > li:nth-child(3) > a")).click();
    }
}
