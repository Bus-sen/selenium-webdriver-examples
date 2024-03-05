package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticDropDown2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\busra.sen\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("divpaxinfo")).click();
        driver.findElement(By.id("hrefIncAdt")).click(); //adult artırma (increase)
        driver.findElement(By.id("btnclosepaxoption")).click(); //done button
        Thread.sleep(2000);

        // >> birden fazla adult ekleme
        /*for (int i=1; i<5; i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click(); //done button
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());*/
    }
}
