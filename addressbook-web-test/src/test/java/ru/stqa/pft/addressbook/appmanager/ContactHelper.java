package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Tanchik on 07.03.2016.
 */
public class ContactHelper extends HelperBase {


  public ContactHelper(FirefoxDriver wd) {
    super (wd);
  }


  public void returnToHomePade() {
    click(By.linkText("home"));
  }

  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));

  }

  public void fillAddContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getName());
        type (By.name("lastname"),contactData.getLastname());
        type(By.name("address"),contactData.getAddress());
        type(By.name("home"),contactData.getPhone());
        type(By.name("email"),contactData.getEmail());
  }

  public void initContactCreation() {
      wd.findElement(By.linkText("add new")).click();
  }
}
