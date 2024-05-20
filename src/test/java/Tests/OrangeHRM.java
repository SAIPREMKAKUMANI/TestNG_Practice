package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class OrangeHRM{
    WebDriver driver;

    @Test
    public void LaunchApp(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://codeforces.com/enter?back=%2Fcontests");
    }

    @Test
    public void EnterLoginCredentials(){
//        WebDriverManager.edgedriver().setup();
//        driver = new EdgeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("handleOrEmail")).sendKeys("kakumanisaiprem@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Sai@2003");
        driver.findElement(By.className("submit")).click();
    }
}
