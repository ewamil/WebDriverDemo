import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebDriverRadioButtons {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/emilczanowska/Tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C://WebDriverDemo//src//webapp//RadioButtonTest.html");

        List<WebElement> radioButtons = driver.findElements(By.name("color"));
        radioButtons.get(1).click();

        for (WebElement radioButton : radioButtons) {
            if (radioButton.isSelected()) {
                System.out.println(radioButton.getAttribute("value"));
            }
        }
    }
}
