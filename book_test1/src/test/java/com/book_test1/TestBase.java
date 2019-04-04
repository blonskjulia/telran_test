package com.book_test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;

    @BeforeMethod
    public void setUp()
    {
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.MILLISECONDS);
        driver.navigate().to("http://localhost/addressbook/");

        fillLoginForm("admin", "secret");
     }

    public void fillLoginForm(String username, String password) {
        type(By.name("user"), username);
        type(By.name("pass"), password);
        click(By.cssSelector("[type=submit]"));
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    protected void returnToTheGroupPage() {
        click(By.cssSelector("i a[href='group.php']"));
    }

    protected void submitGroupForm() {
        click(By.cssSelector("[type='submit']"));
    }

    protected void fillGroupForm(Group group) {
        type(By.name("group_name"), group.getGroupname());
        type(By.name("group_header"), group.getGroupheader());
        type(By.name("group_footer"), group.getGroupfooter());
    }

    protected void createNewGroup() {
        click(By.name("new"));
    }

    protected void openGroupsPage() {
        click(By.cssSelector("[href='group.php']"));
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    protected void selectGroup() {
        click(By.name("selected[]"));
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    protected void initGroupModification() {
        click(By.cssSelector("[name='edit']:last-child"));
    }

    protected void submitGroupModification() {
        click(By.name("update"));
    }

    protected void deleteGroups() {
        click(By.xpath("//*[@id='content']/form/input[2]"));
    }
}
