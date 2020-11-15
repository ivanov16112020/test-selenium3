import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class CheckBox3 {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\User01\\IdeaProjects\\test-selenium\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.onliner.by/");
        //переход на сайт
        driver.findElement(By.xpath("//div[text()='Вход']")).click();
        //клик на кнопку Вход
        driver.findElement(By.cssSelector("html.responsive-layout body.no-touch.modal-visible div.modal.modal_open div.modal-dialog div.modal-content div.auth-content div.auth-wrapper div.auth-entry div#auth-container.auth-container.auth-container_max-width_mmmm div.auth-form div.auth-form__body div.auth-container.auth-container_max-width_sssm form div.auth-form__row.auth-form__row_condensed-alter div.auth-form__group.auth-form__group_width_full div.auth-form__row.auth-form__row_condensed-alter div.auth-form__group.auth-form__group_width_full div.auth-form__field div.auth-form__line.auth-form__line_condensed div.auth-input__wrapper.auth-form__input-wrapper.auth-form__input-wrapper_width_full input.auth-input.auth-input_primary.auth-input_base.auth-form__input.auth-form__input_width_full")).sendKeys("testmail.ivanov@inbox.ru");
        //ввод логина по css локатору
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div/div/div[2]/div/form/div[2]/div/div/div/div/input")).sendKeys("i06890689i");
        //ввод пароля по xpath локатору
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div/div/div[2]/div/form/div[3]/button")).click();
        //выполнение входа

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/header/div[3]/div/div[2]/div[2]/div[1]/div[5]/a")).click();





    }
}
