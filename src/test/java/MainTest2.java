import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainTest2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\User01\\IdeaProjects\\test-selenium\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://en.wikipedia.org");
        WebElement link = driver.findElement(By.id("n-aboutsite"));
        System.out.println(link.getText());
        link.click();
    }
}
