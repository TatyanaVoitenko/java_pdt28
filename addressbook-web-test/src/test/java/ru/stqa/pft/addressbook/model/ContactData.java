package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String name;
  private final String lastname;
  private final String address;
  private final String phone;
  private final String email;

  public ContactData(String name, String lastname, String address, String phone, String email) {
    this.name = name;
    this.lastname = lastname;
    this.address = address;
    this.phone = phone;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getLastname() {
    return lastname;
  }

  public String getAddress() {
    return address;
  }

  public String getPhone() {
    return phone;
  }

  public String getEmail() {
    return email;
  }

  public static class GroupData {
    private final String name;
    private final String header;
    private final String footer;

    public GroupData(String name, String header, String footer) {
      this.name = name;
      this.header = header;
      this.footer = footer;
    }

    public String getName() {
      return name;
    }

    public String getHeader() {
      return header;
    }

    public String getFooter() {
      return footer;
    }
  }
}
