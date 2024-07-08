import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;

public class IframeHandle extends DriverSetup{
    @Test
    public void testIFrame() throws InterruptedException {
        webDriver.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement mouseHover = webDriver.findElement(By.xpath("//legend[normalize-space()='iFrame Example']"));

        js.executeScript("arguments[0].scrollIntoView();", mouseHover);
        webDriver.switchTo().frame(0);
        String email = webDriver.findElement(By.xpath("//li[normalize-space()='contact@rahulshettyacademy.com']")).getText();
        System.out.println(email);
        Thread.sleep(2000);
    }
}
