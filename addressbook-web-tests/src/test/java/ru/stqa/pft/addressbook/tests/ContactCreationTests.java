package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {


    @Test
    public void createContact() {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("asd1", "asd2",  "test1"), true);
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().gotoHomePage();
    }
}
