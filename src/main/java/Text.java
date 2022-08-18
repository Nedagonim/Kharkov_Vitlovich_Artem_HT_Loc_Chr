import org.openqa.selenium.WebDriver;

import java.util.Random;

public class Text extends BasePage{

    public String emailText(){
        var rnd = new Random();
        return "Forward this message to " +
                (rnd.nextInt(1000 - 7) + 7) +
                " your acquaintances" +
                (rnd.nextInt(1000 - 7) + 7) +
                " times, or tomorrow ZSU blow up russia";
    }

    public Text(WebDriver driver) {
        super(driver);
    }
}
