package verificarElementosMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class findElements {

    private WebDriver driver;
    public findElements(WebDriver driver) {
        this.driver = driver;
    }
    public void findElements(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement elementosMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav[@class='menu']//a[text()='Elementos']")));
        elementosMenu.click();
        WebElement buscarElementosSubMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[@class='menu']//ul/li/a[text()='Buscar Elementos']")));
        buscarElementosSubMenu.click();

    }
}
