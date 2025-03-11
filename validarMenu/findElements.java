package validarMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class findElements {

    private WebDriver driver;
    public findElements(WebDriver driver) {
        this.driver = driver;
    }
    public void findElements(){
        if (driver.findElements(By.cssSelector("nav.menu")).isEmpty()) {
            System.out.println("El menú principal NO existe.");
        } else {
            System.out.println("El menú principal existe.");
        }

        String[] items = {
                "//nav[@class='menu']//a[text()='Elementos']",
                "//nav[@class='menu']//a[text()='Formulario']",
                "//nav[@class='menu']//a[text()='Cerrar sesión']",
                "//nav[@class='menu']//a[text()='Buscar Elementos']",
                "//nav[@class='menu']//a[text()='Interactuar con Elementos']",
                "//nav[@class='menu']//a[text()='Llenar Formulario']",
                "//nav[@class='menu']//a[text()='Validar Tablas']"
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
