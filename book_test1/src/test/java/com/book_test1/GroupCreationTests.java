package com.book_test1;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation()
    {
        openGroupsPage();

        //select groups of elements
        int before= getGroupsCount();

        createNewGroup();
        fillGroupForm(new Group().setGroupname("123456").setGroupheader("qwerty").setGroupfooter("QA20"));
        submitGroupForm();
        returnToTheGroupPage();

        //check that count groups more
        int after = getGroupsCount();
        Assert.assertEquals(after, before + 1);
    }

    public int getGroupsCount() {
        return driver.findElements(By.name("selected[]")).size();
    }


}
