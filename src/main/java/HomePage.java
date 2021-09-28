import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private final By homepage = By.xpath("//*[@placeholder='Keşfetmeye Bak']");
    private final By loginButton = By.xpath("(//*[@title='Giriş Yap'])[2]");
    private final By addToBasket = By.xpath("//*[text()='Sepetim']");
    private final By myAccount = By.xpath("//*[text()='Hesabım']");
    private final By findButton = By.xpath("//*[text()='BUL']");
    private final By closeButton = By.xpath("(//*[text()='Kapat'])[1]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage() {
        super();
    }


    public void isControl(){find(homepage).getText();}
    public void clickBasketButton() {
        click(addToBasket);
    }
    public void clickLoginButton() {
        click(loginButton);
    }
    public void isControlAccount(){find(myAccount).getText();}
    public void fillSearchArea(){
        type(homepage, "bilgisayar");
    }
    public void clickFindButton() {
        click(findButton);
    }
    public void clickCloseButton() {
        click(closeButton);
    }
}
