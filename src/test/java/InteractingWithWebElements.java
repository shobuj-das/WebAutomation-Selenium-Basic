import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class InteractingWithWebElements extends DriverSetup{

    @Test
    public void testWebElements() throws InterruptedException {

        webDriver.get("https://rahulshettyacademy.com/AutomationPractice/");

//        WebElement input_text_box = webDriver.findElement(By.xpath("//input[@id='autocomplete']"));
//        input_text_box.sendKeys("Web Automation");
//        Thread.sleep(2000);
//        input_text_box.clear();
//        Thread.sleep(2000);
//        input_text_box.sendKeys("Shobuj Das");
//        Thread.sleep(2000);
//        String place_holder_message = input_text_box.getAttribute("placeholder");
//        Assert.assertEquals(place_holder_message, "Type to Select Countries");
//
//        WebElement radio_button_1 = webDriver.findElement(By.xpath("//input[@value='radio1']"));
//        radio_button_1.click();
//        Thread.sleep(2000);
//        boolean radio_button = radio_button_1.isSelected();
//        System.out.println(radio_button);
//
//        WebElement radio_button_2 = webDriver.findElement(By.xpath("//input[@value='radio2']"));
//        radio_button_2.click();
//        System.out.println(radio_button_1.isSelected());
//        Thread.sleep(2000);
//
//        WebElement radio_button_3 = webDriver.findElement(By.xpath("//input[@value='radio3']"));
//        radio_button_3.click();
//        System.out.println(radio_button_2.isSelected());
//        Thread.sleep(2000);
////        radio_button_3.clear();
//
//        WebElement check_box_1 = webDriver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
//        check_box_1.click();
//        Thread.sleep(2000);
//        System.out.println("checkbox 1 clicked: " + check_box_1.isSelected());
//
//        Boolean displayState = webDriver.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
//        System.out.println("Before hide: " + displayState);
//
//        webDriver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
//        displayState = webDriver.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
//        System.out.println("After hide: " + displayState);
//        Thread.sleep(2000);
//
//        webDriver.findElement(By.xpath("//input[@id='show-textbox']")).click();
//        displayState = webDriver.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
//        System.out.println("After show: " + displayState);
//
//        String backgroundColor = webDriver.findElement(By.xpath("//a[@id='opentab']")).getCssValue("background-color");
//        System.out.println(backgroundColor);
//        Assert.assertEquals(backgroundColor, "rgba(57, 148, 154, 1)");

        boolean enableButton = webDriver.findElement(By.xpath("//a[@id='opentab']")).isEnabled();
        Assert.assertTrue(enableButton);

    }

}
