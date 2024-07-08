import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
    public WebDriver webDriver;

    @BeforeSuite
    public void openABrowser(){
        webDriver = new ChromeDriver();
    }

    @AfterSuite
    public void closeBrowser(){
        webDriver.quit();
    }
}
