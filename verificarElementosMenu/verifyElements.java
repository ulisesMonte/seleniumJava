package verificarElementosMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class verifyElements {

    private WebDriver driver;
    public verifyElements (WebDriver driver){
        this.driver = driver;
    }




    public void verifyEl(){
        if (driver.findElements(By.cssSelector("div.container.main_content")).isEmpty()) {
            System.out.println("El contenedor principal NO existe.");
        } else {
            System.out.println("El contenedor principal existe.");
        }

        String[] items = {
                "//h2[text()='Práctica: Búsqueda de Elementos']",
                "//label[@for='elemento-id']",
                "//input[@id='elemento-id']",
                "//label[text()='Contraseña']",
                "//input[@name='elemento-name']",
                "//label[text()='Botón con CLASS:']",
                "//button[@class='btn-class' and @id='clickButton']",
                "//label[@id='selectedOptionLabel']",
                "//div[@class='xpath-element' and @id='dateDiv']",
                "//label[text()='Enlace con CSS Selector:']",
                "//a[@href='acerca.html' and @class='css-selector']"
        };

        for (String xpath : items) {
            if (driver.findElements(By.xpath(xpath)).isEmpty()) {
                System.out.println("No se encontró: " + xpath);
            } else {
                System.out.println("Se encontró: " + xpath);
            }
        }

    }

}
