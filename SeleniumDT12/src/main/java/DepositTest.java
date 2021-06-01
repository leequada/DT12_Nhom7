import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositTest {
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
    public void DepositHompage() throws InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/mn_loan.xhtml");

        String name = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[3]/a")).getText();
        assertEquals("Quản lý khoản vay",name);
    }
}
