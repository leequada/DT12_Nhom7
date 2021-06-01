import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {
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
    public void ShowLoginPage(){

    }

    @Test
    public void LoginCorrect() throws InterruptedException {// kiem tra nhan vao nut dang nhap man hinh dang nhap hien thi
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/mn_customer.xhtml");
        String fullName = driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[2]/span")).getText();
        assertEquals("leequada",fullName);
    }



    @Test
    public void InvalidUser() throws InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequadapro");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        Thread.sleep(2000);
        String txt = driver.findElement(By.xpath("//*[@id=\"growl_container\"]/div/div/div[2]/span")).getText();
        assertEquals("Tên đăng nhập hoặc mật khẩu không chính xác",txt);
    }
    @Test
    public void InvalidUserandPass() throws InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequadapro");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        Thread.sleep(2000);
        String txt = driver.findElement(By.xpath("//*[@id=\"growl_container\"]/div/div/div[2]/span")).getText();
        assertEquals("Tên đăng nhập hoặc mật khẩu không chính xác",txt);
    }
    @Test
    public void SpecialValid() throws InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("lee qua dap ro");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        Thread.sleep(2000);
        String txt = driver.findElement(By.xpath("//*[@id=\"growl_container\"]/div/div/div[2]/span")).getText();
        assertEquals("Tên đăng nhập hoặc mật khẩu không chính xác",txt);
    }

    @Test
    public void InvalidPass() throws InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        Thread.sleep(2000);
        String txt = driver.findElement(By.xpath("//*[@id=\"growl_container\"]/div/div/div[2]/span")).getText();
        assertEquals("Tên đăng nhập hoặc mật khẩu không chính xác",txt);
    }

    @Test
    public void NullUsername() throws InterruptedException{
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        Thread.sleep(2000);
        String txt = driver.findElement(By.xpath("//*[@id=\"growl_container\"]/div/div/div[2]/span")).getText();
        assertEquals("Bạn phải nhập tên đăng nhập",txt);
    }
    @Test
    public void NullPassword() throws InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        Thread.sleep(2000);
        String txt = driver.findElement(By.xpath("//*[@id=\"growl_container\"]/div/div/div[2]/span")).getText();
        assertEquals("Bạn phải nhập mật khẩu",txt);
    }


}
