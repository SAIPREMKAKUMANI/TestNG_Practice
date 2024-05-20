package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest{
    @Test
    public void TestBing() throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bing.com/");
        driver.findElement(By.name("q")).sendKeys("Google", Keys.ENTER);
        System.out.println(driver.getTitle());
        Thread.sleep(10000);
        driver.quit();
    }
}
