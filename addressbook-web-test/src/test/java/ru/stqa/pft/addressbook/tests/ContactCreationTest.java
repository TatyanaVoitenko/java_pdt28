package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {

    @Test
    public void ContactCreationTest() {

        app.initContactCreation();
        app.fillAddContactForm(new ContactData("Anna", "German", "Moscow", "789-87-458", "anna.german@test.com"));
        app.submitContactCreation();
        app.returnToHomePade();
    }

}
