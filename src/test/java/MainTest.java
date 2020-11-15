import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainTest {

    public static void main(String[] args) {

    System.setProperty("webdriver.gecko.driver", "C:\\Users\\User01\\IdeaProjects\\test-selenium\\drivers\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.manage().window().maximize();

    driver.get("http://en.wikipedia.org");
    driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Selenium WebDriver");
    driver.findElement(By.xpath("//*[@id=\"searchButton\"]")).click();
    System.out.println(driver.findElement(By.xpath("//*[@id=\"ooui-php-1\"]")).getAttribute("value"));
    driver.findElement(By.xpath("//*[@id=\"ooui-php-1\"]")).clear();

    driver.get("https://github.com/");
    driver.findElement(By.xpath("//*[@id=\"user[login]\"]")).sendKeys(" khamitski");
    driver.findElement(By.xpath("//*[@id=\"user[email]\"]")).sendKeys("al.khamitski@gmail.com");
    driver.findElement(By.xpath("//*[@id=\"user[password]\"]")).sendKeys("3582959Di");
    driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div[1]/div/div/div[2]/div[1]/form/button")).click();

    }
}
