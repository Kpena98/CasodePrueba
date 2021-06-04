import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class casoDePrueba {
    WebDriver driver;

    public casoDePrueba() {

    }

    public String casoSelenium1() {
        String resultado = "";

        resultado = driver.findElement(By.xpath("/html/body/h1")).getText();

        return resultado;
    }

    @Before
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://192.168.102.129:8082/Prueba_2020");
        Thread.sleep(3000);
    }

    @Test
    public void casoSelenium1Test() {
        Assert.assertEquals("Hola Mundo Tsoft 2021", casoSelenium1());
        System.out.println("El test avanzo con exito");
    }

    @After
    public void after() {
        driver.quit();
    }
}


