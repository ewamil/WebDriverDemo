import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckboxes {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/emilczanowska/Tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C://WebDriverDemo//src//webapp//CheckBoxTest.html");
        WebElement checkbox = driver.findElement(By.id("lettuceCheckBox"));
        checkbox.click();
    }
}
