import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.sourceforge.htmlunit.cyberneko.HTMLEntities.get;

public class WebDriverDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/emilczanowska/Tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        WebElement searchField = driver.findElement(By.id("lst-ib"));
        searchField.sendKeys("pluralsight");
        searchField.submit();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Grafika")));

        WebElement imagesLink = driver.findElement(By.linkText("Grafika"));
        imagesLink.click();

        WebElement imageElement = driver.findElement(By.id("RoPQRZPodTVxGM:"));
//        WebElement imageLink = imageElement.findElements(By.tagName("image")).get(0);
        imageElement.click();
    }
}
