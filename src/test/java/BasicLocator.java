import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicLocator extends DriverSetup{
    @Test
    public void loadAPage() throws InterruptedException {

        webDriver.get("https://www.google.com");

//        System.out.println(webDriver.getTitle());
//        System.out.println(webDriver.getCurrentUrl());
//        Assert.assertEquals(webDriver.getTitle(), "Google");
//        Assert.assertEquals(webDriver.getCurrentUrl(), "https://www.google.com/");


/* *********************
Google search bar locator
************************/

//        webDriver.findElement(By.id("APjFqb")).sendKeys("Hello");
//        webDriver.findElement(By.className("gLFyf")).sendKeys("Hello");
//        webDriver.findElement(By.name("q")).sendKeys("Hello");
//        webDriver.findElement(By.tagName("textarea")).sendKeys("Hello");
//        webDriver.findElement(By.partialLinkText("সার্চ কীভাবে")).click();
//        webDriver.findElement(By.cssSelector("textarea[aria-controls=\"Alh6id\"]")).sendKeys("Hello");
//        webDriver.findElement(By.cssSelector("textarea[aria-controls='Alh6id']")).sendKeys("hello friends");
//        webDriver.findElement(By.xpath("//textarea[@aria-controls='Alh6id']")).sendKeys("hello friends");

/* *********************
         Gmail locator
************************/
//        webDriver.findElement(By.className("gb_I")).click();
//        webDriver.findElement(By.linkText("Gmail")).click();
//        webDriver.findElement(By.partialLinkText("Gma")).click();
//        webDriver.findElement(By.tagName("a")).click();
//        webDriver.findElement(By.cssSelector("a[aria-label=\"Gmail \"]")).click();
//        webDriver.findElement(By.xpath("//a[@aria-label=\"Gmail \"]")).click();

//        Assert.assertEquals(webDriver.getCurrentUrl(), "https://www.google.com/intl/en-US/gmail/about/");

/* *********************
        Google Images locator
************************/
//        webDriver.findElement(By.className("gb_I")).click();   ** Gmail and Images has same class name **
//        webDriver.findElement(By.tagName("a")).click();        ** Gmail and Images has same class name **
//        webDriver.findElement(By.linkText("Images")).click();
//        webDriver.findElement(By.partialLinkText("Imag")).click();
//        webDriver.findElement(By.cssSelector("a[data-pid=\"2\"]")).click();
//        webDriver.findElement(By.xpath("//a[@data-pid=\"2\"]")).click();

//        Assert.assertEquals(webDriver.getCurrentUrl(), "https://www.google.com/imghp?hl=bn&ogbl");

/* *********************
        Sign in
************************/
//        webDriver.findElement(By.className("gb_Md")).click();  ** Failed for both className
//        webDriver.findElement(By.linkText("সাইন-ইন করুন")).click();
//        webDriver.findElement(By.partialLinkText("সাইন-ইন ক")).click();
//        webDriver.findElement(By.cssSelector("a[aria-label=\"সাইন-ইন করুন\"]")).click();
//        webDriver.findElement(By.xpath("//a[@aria-label=\"সাইন-ইন করুন\"]")).click();
//        Assert.assertEquals(webDriver.getTitle(), "প্রবেশ করুন - Google অ্যাকাউন্টস");
//        Assert.assertEquals(webDriver.getCurrentUrl(), "https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fwww.google.com%2F&ec=GAZAmgQ&hl=bn&ifkv=AS5LTARIF9DQRf29nfDFIOfLrmYeYiEzBoqoODj90PahBNa8CW770y1PdCJuctW8AGVhO7__YkMZcw&passive=true&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1610795060%3A1719058397434212&ddm=0");

/* *********************
Google app locator
************************/
//        webDriver.findElement(By.className("gb_d")).click();
//        webDriver.findElement(By.cssSelector("a[aria-label=\"Google অ্যাপ্লিকেশানগুলি\"]")).click();
//        webDriver.findElement(By.xpath("//a[@aria-label=\"Google অ্যাপ্লিকেশানগুলি\"]")).click();

/* *********************
Google About Section
************************/
//        webDriver.findElement(By.linkText("সম্পর্কে")).click();
//        webDriver.findElement(By.className("pHiOh")).click();

// -------------------------------------------------------------------------
//        webDriver.findElement(By.id("APjFqb")).sendKeys("Hello");
//        Thread.sleep(5000);
//        webDriver.findElement(By.name("btnK")).click();

//        Thread.sleep(10000);
    }
}
