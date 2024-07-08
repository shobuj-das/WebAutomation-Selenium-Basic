import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action extends DriverSetup{
    @Test
    public void testAction() throws InterruptedException {
        webDriver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Actions action = new Actions(webDriver);
        action.scrollByAmount(0,1000).build().perform();
//        action.scrollToElement(webDriver.findElement(By.xpath("//button[@id='mousehover']"))).build().perform();
        action.clickAndHold(webDriver.findElement(By.xpath("//button[@id='mousehover']"))).build().perform();
        Thread.sleep(2000);
        action.click(webDriver.findElement(By.xpath("//a[normalize-space()='Top']"))).build().perform();
        Thread.sleep(2000);
        action.scrollByAmount(0,1000).build().perform();
        action.clickAndHold(webDriver.findElement(By.xpath("//button[@id='mousehover']"))).build().perform();
        Thread.sleep(2000);
        action.click(webDriver.findElement(By.xpath("//a[normalize-space()='Reload']"))).build().perform();
        Thread.sleep(2000);
    }

    @Test
    public void copyAndPaste() throws InterruptedException{
        webDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Actions actions = new Actions(webDriver);
        actions.sendKeys(webDriver.findElement(By.xpath("//input[@id='autocomplete']")), "Bangladesh").build().perform();
        Thread.sleep(2000);
// select
        actions.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
        Thread.sleep(2000);
// cut - x || copy - c
        actions.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
        Thread.sleep(2000);
// paste
        webDriver.findElement(By.xpath("//input[@id='name']")).click();
        actions.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
        Thread.sleep(2000);
// store the value
        String input_text = webDriver.findElement(By.xpath("//input[@id='autocomplete']")).getAttribute("value");
        System.out.println("input_txt: " + input_text);

    }
}
