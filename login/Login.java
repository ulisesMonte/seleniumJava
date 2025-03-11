package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Login{
    private WebDriver driver;
    public Login(WebDriver driver){
        this.driver = driver;
    }
    public void login(){
        WebElement inputUser = driver.findElement(By.id("usuario"));
        inputUser.sendKeys("admin");

        WebElement inputPassword = driver.findElement(By.id("password"));
        inputPassword.sendKeys("1234");

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

    }
}
