import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

public class ExampleScenerio extends BaseTest {

    HomePage homePage;
    ComputerPage computerPage;
    LoginPage loginPage;
    BasketPage basketPage;

    @Test
    public void exapmleScenario() throws InterruptedException {
        homePage = new HomePage(driver);
        computerPage = new ComputerPage(driver);
        loginPage = new LoginPage(driver);
        basketPage = new BasketPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        homePage.isControl();
        homePage.clickBasketButton();
        homePage.clickLoginButton();
        loginPage.fillEmail();
        loginPage.fillPassword();
        loginPage.clickLoginButton();
        Thread.sleep(15000);
        homePage.clickCloseButton();
        homePage.isControlAccount();
        homePage.fillSearchArea();
        homePage.clickFindButton();
        js.executeScript("window.scrollBy(0,3800)");
        Thread.sleep(5000);
        computerPage.clickPageOfTwoButton();
        computerPage.clickFirstProduct();
        computerPage.savePrice();
        js.executeScript("window.scrollBy(0,5000)");
        Thread.sleep(7000);
        computerPage.clickAddToBasket();
        homePage.clickBasketButton();
        basketPage.isControlTotalPrice();
        basketPage.clickValueButton();
        basketPage.clickValueTwoButton();
        basketPage.seeValueTwo();
        basketPage.clickDeleteButton();
        basketPage.seeNullProduct();
    }
}