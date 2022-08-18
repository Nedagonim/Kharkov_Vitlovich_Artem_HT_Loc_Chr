import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public static final String HOME_URL = "https://mail.ukr.net/desktop";
    public static final String LOG = "volkov_a.a@ukr.net";
    public static final String PASS = "300traktorista";
    public static final String DEST = "Petrovartem01061996@gmail.com";

    @FindBy(name = "login")
    WebElement login;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(css = "button.button")
    WebElement mailButton;
    @FindBy(className = "input")
    WebElement toWhom;
    @FindBy(xpath = "//iframe[@id]")
    WebElement text;
    @FindBy(xpath = "//button[@class='button primary send']")
    WebElement sendButton;
    @FindBy(xpath = "//button[@class='button primary']")
    WebElement success;

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
