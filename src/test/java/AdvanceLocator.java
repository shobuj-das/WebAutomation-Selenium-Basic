import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AdvanceLocator extends DriverSetup {
    @Test
    public void testAdvanceLoacator() throws InterruptedException{
//        webDriver.get("https://www.google.com");
//        WebElement title = webDriver.findElement(By.cssSelector("textarea"));
//        title.sendKeys("CSS Locator");
//        Thread.sleep(2000);
//        title.clear();
//        String values = webDriver.findElement(By.cssSelector(".gNO89b")).getAttribute("role");
//        System.out.println(values);
//
////        webDriver.findElement(By.cssSelector("div[class='KxwPGc SSwjIe'] > div[class='KxwPGc AghGtd'] > a[href=\"https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign=hp-footer&fg=1\"]")).click();
//        System.out.println(webDriver.findElement(By.xpath("//div[@class='KxwPGc SSwjIe'] /div[@class='KxwPGc AghGtd'] /a[@href='https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign=hp-footer&fg=1']")).getText());


        webDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(webDriver.findElement(By.xpath("//th[normalize-space()='Course']")).getText());
    }
}
