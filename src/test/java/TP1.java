import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TP1 {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
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

        //selectionner un element par Nom exemple de plus
        // driver.findElement(By.name("field-keywords"));
    }
    @Test
    public void test2 () {

        
        //Afficher barre de recherche et chercher un produit et clicker sur entrer
        WebElement barreRecherche= driver.findElement(By.id("twotabsearchtextbox"));
        barreRecherche.sendKeys("machine a raclette");
        barreRecherche.sendKeys(Keys.ENTER);

        //selectionner un element par Nom exemple de plus
        // driver.findElement(By.name("field-keywords"));


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //1er Resultat de la recherche
        WebElement resultatRecherche= driver.findElement(By.cssSelector("[data-cel-widget='search_result_1']"));
        resultatRecherche.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Ajouter au panier
        WebElement buttonPanier= driver.findElement(By.id("add-to-cart-button"));
        buttonPanier.click();

    }

    @AfterMethod
    public void teardown() {
        driver.quit();

    }

}
