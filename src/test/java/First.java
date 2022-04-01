import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","./DriverExe/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://education.github.com/git-cheat-sheet-education.pdf");

    }
}
