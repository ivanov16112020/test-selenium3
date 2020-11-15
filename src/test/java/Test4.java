import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Test4 {

    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\User01\\IdeaProjects\\test-selenium\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.onliner.by/");
        //зашли на сайт
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/header/div[2]/div/nav/ul[1]/li[1]/a[2]/span")).click();
        //перешли в каталог
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/ul/li[5]")).click();
        //выбрали стройка и ремонт
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[3]/div/div[4]/div[1]/div/div[1]/div[1]")).click();
        //выбрали инструмент
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[3]/div/div[4]/div[1]/div/div[1]/div[2]/div/a[2]")).click();
        //выбрали перфораторы

        selectCheckBox("Bosch");
        selectCheckBox("Makita");
        selectCheckBox("Wortex");

        deselectCheckBox("Wortex");

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div[2]/div[4]/div[3]/div[4]/div[1]/div/div[3]/div[1]/div/div/div[2]/a")).click();
        //переходим к предложениям от продавцов
        
    }

    public static void selectCheckBox(String name) {
        String cbXpath = "//span[text()='%s']/preceding-sibling::span";
        if (!driver.findElement(By.xpath(String.format(cbXpath, name) + "/input")).isSelected())
            driver.findElement(By.xpath(String.format(cbXpath, name))).click();
            //метод для выбора чекбоксов по локатору
    }

    public static void deselectCheckBox(String name) {
        String cbXpath = "//span[text()='%s']/preceding-sibling::span";
        if (driver.findElement(By.xpath(String.format(cbXpath, name) + "/input")).isSelected())
            driver.findElement(By.xpath(String.format(cbXpath, name))).click();
            //метод для снятия чекбоксов по локатору. отличие "!"
    }

}