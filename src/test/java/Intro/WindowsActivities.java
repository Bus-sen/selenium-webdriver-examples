package Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivities {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\busra.sen\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com"); // önce google'a gider
        driver.navigate().to("https://rahulshettyacademy.com"); //sonra buraya gider
        driver.navigate().back(); //google’a geri döner
        driver.navigate().forward(); //tekrar siteye gider

    }
}
