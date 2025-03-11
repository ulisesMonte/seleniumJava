package validarMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome_driver","src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        Login login = new Login(driver);
        findElements findE = new findElements(driver);

        driver.get("https://www.kapa8technologies.com/login.html");

        login.login();

        Thread.sleep(1000);
        findE.findElements();

        driver.quit();
    }
}