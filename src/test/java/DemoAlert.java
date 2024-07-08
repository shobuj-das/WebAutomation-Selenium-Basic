import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAlert extends DriverSetup{
    By resutlText = By.xpath("//p[@id='result']");
    public void loadSite(){
        webDriver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void alertButtonFunction() throws InterruptedException {
        loadSite();
        By alertButton = By.xpath("//button[@onclick='jsAlert()']");
        webDriver.findElement(alertButton).click();
        Alert alert = webDriver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        alert.accept();
        Assert.assertEquals(webDriver.findElement(resutlText).getText() , "You successfully clicked an alert");
        Thread.sleep(2000);
    }
    @Test
    public void confirmAlertButtonFunction() throws InterruptedException{
        loadSite();
        By confirmAlertButton = By.xpath("//button[normalize-space()='Click for JS Confirm']");
        webDriver.findElement(confirmAlertButton).click();
        Alert alert = webDriver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        System.out.println(webDriver.findElement(resutlText).getText());
        webDriver.findElement(confirmAlertButton).click();
        alert.dismiss();
        System.out.println(webDriver.findElement(resutlText).getText());
    }
    @Test
    public void promptAlertButtonFunction() throws InterruptedException {
        loadSite();
        By promptAlertButton = By.xpath("//button[@onclick='jsPrompt()']");
        String name = "Shobuj Das";
        webDriver.findElement(promptAlertButton).click();
        Alert alert = webDriver.switchTo().alert();
        Thread.sleep(1000);
        alert.sendKeys(name);
        alert.accept();
        Assert.assertEquals(webDriver.findElement(resutlText).getText(), "You entered: Shobuj Das");
        Thread.sleep(1000);
        webDriver.findElement(promptAlertButton).click();
        alert = webDriver.switchTo().alert();
        Thread.sleep(1000);
        alert.dismiss();
        Assert.assertEquals(webDriver.findElement(resutlText).getText(), "You entered: null");
    }
}
