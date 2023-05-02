package Dtos.Requests;

public class RegisterUserRequest {
    private String firstName;
    private String lastName;
    private String UserName;
    private String password;
    private String phoneNumber;

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
    public String setUserName(String userName) {
        return userName;
    }
    public String getUserName() {
        return UserName;
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
}
