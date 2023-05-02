package Data.Models;

import java.time.LocalDateTime;
import java.util.Date;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private String phoneNumber;
    private String eMail;
    private String userName;
    private LocalDateTime dateRegistered = LocalDateTime.now();

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    public String geteMail() {
        return eMail;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return this.userName;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = LocalDateTime.now();
    }
    public LocalDateTime getDateRegistered() {
        return dateRegistered;
    }
   /* @Override
    public String toString() {
        return String.format("""
                ========================
                First Name: %s
                Last Name: %s
                Phone Number: %s
                Email Address :%s
                Username: %s
                Date Registered: %s
                ========================""", firstName, lastName, phoneNumber, eMail, userName, dateRegistered);
    }

    */

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", eMail='" + eMail + '\'' +
                ", userName='" + userName + '\'' +
                ", dateRegistered=" + dateRegistered +
                '}';
    }
}
