package LoginTrelloTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class LoginTrello extends TestBase{

    @Test
    public void testOpenTrello()
    {
        clickSignUpButton();
        fillLogInForm();
        cliclLogIn();
    }

}
