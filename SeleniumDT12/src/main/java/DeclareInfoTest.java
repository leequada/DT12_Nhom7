import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeclareInfoTest {
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
    public void DeclareInfoPage() throws InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/mn_customer.xhtml");

        String name = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[3]/a")).getText();

        assertEquals("Quản lý khách hàng",name);
    }

    @Test
    public void CorrectAllValid() throws InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/mn_customer.xhtml");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt98\"]")).click();
        Thread.sleep(1000);

        WebElement element13 = driver.findElement(By.name("j_idt61"));
        element13.sendKeys("Lê Hồng Ngân");
        WebElement element1= driver.findElement(By.name("j_idt65"));
        element1.sendKeys("0325666524");
        WebElement element2= driver.findElement(By.name("j_idt63_input"));
        element2.sendKeys("30/11/1999");
        WebElement element3= driver.findElement(By.name("j_idt67"));
        element3.sendKeys("leequada@gmail.com");
        WebElement element4= driver.findElement(By.name("j_idt69"));
        element4.sendKeys("Hoàng Mai , Hà Nội");
        WebElement element5= driver.findElement(By.name("j_idt71"));
        element5.sendKeys("001099012356");
        WebElement element6= driver.findElement(By.name("j_idt80"));
        element6.sendKeys("Sinh viên");
        WebElement element7= driver.findElement(By.name("j_idt84"));
        element7.sendKeys("PTIT");
        WebElement element8= driver.findElement(By.name("j_idt82_input"));
        element8.sendKeys("10000000");
        WebElement element9= driver.findElement(By.name("j_idt86_input"));
        element9.sendKeys("50000000");
        WebElement element10= driver.findElement(By.name("j_idt90"));
        element10.sendKeys("Đi du học");
        Thread.sleep(1000);


        WebElement element11= driver.findElement(By.name("j_idt88_input"));
        element11.clear();
        element11.sendKeys("11");
        WebElement element12= driver.findElement(By.name("j_idt92"));
        element12.clear();
        element12.sendKeys("12");


        driver.findElement(By.xpath("//*[@id=\"j_idt73_label\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt73_3\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt93\"]/span[2]")).click();
        String tx = driver.findElement(By.xpath("//*[@id=\"growl_container\"]/div/div/div[2]/span")).getText();

        assertEquals("Thành công",tx);

    }

    @Test
    public void NullName() throws InterruptedException {
        WebElement element = driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/mn_customer.xhtml");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt98\"]")).click();
        Thread.sleep(1000);


        WebElement element1 = driver.findElement(By.name("j_idt65"));
        element1.sendKeys("0325666524");
        WebElement element2 = driver.findElement(By.name("j_idt63_input"));
        element2.sendKeys("30/11/1999");
        WebElement element3 = driver.findElement(By.name("j_idt67"));
        element3.sendKeys("leequada@gmail.com");
        WebElement element4 = driver.findElement(By.name("j_idt69"));
        element4.sendKeys("Hoàng Mai , Hà Nội");
        WebElement element5 = driver.findElement(By.name("j_idt71"));
        element5.sendKeys("001099012356");
        WebElement element6 = driver.findElement(By.name("j_idt80"));
        element6.sendKeys("Sinh viên");
        WebElement element7 = driver.findElement(By.name("j_idt84"));
        element7.sendKeys("PTIT");
        WebElement element8 = driver.findElement(By.name("j_idt82_input"));
        element8.sendKeys("10000000");
        WebElement element9 = driver.findElement(By.name("j_idt86_input"));
        element9.sendKeys("50000000");
        WebElement element10 = driver.findElement(By.name("j_idt90"));
        element10.sendKeys("Đi du học");
        Thread.sleep(1000);


        WebElement element11 = driver.findElement(By.id("j_idt88_input"));
        element11.sendKeys("10");
        WebElement element12 = driver.findElement(By.name("j_idt92"));
        element12.clear();
        element12.sendKeys("12");


        driver.findElement(By.xpath("//*[@id=\"j_idt73_label\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt73_3\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt93\"]/span[2]")).click();


    }
    @Test
    public void NullPhone() throws InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/mn_customer.xhtml");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt98\"]")).click();
        Thread.sleep(1000);

        WebElement element13 = driver.findElement(By.name("j_idt61"));
        element13.sendKeys("Lê Hồng Ngân");
        WebElement element2= driver.findElement(By.name("j_idt63_input"));
        element2.sendKeys("30/11/1999");
        WebElement element3= driver.findElement(By.name("j_idt67"));
        element3.sendKeys("leequada@gmail.com");
        WebElement element4= driver.findElement(By.name("j_idt69"));
        element4.sendKeys("Hoàng Mai , Hà Nội");
        WebElement element5= driver.findElement(By.name("j_idt71"));
        element5.sendKeys("001099012356");
        WebElement element6= driver.findElement(By.name("j_idt80"));
        element6.sendKeys("Sinh viên");
        WebElement element7= driver.findElement(By.name("j_idt84"));
        element7.sendKeys("PTIT");
        WebElement element8= driver.findElement(By.name("j_idt82_input"));
        element8.sendKeys("10000000");
        WebElement element9= driver.findElement(By.name("j_idt86_input"));
        element9.sendKeys("50000000");
        WebElement element10= driver.findElement(By.name("j_idt90"));
        element10.sendKeys("Đi du học");
        Thread.sleep(1000);


        WebElement element11= driver.findElement(By.id("j_idt88_input"));
        element11.sendKeys("10");
        WebElement element12= driver.findElement(By.name("j_idt92"));
        element12.clear();
        element12.sendKeys("12");


        driver.findElement(By.xpath("//*[@id=\"j_idt73_label\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt73_3\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt93\"]/span[2]")).click();

    }
    @Test
    public void NullDateofBirth() throws InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/mn_customer.xhtml");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt98\"]")).click();
        Thread.sleep(1000);

        WebElement element13 = driver.findElement(By.name("j_idt61"));
        element13.sendKeys("Lê Hồng Ngân");
        WebElement element1= driver.findElement(By.name("j_idt65"));
        element1.sendKeys("0325666524");
        WebElement element3= driver.findElement(By.name("j_idt67"));
        element3.sendKeys("leequada@gmail.com");
        WebElement element4= driver.findElement(By.name("j_idt69"));
        element4.sendKeys("Hoàng Mai , Hà Nội");
        WebElement element5= driver.findElement(By.name("j_idt71"));
        element5.sendKeys("001099012356");
        WebElement element6= driver.findElement(By.name("j_idt80"));
        element6.sendKeys("Sinh viên");
        WebElement element7= driver.findElement(By.name("j_idt84"));
        element7.sendKeys("PTIT");
        WebElement element8= driver.findElement(By.name("j_idt82_input"));
        element8.sendKeys("10000000");
        WebElement element9= driver.findElement(By.name("j_idt86_input"));
        element9.sendKeys("50000000");
        WebElement element10= driver.findElement(By.name("j_idt90"));
        element10.sendKeys("Đi du học");
        Thread.sleep(1000);


        WebElement element11= driver.findElement(By.name("j_idt88_input"));
        element11.clear();
        element11.sendKeys("11");
        WebElement element12= driver.findElement(By.name("j_idt92"));
        element12.clear();
        element12.sendKeys("12");


        driver.findElement(By.xpath("//*[@id=\"j_idt73_label\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt73_3\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt93\"]/span[2]")).click();

    }
    @Test
    public void NullEmail() throws InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/mn_customer.xhtml");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt98\"]")).click();
        Thread.sleep(1000);

        WebElement element13 = driver.findElement(By.name("j_idt61"));
        element13.sendKeys("Lê Hồng Ngân");
        WebElement element1= driver.findElement(By.name("j_idt65"));
        element1.sendKeys("0325666524");
        WebElement element2= driver.findElement(By.name("j_idt63_input"));
        element2.sendKeys("30/11/1999");
        WebElement element4= driver.findElement(By.name("j_idt69"));
        element4.sendKeys("Hoàng Mai , Hà Nội");
        WebElement element5= driver.findElement(By.name("j_idt71"));
        element5.sendKeys("001099012356");
        WebElement element6= driver.findElement(By.name("j_idt80"));
        element6.sendKeys("Sinh viên");
        WebElement element7= driver.findElement(By.name("j_idt84"));
        element7.sendKeys("PTIT");
        WebElement element8= driver.findElement(By.name("j_idt82_input"));
        element8.sendKeys("10000000");
        WebElement element9= driver.findElement(By.name("j_idt86_input"));
        element9.sendKeys("50000000");
        WebElement element10= driver.findElement(By.name("j_idt90"));
        element10.sendKeys("Đi du học");
        Thread.sleep(1000);


        WebElement element11= driver.findElement(By.name("j_idt88_input"));
        element11.clear();
        element11.sendKeys("11");
        WebElement element12= driver.findElement(By.name("j_idt92"));
        element12.clear();
        element12.sendKeys("12");


        driver.findElement(By.xpath("//*[@id=\"j_idt73_label\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt73_3\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt93\"]/span[2]")).click();

    }
    @Test
    public void NullAddress() throws InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/mn_customer.xhtml");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt98\"]")).click();
        Thread.sleep(1000);

        WebElement element13 = driver.findElement(By.name("j_idt61"));
        element13.sendKeys("Lê Hồng Ngân");
        WebElement element1= driver.findElement(By.name("j_idt65"));
        element1.sendKeys("0325666524");
        WebElement element2= driver.findElement(By.name("j_idt63_input"));
        element2.sendKeys("30/11/1999");
        WebElement element3= driver.findElement(By.name("j_idt67"));
        element3.sendKeys("leequada@gmail.com");
        WebElement element5= driver.findElement(By.name("j_idt71"));
        element5.sendKeys("001099012356");
        WebElement element6= driver.findElement(By.name("j_idt80"));
        element6.sendKeys("Sinh viên");
        WebElement element7= driver.findElement(By.name("j_idt84"));
        element7.sendKeys("PTIT");
        WebElement element8= driver.findElement(By.name("j_idt82_input"));
        element8.sendKeys("10000000");
        WebElement element9= driver.findElement(By.name("j_idt86_input"));
        element9.sendKeys("50000000");
        WebElement element10= driver.findElement(By.name("j_idt90"));
        element10.sendKeys("Đi du học");
        Thread.sleep(1000);


        WebElement element11= driver.findElement(By.name("j_idt88_input"));
        element11.clear();
        element11.sendKeys("11");
        WebElement element12= driver.findElement(By.name("j_idt92"));
        element12.clear();
        element12.sendKeys("12");


        driver.findElement(By.xpath("//*[@id=\"j_idt73_label\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt73_3\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt93\"]/span[2]")).click();

    }
    @Test
    public void NullCMND() throws InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/mn_customer.xhtml");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt98\"]")).click();
        Thread.sleep(1000);

        WebElement element13 = driver.findElement(By.name("j_idt61"));
        element13.sendKeys("Lê Hồng Ngân");
        WebElement element1= driver.findElement(By.name("j_idt65"));
        element1.sendKeys("0325666524");
        WebElement element2= driver.findElement(By.name("j_idt63_input"));
        element2.sendKeys("30/11/1999");
        WebElement element3= driver.findElement(By.name("j_idt67"));
        element3.sendKeys("leequada@gmail.com");
        WebElement element4= driver.findElement(By.name("j_idt69"));
        element4.sendKeys("Hoàng Mai , Hà Nội");
        WebElement element6= driver.findElement(By.name("j_idt80"));
        element6.sendKeys("Sinh viên");
        WebElement element7= driver.findElement(By.name("j_idt84"));
        element7.sendKeys("PTIT");
        WebElement element8= driver.findElement(By.name("j_idt82_input"));
        element8.sendKeys("10000000");
        WebElement element9= driver.findElement(By.name("j_idt86_input"));
        element9.sendKeys("50000000");
        WebElement element10= driver.findElement(By.name("j_idt90"));
        element10.sendKeys("Đi du học");
        Thread.sleep(1000);


        WebElement element11= driver.findElement(By.name("j_idt88_input"));
        element11.clear();
        element11.sendKeys("11");
        WebElement element12= driver.findElement(By.name("j_idt92"));
        element12.clear();
        element12.sendKeys("12");


        driver.findElement(By.xpath("//*[@id=\"j_idt73_label\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt73_3\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt93\"]/span[2]")).click();

    }
    @Test
    public void NullJob() throws InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/mn_customer.xhtml");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt98\"]")).click();
        Thread.sleep(1000);

        WebElement element13 = driver.findElement(By.name("j_idt61"));
        element13.sendKeys("Lê Hồng Ngân");
        WebElement element1= driver.findElement(By.name("j_idt65"));
        element1.sendKeys("0325666524");
        WebElement element2= driver.findElement(By.name("j_idt63_input"));
        element2.sendKeys("30/11/1999");
        WebElement element3= driver.findElement(By.name("j_idt67"));
        element3.sendKeys("leequada@gmail.com");
        WebElement element4= driver.findElement(By.name("j_idt69"));
        element4.sendKeys("Hoàng Mai , Hà Nội");
        WebElement element5= driver.findElement(By.name("j_idt71"));
        element5.sendKeys("001099012356");
        WebElement element7= driver.findElement(By.name("j_idt84"));
        element7.sendKeys("PTIT");
        WebElement element8= driver.findElement(By.name("j_idt82_input"));
        element8.sendKeys("10000000");
        WebElement element9= driver.findElement(By.name("j_idt86_input"));
        element9.sendKeys("50000000");
        WebElement element10= driver.findElement(By.name("j_idt90"));
        element10.sendKeys("Đi du học");
        Thread.sleep(1000);


        WebElement element11= driver.findElement(By.name("j_idt88_input"));
        element11.clear();
        element11.sendKeys("11");
        WebElement element12= driver.findElement(By.name("j_idt92"));
        element12.clear();
        element12.sendKeys("12");


        driver.findElement(By.xpath("//*[@id=\"j_idt73_label\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt73_3\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt93\"]/span[2]")).click();

    }
    @Test
    public void NullCompany() throws InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/mn_customer.xhtml");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt98\"]")).click();
        Thread.sleep(1000);

        WebElement element13 = driver.findElement(By.name("j_idt61"));
        element13.sendKeys("Lê Hồng Ngân");
        WebElement element1= driver.findElement(By.name("j_idt65"));
        element1.sendKeys("0325666524");
        WebElement element2= driver.findElement(By.name("j_idt63_input"));
        element2.sendKeys("30/11/1999");
        WebElement element3= driver.findElement(By.name("j_idt67"));
        element3.sendKeys("leequada@gmail.com");
        WebElement element4= driver.findElement(By.name("j_idt69"));
        element4.sendKeys("Hoàng Mai , Hà Nội");
        WebElement element5= driver.findElement(By.name("j_idt71"));
        element5.sendKeys("001099012356");
        WebElement element6= driver.findElement(By.name("j_idt80"));
        element6.sendKeys("Sinh viên");
        WebElement element8= driver.findElement(By.name("j_idt82_input"));
        element8.sendKeys("10000000");
        WebElement element9= driver.findElement(By.name("j_idt86_input"));
        element9.sendKeys("50000000");
        WebElement element10= driver.findElement(By.name("j_idt90"));
        element10.sendKeys("Đi du học");
        Thread.sleep(1000);


        WebElement element11= driver.findElement(By.name("j_idt88_input"));
        element11.clear();
        element11.sendKeys("11");
        WebElement element12= driver.findElement(By.name("j_idt92"));
        element12.clear();
        element12.sendKeys("12");


        driver.findElement(By.xpath("//*[@id=\"j_idt73_label\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt73_3\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt93\"]/span[2]")).click();

    }
    @Test
    public void NullSalary() throws InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/mn_customer.xhtml");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt98\"]")).click();
        Thread.sleep(1000);

        WebElement element13 = driver.findElement(By.name("j_idt61"));
        element13.sendKeys("Lê Hồng Ngân");
        WebElement element1= driver.findElement(By.name("j_idt65"));
        element1.sendKeys("0325666524");
        WebElement element2= driver.findElement(By.name("j_idt63_input"));
        element2.sendKeys("30/11/1999");
        WebElement element3= driver.findElement(By.name("j_idt67"));
        element3.sendKeys("leequada@gmail.com");
        WebElement element4= driver.findElement(By.name("j_idt69"));
        element4.sendKeys("Hoàng Mai , Hà Nội");
        WebElement element5= driver.findElement(By.name("j_idt71"));
        element5.sendKeys("001099012356");
        WebElement element6= driver.findElement(By.name("j_idt80"));
        element6.sendKeys("Sinh viên");
        WebElement element7= driver.findElement(By.name("j_idt84"));
        element7.sendKeys("PTIT");
        WebElement element9= driver.findElement(By.name("j_idt86_input"));
        element9.sendKeys("50000000");
        WebElement element10= driver.findElement(By.name("j_idt90"));
        element10.sendKeys("Đi du học");
        Thread.sleep(1000);


        WebElement element11= driver.findElement(By.name("j_idt88_input"));
        element11.clear();
        element11.sendKeys("11");
        WebElement element12= driver.findElement(By.name("j_idt92"));
        element12.clear();
        element12.sendKeys("12");


        driver.findElement(By.xpath("//*[@id=\"j_idt73_label\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt73_3\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt93\"]/span[2]")).click();

    }
    @Test
    public void NullLoan() throws InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/mn_customer.xhtml");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt98\"]")).click();
        Thread.sleep(1000);

        WebElement element13 = driver.findElement(By.name("j_idt61"));
        element13.sendKeys("Lê Hồng Ngân");
        WebElement element1= driver.findElement(By.name("j_idt65"));
        element1.sendKeys("0325666524");
        WebElement element2= driver.findElement(By.name("j_idt63_input"));
        element2.sendKeys("30/11/1999");
        WebElement element3= driver.findElement(By.name("j_idt67"));
        element3.sendKeys("leequada@gmail.com");
        WebElement element4= driver.findElement(By.name("j_idt69"));
        element4.sendKeys("Hoàng Mai , Hà Nội");
        WebElement element5= driver.findElement(By.name("j_idt71"));
        element5.sendKeys("001099012356");
        WebElement element6= driver.findElement(By.name("j_idt80"));
        element6.sendKeys("Sinh viên");
        WebElement element7= driver.findElement(By.name("j_idt84"));
        element7.sendKeys("PTIT");
        WebElement element8= driver.findElement(By.name("j_idt82_input"));
        element8.sendKeys("10000000");
        WebElement element10= driver.findElement(By.name("j_idt90"));
        element10.sendKeys("Đi du học");
        Thread.sleep(1000);


        WebElement element11= driver.findElement(By.name("j_idt88_input"));
        element11.clear();
        element11.sendKeys("11");
        WebElement element12= driver.findElement(By.name("j_idt92"));
        element12.clear();
        element12.sendKeys("12");


        driver.findElement(By.xpath("//*[@id=\"j_idt73_label\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt73_3\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt93\"]/span[2]")).click();

    }
    @Test
    public void NullReasson() throws InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/mn_customer.xhtml");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt98\"]")).click();
        Thread.sleep(1000);

        WebElement element13 = driver.findElement(By.name("j_idt61"));
        element13.sendKeys("Lê Hồng Ngân");
        WebElement element1= driver.findElement(By.name("j_idt65"));
        element1.sendKeys("0325666524");
        WebElement element2= driver.findElement(By.name("j_idt63_input"));
        element2.sendKeys("30/11/1999");
        WebElement element3= driver.findElement(By.name("j_idt67"));
        element3.sendKeys("leequada@gmail.com");
        WebElement element4= driver.findElement(By.name("j_idt69"));
        element4.sendKeys("Hoàng Mai , Hà Nội");
        WebElement element5= driver.findElement(By.name("j_idt71"));
        element5.sendKeys("001099012356");
        WebElement element6= driver.findElement(By.name("j_idt80"));
        element6.sendKeys("Sinh viên");
        WebElement element7= driver.findElement(By.name("j_idt84"));
        element7.sendKeys("PTIT");
        WebElement element8= driver.findElement(By.name("j_idt82_input"));
        element8.sendKeys("10000000");
        WebElement element9= driver.findElement(By.name("j_idt86_input"));
        element9.sendKeys("50000000");
        Thread.sleep(1000);


        WebElement element11= driver.findElement(By.name("j_idt88_input"));
        element11.clear();
        element11.sendKeys("11");
        WebElement element12= driver.findElement(By.name("j_idt92"));
        element12.clear();
        element12.sendKeys("12");


        driver.findElement(By.xpath("//*[@id=\"j_idt73_label\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt73_3\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt93\"]/span[2]")).click();

    }
    @Test
    public void NullType() throws InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/mn_customer.xhtml");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt98\"]")).click();
        Thread.sleep(1000);

        WebElement element13 = driver.findElement(By.name("j_idt61"));
        element13.sendKeys("Lê Hồng Ngân");
        WebElement element1= driver.findElement(By.name("j_idt65"));
        element1.sendKeys("0325666524");
        WebElement element2= driver.findElement(By.name("j_idt63_input"));
        element2.sendKeys("30/11/1999");
        WebElement element3= driver.findElement(By.name("j_idt67"));
        element3.sendKeys("leequada@gmail.com");
        WebElement element4= driver.findElement(By.name("j_idt69"));
        element4.sendKeys("Hoàng Mai , Hà Nội");
        WebElement element5= driver.findElement(By.name("j_idt71"));
        element5.sendKeys("001099012356");
        WebElement element6= driver.findElement(By.name("j_idt80"));
        element6.sendKeys("Sinh viên");
        WebElement element7= driver.findElement(By.name("j_idt84"));
        element7.sendKeys("PTIT");
        WebElement element8= driver.findElement(By.name("j_idt82_input"));
        element8.sendKeys("10000000");
        WebElement element9= driver.findElement(By.name("j_idt86_input"));
        element9.sendKeys("50000000");
        WebElement element10= driver.findElement(By.name("j_idt90"));
        element10.sendKeys("Đi du học");
        Thread.sleep(1000);


        WebElement element11= driver.findElement(By.name("j_idt88_input"));
        element11.clear();
        element11.sendKeys("11");
        WebElement element12= driver.findElement(By.name("j_idt92"));
        element12.clear();
        element12.sendKeys("12");



        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt93\"]/span[2]")).click();

    }
    @Test
    public void NullMonths() throws InterruptedException{
        WebElement element= driver.findElement(By.name("j_idt11"));
        element.sendKeys("leequada");
        WebElement element_pass = driver.findElement(By.name("j_idt13"));
        element_pass.sendKeys("hangvip");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"j_idt15\"]")).click();
        driver.get("http://localhost:8081/xxx_war_exploded/mn_customer.xhtml");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt98\"]")).click();
        Thread.sleep(1000);

        WebElement element13 = driver.findElement(By.name("j_idt61"));
        element13.sendKeys("Lê Hồng Ngân");
        WebElement element1= driver.findElement(By.name("j_idt65"));
        element1.sendKeys("0325666524");
        WebElement element2= driver.findElement(By.name("j_idt63_input"));
        element2.sendKeys("30/11/1999");
        WebElement element3= driver.findElement(By.name("j_idt67"));
        element3.sendKeys("leequada@gmail.com");
        WebElement element4= driver.findElement(By.name("j_idt69"));
        element4.sendKeys("Hoàng Mai , Hà Nội");
        WebElement element5= driver.findElement(By.name("j_idt71"));
        element5.sendKeys("001099012356");
        WebElement element6= driver.findElement(By.name("j_idt80"));
        element6.sendKeys("Sinh viên");
        WebElement element7= driver.findElement(By.name("j_idt84"));
        element7.sendKeys("PTIT");
        WebElement element8= driver.findElement(By.name("j_idt82_input"));
        element8.sendKeys("10000000");
        WebElement element9= driver.findElement(By.name("j_idt86_input"));
        element9.sendKeys("50000000");
        WebElement element10= driver.findElement(By.name("j_idt90"));
        element10.sendKeys("Đi du học");
        Thread.sleep(1000);


        WebElement element11= driver.findElement(By.name("j_idt88_input"));
        element11.clear();
        element11.sendKeys("11");
        WebElement element12= driver.findElement(By.name("j_idt92"));
        element12.clear();


        driver.findElement(By.xpath("//*[@id=\"j_idt73_label\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt73_3\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"j_idt93\"]/span[2]")).click();

    }



}
