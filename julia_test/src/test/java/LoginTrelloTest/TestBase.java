package LoginTrelloTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setUp()
    {
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.MILLISECONDS);
        driver.navigate().to("https://trello.com/");
    }

    void fillLogInForm() {
        driver.findElement((By.name("user"))).click();
        driver.findElement((By.name("user"))).clear();
        driver.findElement((By.name("user"))).sendKeys("g.julia82@gmail.com");
        driver.findElement((By.name("password"))).click();
        driver.findElement((By.name("password"))).clear();
        driver.findElement((By.name("password"))).sendKeys("gablon1007");
    }

    void cliclLogIn() {
        driver.findElement(By.id("login")).click();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    void clickSignUpButton() {
        driver.findElement(By.cssSelector("[href='/login']")).click();
    }
}
