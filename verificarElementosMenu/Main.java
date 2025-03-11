package verificarElementosMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome_driver","src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        Login login = new Login(driver);
        findElements findE = new findElements(driver);
        verifyElements verF = new verifyElements(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.kapa8technologies.com/busqueda_elementos.html");
        wait.until( ExpectedConditions.presenceOfElementLocated(By.id("loginForm")));
        login.login();
        findE.findElements();
        verF.verifyEl();

        driver.quit();
    }
}