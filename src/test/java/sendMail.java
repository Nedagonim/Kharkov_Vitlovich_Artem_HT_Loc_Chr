import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class sendMail {
    WebDriver driver;
    HomePage homePage;
    Text randomText;

    @BeforeMethod
    public void testSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        randomText = new Text(driver);
    }

    @Test
    public void logAndSend() {
        homePage.openHomePage();
        homePage.untilVisible(homePage.login);
        homePage.login.sendKeys(HomePage.LOG);
        homePage.password.sendKeys(HomePage.PASS, Keys.ENTER);
        homePage.untilVisible(homePage.mailButton);
        homePage.mailButton.click();
        homePage.toWhom.sendKeys(HomePage.DEST);
        homePage.text.sendKeys(randomText.emailText());
        homePage.sendButton.click();
        Assert.assertTrue(homePage.success.isEnabled());
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}

