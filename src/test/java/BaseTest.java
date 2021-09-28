import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

  static WebDriver driver;

  @BeforeAll
  public static void setUp() {
   // WebDriverManager.chromedriver().setup();
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\berats\\Desktop\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.gittigidiyor.com/");
  }

  @AfterAll
  public void tearDown(){
    driver.quit();
  }
}