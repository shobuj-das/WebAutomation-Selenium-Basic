import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlert extends DriverSetup{
    @Test
    public void handleAlert() throws InterruptedException{
        webDriver.get("https://the-internet.herokuapp.com/javascript_alerts");

        By alertButton = By.xpath("//button[@onclick='jsAlert()']");
        By confirmAlertButton = By.xpath("//button[normalize-space()='Click for JS Confirm']");
        By promptAlertButton = By.xpath("//button[@onclick='jsPrompt()']");
        By resutlText = By.xpath("//p[@id='result']");

//        webDriver.findElement(alertButton).click();
//        Alert alert = webDriver.switchTo().alert();
//        String alertText = alert.getText();
//        System.out.println(alertText);
//        alert.accept();
//        Assert.assertEquals(webDriver.findElement(resutlText).getText() , "You successfully clicked an alert");
//        Thread.sleep(2000);

//        webDriver.findElement(confirmAlertButton).click();
//        Alert alert = webDriver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();
//        System.out.println(webDriver.findElement(resutlText).getText());
//        webDriver.findElement(confirmAlertButton).click();
//        alert.dismiss();
//        System.out.println(webDriver.findElement(resutlText).getText());

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
