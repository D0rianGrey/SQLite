import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MobilePhoneTest {
    WebDriver driver;
    WebDriverWait wait;
    String url = "";
    String applyButton = "//div[@class='vacancy-page-btns'][1]//a";
    String nameField = "";
    String surnameField = "";
    String emailField = "";
    String phoneInputField = "";
    String phoneDropDown = "";
    String attach = "";
    String whereDidYouHearAboutUs = "";
    String additionalComment = "";
    String firstCheckBox = "";
    String secondCheckBox = "";
    String captcha = "//div[@class='recaptcha-checkbox-borderAnimation']";
    String submitButton = "";


    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        //DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(options);
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }

    @Test
    public void mobileTest() throws InterruptedException {
        driver.findElement(By.xpath(applyButton)).click();
//        int size = driver.findElements(By.tagName("iframe")).size();
//        System.out.println(size);
        driver.switchTo().frame(0);
        //driver.switchTo().frame(driver.findElement(By.name("a-cldsmqpqoro5")));
        driver.findElement(By.xpath(captcha)).click();
    }

    @AfterTest
    public void teardown() {
//        if (driver != null) {
//            driver.quit();
//        }
    }

}
