import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateprofitTest {
    public String baseUrl = "http://localhost:8081/xxx_war_exploded/";
    public WebDriver driver;
    @BeforeEach
    public void initDrive() {
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\chromedriver.exe");
        driver =  new ChromeDriver();
        driver.get(baseUrl);
    }
    @AfterEach
    public void closeDrive() {
        //
    }


    @Test
    public void CalculatePage() throws InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/dashboard.xhtml");

        String name = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[3]/a")).getText();
        assertEquals("Công cụ tính lãi",name);

    }
    @Test
    public void CalculateCorrect() throws  InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/dashboard.xhtml");
        Thread.sleep(500);

        WebElement element1= driver.findElement(By.name("j_idt39_input"));
        element1.sendKeys("10000000");

        WebElement element2 = driver.findElement(By.name("j_idt41_input"));
        element2.clear();
        element2.sendKeys("12");
        WebElement element3 =driver.findElement(By.name("j_idt45_input"));
        element3.sendKeys("5/1/2021");
        WebElement element4 =driver.findElement(By.name("j_idt43_input"));
        element4.sendKeys("10");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"search\"]/span[2]")).click();

    }
    @Test
    public void NullMoney() throws  InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/dashboard.xhtml");
        Thread.sleep(500);



        WebElement element2 = driver.findElement(By.name("j_idt41_input"));
        element2.clear();
        element2.sendKeys("12");
        WebElement element3 =driver.findElement(By.name("j_idt45_input"));
        element3.sendKeys("5/1/2021");
        WebElement element4 =driver.findElement(By.name("j_idt43_input"));
        element4.sendKeys("10");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"search\"]/span[2]")).click();

    }
    @Test
    public void NullMonths() throws  InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/dashboard.xhtml");
        Thread.sleep(500);

        WebElement element1= driver.findElement(By.name("j_idt39_input"));
        element1.sendKeys("10000000");


        WebElement element3 =driver.findElement(By.name("j_idt45_input"));
        element3.sendKeys("5/1/2021");
        WebElement element4 =driver.findElement(By.name("j_idt43_input"));
        element4.sendKeys("10");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"search\"]/span[2]")).click();

    }
    @Test
    public void NullRate() throws  InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/dashboard.xhtml");
        Thread.sleep(500);

        WebElement element1= driver.findElement(By.name("j_idt39_input"));
        element1.sendKeys("10000000");

        WebElement element2 = driver.findElement(By.name("j_idt41_input"));
        element2.clear();
        element2.sendKeys("12");
        WebElement element3 =driver.findElement(By.name("j_idt45_input"));
        element3.sendKeys("5/1/2021");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"search\"]/span[2]")).click();

    }
    @Test
    public void Nulldate() throws  InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/dashboard.xhtml");
        Thread.sleep(500);

        WebElement element1= driver.findElement(By.name("j_idt39_input"));
        element1.sendKeys("10000000");

        WebElement element2 = driver.findElement(By.name("j_idt41_input"));
        element2.clear();
        element2.sendKeys("12");
        WebElement element4 =driver.findElement(By.name("j_idt43_input"));
        element4.sendKeys("10");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"search\"]/span[2]")).click();

    }

    @Test
    public void Reset() throws  InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/dashboard.xhtml");
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"refresh\"]/span[2]")).click();

    }
}
