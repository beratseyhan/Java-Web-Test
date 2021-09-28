import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage {
    public final By emailArea = By.id("L-UserNameField");
    public final By passwordArea = By.xpath("//*[@class='gg-d-24' and @type='password']");
    public final By loginButton = By.xpath("//*[@name='pass' and @alt='Giriş Yap']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void fillEmail(){
        type(emailArea, "beratsyhnn@gmail.com");
    }
    public void fillPassword(){
        type(passwordArea, "123321Bs.");
    }
    public void clickLoginButton(){
        click(loginButton);
    }

}
