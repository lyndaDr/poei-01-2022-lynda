import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TP1 {
    @Test
    public void test1 () {
        //Démarer chrome
        WebDriver driver = new ChromeDriver();
        //lancer la page google
        driver.get("https://www.amazon.fr");
        //pour max la page
        driver.manage().window().maximize();

        //fermer les cokies
        WebElement buttonCookies = driver.findElement(By.id("sp-cc-accept"));
        buttonCookies.click();

        //Afficher barre de recherche et chercher un produit et clicker sur entrer
        WebElement barreRecherche= driver.findElement(By.id("twotabsearchtextbox"));
        barreRecherche.sendKeys("machine a raclette");
        barreRecherche.sendKeys(Keys.ENTER);

        //selectionner un element par Nom exemple de plus
        // driver.findElement(By.name("field-keywords"));




        //fermer chrome
        //driver.quit();
    }
    @Test
    public void test2 () {

        //Démarer chrome
        WebDriver driver = new ChromeDriver();
        //lancer la page google
        driver.get("https://www.amazon.fr");
        //pour max la page
        driver.manage().window().maximize();

        //fermer les cokies
        WebElement buttonCookies = driver.findElement(By.id("sp-cc-accept"));
        buttonCookies.click();

        //Afficher barre de recherche et chercher un produit et clicker sur entrer
        WebElement barreRecherche= driver.findElement(By.id("twotabsearchtextbox"));
        barreRecherche.sendKeys("machine a raclette");
        barreRecherche.sendKeys(Keys.ENTER);

        //selectionner un element par Nom exemple de plus
        // driver.findElement(By.name("field-keywords"));


        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //1er Resultat de la recherche
        WebElement resultatRecherche= driver.findElement(By.cssSelector("[data-cel-widget='search_result_1']"));
        resultatRecherche.click();

        //Ajouter au panier
        WebElement buttonPanier= driver.findElement(By.id("add-to-cart-button"));
        buttonPanier.click();


        //fermer chrome
        //driver.quit();
    }

}
