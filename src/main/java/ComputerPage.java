import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComputerPage extends BasePage{

    private final By pageOfTwo = By.xpath("//*[text()='Sonraki']");
    private final By firstProduct = By.xpath("(//*[@data-testid='productImage'])[1]");
    private final By addToBasket = By.xpath("//*[@id='add-to-basket' and @type='button']");
    public final By price = By.xpath("(//*[@id='sp-price-lowPrice'])[1]");


    public ComputerPage(WebDriver driver) {
        super(driver);
    }

    public void clickPageOfTwoButton() {
        click(pageOfTwo);
    }
    public void clickFirstProduct() {
        click(firstProduct);
    }
    public void clickAddToBasket() {
        click(addToBasket);
    }
    public void savePrice(){
        String firstPrice = find(price).getText();
    }

}
