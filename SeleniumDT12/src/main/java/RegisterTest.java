import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegisterTest {
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
    public void showRegister() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"j_idt19\"]")).click();
        Thread.sleep(500);
        String tx = driver.findElement(By.xpath("//*[@id=\"j_idt32_title\"]")).getText();

        assertEquals("Đăng ký thành viên",tx);
    }
    @Test
    public void CorrectRegister() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"j_idt19\"]")).click();
        Thread.sleep(500);
        WebElement element = driver.findElement(By.name("j_idt36"));
        element.sendKeys("Lê Hồng Ngân");
        WebElement element1 = driver.findElement(By.name("j_idt43"));
        element1.sendKeys("B17DCVT052");
        WebElement element2 = driver.findElement(By.name("j_idt47"));
        element2.sendKeys("robinleequadapro");
        WebElement element3 = driver.findElement(By.name("j_idt45_input"));
        element3.sendKeys("13/10/1999");
        WebElement element4 = driver.findElement(By.name("j_idt49"));
        element4.sendKeys("123456");
        WebElement element5 = driver.findElement(By.name("j_idt52"));
        element5.sendKeys("123456");
        WebElement element6 = driver.findElement(By.name("j_idt60"));
        element6.sendKeys("Hà nội");
        WebElement element7 = driver.findElement(By.name("j_idt74"));
        element7.sendKeys("0326788809");
        WebElement element8 = driver.findElement(By.name("j_idt76"));
        element8.sendKeys("leequadapro@gmail.com");
        driver.findElement(By.name("j_idt38")).click();

        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"j_idt68_label\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"j_idt68_2\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt77\"]/span[2]")).click();
        Thread.sleep(1000);
        String txt = driver.findElement(By.xpath("//*[@id=\"growl_container\"]/div/div/div[2]/span")).getText();

        assertEquals("Thành công",txt);
    }
    @Test
    public void Nullname() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"j_idt19\"]")).click();
        Thread.sleep(500);
        WebElement element = driver.findElement(By.name("j_idt36"));
        element.sendKeys("Lê Hồng Ngân");
        WebElement element1 = driver.findElement(By.name("j_idt43"));
        element1.sendKeys("B17DCVT052");
        WebElement element2 = driver.findElement(By.name("j_idt47"));
        element2.sendKeys("leequadapro");
        WebElement element3 = driver.findElement(By.name("j_idt45_input"));
        element3.sendKeys("13/10/1999");
        WebElement element4 = driver.findElement(By.name("j_idt49"));
        element4.sendKeys("123456");
        WebElement element5 = driver.findElement(By.name("j_idt52"));
        element5.sendKeys("123456");
        WebElement element6 = driver.findElement(By.name("j_idt60"));
        element6.sendKeys("Hà nội");
        WebElement element7 = driver.findElement(By.name("j_idt74"));
        element7.sendKeys("0326788809");
        WebElement element8 = driver.findElement(By.name("j_idt76"));
        element8.sendKeys("leequadapro@gmail.com");
        driver.findElement(By.name("j_idt38")).click();

        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"j_idt68_label\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"j_idt68_2\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt77\"]/span[2]")).click();
        Thread.sleep(1000);

    }
    @Test
    public void NullCode() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"j_idt19\"]")).click();
        Thread.sleep(500);

        WebElement element2 = driver.findElement(By.name("j_idt47"));
        element2.sendKeys("leequadapro");
        WebElement element3 = driver.findElement(By.name("j_idt45_input"));
        element3.sendKeys("13/10/1999");
        WebElement element4 = driver.findElement(By.name("j_idt49"));
        element4.sendKeys("123456");
        WebElement element5 = driver.findElement(By.name("j_idt52"));
        element5.sendKeys("123456");
        WebElement element6 = driver.findElement(By.name("j_idt60"));
        element6.sendKeys("Hà nội");
        WebElement element7 = driver.findElement(By.name("j_idt74"));
        element7.sendKeys("0326788809");
        WebElement element8 = driver.findElement(By.name("j_idt76"));
        element8.sendKeys("leequadapro@gmail.com");
        driver.findElement(By.name("j_idt38")).click();

        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"j_idt68_label\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"j_idt68_2\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt77\"]/span[2]")).click();

    }
    @Test
    public void NullUser() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"j_idt19\"]")).click();
        Thread.sleep(500);
        WebElement element = driver.findElement(By.name("j_idt36"));
        element.sendKeys("Lê Hồng Ngân");
        WebElement element1 = driver.findElement(By.name("j_idt43"));
        element1.sendKeys("B17DCVT052");
        WebElement element3 = driver.findElement(By.name("j_idt45_input"));
        element3.sendKeys("13/10/1999");
        WebElement element4 = driver.findElement(By.name("j_idt49"));
        element4.sendKeys("123456");
        WebElement element5 = driver.findElement(By.name("j_idt52"));
        element5.sendKeys("123456");
        WebElement element6 = driver.findElement(By.name("j_idt60"));
        element6.sendKeys("Hà nội");
        WebElement element7 = driver.findElement(By.name("j_idt74"));
        element7.sendKeys("0326788809");
        WebElement element8 = driver.findElement(By.name("j_idt76"));
        element8.sendKeys("leequadapro@gmail.com");
        driver.findElement(By.name("j_idt38")).click();

        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"j_idt68_label\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"j_idt68_2\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt77\"]/span[2]")).click();

    }
    @Test
    public void NotEqualPassword() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"j_idt19\"]")).click();
        Thread.sleep(500);
        WebElement element = driver.findElement(By.name("j_idt36"));
        element.sendKeys("Lê Hồng Ngân");
        WebElement element1 = driver.findElement(By.name("j_idt43"));
        element1.sendKeys("B17DCVT052");
        WebElement element2 = driver.findElement(By.name("j_idt47"));
        element2.sendKeys("leequadapro");
        WebElement element3 = driver.findElement(By.name("j_idt45_input"));
        element3.sendKeys("13/10/1999");
        WebElement element4 = driver.findElement(By.name("j_idt49"));
        element4.sendKeys("123456");
        WebElement element5 = driver.findElement(By.name("j_idt52"));
        element5.sendKeys("123");
        WebElement element6 = driver.findElement(By.name("j_idt60"));
        element6.sendKeys("Hà nội");
        WebElement element7 = driver.findElement(By.name("j_idt74"));
        element7.sendKeys("0326788809");
        WebElement element8 = driver.findElement(By.name("j_idt76"));
        element8.sendKeys("leequadapro@gmail.com");
        driver.findElement(By.name("j_idt38")).click();

        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"j_idt68_label\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"j_idt68_2\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt77\"]/span[2]")).click();

    }
    @Test
    public void NullDateofBirth() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"j_idt19\"]")).click();
        Thread.sleep(500);
        WebElement element = driver.findElement(By.name("j_idt36"));
        element.sendKeys("Lê Hồng Ngân");
        WebElement element1 = driver.findElement(By.name("j_idt43"));
        element1.sendKeys("B17DCVT052");
        WebElement element2 = driver.findElement(By.name("j_idt47"));
        element2.sendKeys("leequadapro");
        WebElement element4 = driver.findElement(By.name("j_idt49"));
        element4.sendKeys("123456");
        WebElement element5 = driver.findElement(By.name("j_idt52"));
        element5.sendKeys("123456");
        WebElement element6 = driver.findElement(By.name("j_idt60"));
        element6.sendKeys("Hà nội");
        WebElement element7 = driver.findElement(By.name("j_idt74"));
        element7.sendKeys("0326788809");
        WebElement element8 = driver.findElement(By.name("j_idt76"));
        element8.sendKeys("leequadapro@gmail.com");
        driver.findElement(By.name("j_idt38")).click();

        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"j_idt68_label\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"j_idt68_2\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt77\"]/span[2]")).click();

    }
    @Test
    public void Accountalreadyexists() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"j_idt19\"]")).click();
        Thread.sleep(500);
        WebElement element = driver.findElement(By.name("j_idt36"));
        element.sendKeys("Lê Hồng Ngân");
        WebElement element1 = driver.findElement(By.name("j_idt43"));
        element1.sendKeys("B17DCVT052");
        WebElement element2 = driver.findElement(By.name("j_idt47"));
        element2.sendKeys("leequada");
        WebElement element3 = driver.findElement(By.name("j_idt45_input"));
        element3.sendKeys("13/10/1999");
        WebElement element4 = driver.findElement(By.name("j_idt49"));
        element4.sendKeys("123456");
        WebElement element5 = driver.findElement(By.name("j_idt52"));
        element5.sendKeys("123456");
        WebElement element6 = driver.findElement(By.name("j_idt60"));
        element6.sendKeys("Hà nội");
        WebElement element7 = driver.findElement(By.name("j_idt74"));
        element7.sendKeys("0326788809");
        WebElement element8 = driver.findElement(By.name("j_idt76"));
        element8.sendKeys("leequadapro@gmail.com");
        driver.findElement(By.name("j_idt38")).click();

        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"j_idt68_label\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"j_idt68_2\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt77\"]/span[2]")).click();

    }
    @Test
    public void NullAddress() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"j_idt19\"]")).click();
        Thread.sleep(500);
        WebElement element = driver.findElement(By.name("j_idt36"));
        element.sendKeys("Lê Hồng Ngân");
        WebElement element1 = driver.findElement(By.name("j_idt43"));
        element1.sendKeys("B17DCVT052");
        WebElement element2 = driver.findElement(By.name("j_idt47"));
        element2.sendKeys("leequadapro");
        WebElement element3 = driver.findElement(By.name("j_idt45_input"));
        element3.sendKeys("13/10/1999");
        WebElement element4 = driver.findElement(By.name("j_idt49"));
        element4.sendKeys("123456");
        WebElement element5 = driver.findElement(By.name("j_idt52"));
        element5.sendKeys("123456");
        WebElement element7 = driver.findElement(By.name("j_idt74"));
        element7.sendKeys("0326788809");
        WebElement element8 = driver.findElement(By.name("j_idt76"));
        element8.sendKeys("leequadapro@gmail.com");
        driver.findElement(By.name("j_idt38")).click();

        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"j_idt68_label\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"j_idt68_2\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt77\"]/span[2]")).click();

    }
    @Test
    public void NullPhone() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"j_idt19\"]")).click();
        Thread.sleep(500);
        WebElement element = driver.findElement(By.name("j_idt36"));
        element.sendKeys("Lê Hồng Ngân");
        WebElement element1 = driver.findElement(By.name("j_idt43"));
        element1.sendKeys("B17DCVT052");
        WebElement element2 = driver.findElement(By.name("j_idt47"));
        element2.sendKeys("leequadapro");
        WebElement element3 = driver.findElement(By.name("j_idt45_input"));
        element3.sendKeys("13/10/1999");
        WebElement element4 = driver.findElement(By.name("j_idt49"));
        element4.sendKeys("123456");
        WebElement element5 = driver.findElement(By.name("j_idt52"));
        element5.sendKeys("123456");
        WebElement element6 = driver.findElement(By.name("j_idt60"));
        element6.sendKeys("Hà nội");
        WebElement element8 = driver.findElement(By.name("j_idt76"));
        element8.sendKeys("leequadapro@gmail.com");
        driver.findElement(By.name("j_idt38")).click();

        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"j_idt68_label\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"j_idt68_2\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt77\"]/span[2]")).click();

    }
    @Test
    public void NullMail() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"j_idt19\"]")).click();
        Thread.sleep(500);
        WebElement element = driver.findElement(By.name("j_idt36"));
        element.sendKeys("Lê Hồng Ngân");
        WebElement element1 = driver.findElement(By.name("j_idt43"));
        element1.sendKeys("B17DCVT052");
        WebElement element2 = driver.findElement(By.name("j_idt47"));
        element2.sendKeys("leequadapro");
        WebElement element3 = driver.findElement(By.name("j_idt45_input"));
        element3.sendKeys("13/10/1999");
        WebElement element4 = driver.findElement(By.name("j_idt49"));
        element4.sendKeys("123456");
        WebElement element5 = driver.findElement(By.name("j_idt52"));
        element5.sendKeys("123456");
        WebElement element6 = driver.findElement(By.name("j_idt60"));
        element6.sendKeys("Hà nội");
        WebElement element7 = driver.findElement(By.name("j_idt74"));
        element7.sendKeys("0326788809");
        driver.findElement(By.name("j_idt38")).click();

        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"j_idt68_label\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"j_idt68_2\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt77\"]/span[2]")).click();

    }
    @Test
    public void NullPossion() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"j_idt19\"]")).click();
        Thread.sleep(500);
        WebElement element = driver.findElement(By.name("j_idt36"));
        element.sendKeys("Lê Hồng Ngân");
        WebElement element1 = driver.findElement(By.name("j_idt43"));
        element1.sendKeys("B17DCVT052");
        WebElement element2 = driver.findElement(By.name("j_idt47"));
        element2.sendKeys("leequadapro");
        WebElement element3 = driver.findElement(By.name("j_idt45_input"));
        element3.sendKeys("13/10/1999");
        WebElement element4 = driver.findElement(By.name("j_idt49"));
        element4.sendKeys("123456");
        WebElement element5 = driver.findElement(By.name("j_idt52"));
        element5.sendKeys("123456");
        WebElement element6 = driver.findElement(By.name("j_idt60"));
        element6.sendKeys("Hà nội");
        WebElement element7 = driver.findElement(By.name("j_idt74"));
        element7.sendKeys("0326788809");
        WebElement element8 = driver.findElement(By.name("j_idt76"));
        element8.sendKeys("leequadapro@gmail.com");
        driver.findElement(By.name("j_idt38")).click();

        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"j_idt68_label\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"j_idt68_2\"]")).click();

    }

}
