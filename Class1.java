import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Class1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/BEYZA TUNA/Downloads/selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();

        // navigate to Amazon.com
        driver.get("https://www.amazon.com");

        //login
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("add your e-mail");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("add your password");
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();

        // search for an item
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
        driver.findElement(By.xpath("//*[@value='Go']")).click();

        // Add the first item to cart (you can replace it with any item name on amazon if line 31 didn't work )
        driver.findElement(By.linkText("Acer Chromebook 311 Laptop | AMD A-Series Dual-Core A4-9120C | 11.6\" HD Display | AMD Radeon R4 Graphics | 4GB DDR4 | 64GB eMMC | 802.11ac WiFi 5 | Bluetooth 4.2 | Chrome OS | CB311-10H-42LY")).click();
        driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
        driver.findElement(By.xpath("//*[@id='hlb-ptc-btn-native']")).click();

        // Close the browser
        driver.close();


    }
}
