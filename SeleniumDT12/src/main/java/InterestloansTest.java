import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InterestloansTest {
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
    public void showLoansPage() throws InterruptedException {
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/mn_Information.xhtml");
        String name = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[3]/a")).getText();

        assertEquals("Danh sách phê duyệt",name);
    }
    @Test
    public void ConfirmTest() throws InterruptedException {
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/mn_Information.xhtml");

       driver.findElement(By.xpath("//*[@id=\"tblSearchResult:0:j_idt79\"]")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id=\"j_idt110\"]/span[2]")).click();
        Thread.sleep(2000);
        String txt = driver.findElement(By.xpath("//*[@id=\"growl_container\"]/div/div/div[2]/span")).getText();
        assertEquals("Thành công",txt);
    }
    @Test
    public void CacelConfirmTest() throws InterruptedException {
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/mn_Information.xhtml");
        String name = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[3]/a")).getText();

        driver.findElement(By.xpath("//*[@id=\"tblSearchResult:0:j_idt79\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt111\"]/span[2]")).click();
        Thread.sleep(2000);
        /* String txt = driver.findElement(By.xpath("//*[@id=\"tblSearchResult:0:j_idt50\"]")).getText();
        assertEquals("Lê Quang Đạo",txt);

         */
    }

    @Test
    public void CancelTest() throws InterruptedException {
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/mn_Information.xhtml");
        String name = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[3]/a")).getText();

        driver.findElement(By.xpath("//*[@id=\"tblSearchResult:0:j_idt84\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt110\"]/span[2]")).click();
        Thread.sleep(2000);
        String txt = driver.findElement(By.xpath("//*[@id=\"growl_container\"]/div/div/div[2]/span")).getText();
        assertEquals("Xóa thành công",txt);
    }
    @Test
    public void CancelCancelTest() throws InterruptedException {
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/mn_Information.xhtml");
        String name = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[3]/a")).getText();

        driver.findElement(By.xpath("//*[@id=\"tblSearchResult:0:j_idt84\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt111\"]/span[2]")).click();
        Thread.sleep(2000);
        /*String txt = driver.findElement(By.xpath("//*[@id=\"tblSearchResult:0:j_idt50\"]")).getText();
        assertEquals("Lê Quang Đạo",txt);

         */
    }


}
