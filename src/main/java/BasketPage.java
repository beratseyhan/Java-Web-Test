import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends ComputerPage{

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public final By valueButton = By.xpath("//*[@class='amount']");
    public final By valueTwoButton = By.xpath("//*[@value='2']");
    public final By totalPrice = By.xpath("//*[@class='total-price']");
    public final By deleteButton = By.xpath("(//*[@class='gg-icon gg-icon-bin-medium'])[1]");
    public final By nullProduct = By.xpath("//*[text()='Sepetinizde ürün bulunmamaktadır.']");




    public void clickValueButton(){
        click(valueButton);
    }

    public void clickValueTwoButton() throws InterruptedException {
        click(valueTwoButton);
        Thread.sleep(5000);
    }

    public void isControlTotalPrice() throws InterruptedException {
        String priceTwo = find(totalPrice).getText();
        if (price.equals(priceTwo)){
            System.out.println("Bilgiler doğru");
        }
        else{
            System.out.println("Bilgiler doğru değil");
        }
        Thread.sleep(5000);
    }

    public void seeValueTwo() throws InterruptedException {find(valueTwoButton).getText();
        Thread.sleep(5000);}

    public void clickDeleteButton() throws InterruptedException {
        click(deleteButton);
        Thread.sleep(5000);
    }

    public void seeNullProduct(){find(nullProduct).getText();}
}
