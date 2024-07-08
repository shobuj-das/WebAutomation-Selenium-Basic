import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropDown extends DriverSetup{
    @Test
    public void handleDropDown() throws InterruptedException {
        webDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement dropdown = webDriver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select select = new Select(dropdown);
        select.selectByIndex(1);
        Thread.sleep(1000);

        select.selectByValue("option3");
        Thread.sleep(1000 );

        select.selectByVisibleText("Option2");
        Thread.sleep(1000);

        List<WebElement> dropdownoptions = select.getOptions();
        for(WebElement option: dropdownoptions)
            System.out.println(option.getText());
    }
}
