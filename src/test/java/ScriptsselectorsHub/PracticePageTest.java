package ScriptsselectorsHub;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class PracticePageTest {
@Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/");
        driver.findElement(By.xpath("//a[text()='PracticePage']")).click();
        //practice page

        WebElement userEmail = driver.findElement(By.xpath("//input[@id='userId']"));
        if (userEmail.isEnabled())
        {
            userEmail.sendKeys("santu@gmail.com");
        }
    }
}
