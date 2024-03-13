package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EndToEnd {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\busra.sen\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();    //One Way & Round Trip & Multicity
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); //Departure city
        driver.findElement(By.cssSelector("a[value='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='IXB'][normalize-space()='Bagdogra (IXB)'])[2]")).click(); //Arrival city
        //System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

        // Calendar
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
            System.out.println("its disabled");
            Assert.assertTrue(true);
        }
        else {
            Assert.assertFalse(false);
        }

        //Checkbox
        driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);

        //Passengers
        for (int i=1; i<5; i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click(); //done button
        //Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 adult");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        //Search button
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

    }
}
