package Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {

    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\busra.sen\\Downloads\\chromedriver.exe"); //hangi tarayıcı ve yolu
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        //System.out.println(driver.getTitle()); //başlık yazdırıyor
    }
}
