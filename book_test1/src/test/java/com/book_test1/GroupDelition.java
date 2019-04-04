package com.book_test1;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.NoSuchElementException;

public class GroupDelition extends TestBase {

    @BeforeMethod
    public void preconditions() {
        openGroupsPage();
    if(!isGroupPresent()){
        createGroup();
    }
    }
    private boolean isGroupPresent() {
        return isElementPresent(By.name("selected[]"));
    }
    public boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    //steps from GroupCreationTest
    public void createGroup() {
        createNewGroup();
        fillGroupForm(new Group().setGroupname("123456").setGroupheader("qwerty").setGroupfooter("QA20"));
        submitGroupForm();
        returnToTheGroupPage();
    }
    @Test
    public void TestGroupDelition(){
        openGroupsPage();
        selectGroup();
        deleteGroups();
        returnToTheGroupPage();
    }

}
