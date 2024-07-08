import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ManageABrowser extends DriverSetup{
    @Test
    public void testABrowser() throws InterruptedException{
        webDriver.get("https://www.facebook.com");
        System.out.println(webDriver.getTitle());
        System.out.println(webDriver.getCurrentUrl());
        Thread.sleep(2000);

//        webDriver.get("https://www.google.com");
//        System.out.println(webDriver.getTitle());
//        System.out.println(webDriver.getCurrentUrl());
//        Thread.sleep(2000);
//
//        webDriver.navigate().back();
//        System.out.println("After navigate back: " + webDriver.getTitle());
//        Thread.sleep(2000);
//
//        webDriver.navigate().forward();
//        System.out.println("After navigate forward: " + webDriver.getTitle());
//        Thread.sleep(2000);
//
//        webDriver.navigate().refresh();
//        System.out.println("After refresh: " + webDriver.getTitle());
//        Thread.sleep(2000);

//        webDriver.manage().window().minimize();
//        Thread.sleep(2000);
//        webDriver.manage().window().maximize();
//        Thread.sleep(2000);
//        webDriver.manage().window().fullscreen();
//        Thread.sleep(2000);

        webDriver.switchTo().newWindow(WindowType.TAB);
        webDriver.get("https://www.w3schools.com");
        Thread.sleep(2000);

//        webDriver.close();
//        Thread.sleep(2000);
        List<String> tabs = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs.get(0));
        webDriver.close();
        Thread.sleep(2000);

        webDriver.switchTo().window(tabs.get(1));
        webDriver.switchTo().newWindow(WindowType.WINDOW);
        webDriver.get("https://www.linkedin.com");
        Thread.sleep(2000);

        List<String> window_handles = new ArrayList<>(webDriver.getWindowHandles());
//        for(String window_handle: window_handles)
//            System.out.println(window_handle);

//        webDriver.switchTo().window(window_handles.get(0));
//        Thread.sleep(2000);
//        webDriver.close();


    }
}
