package Dtos.Response;

import java.time.LocalDateTime;

public class FindUserResponse {
    private String fullName;
    private String userName;
    private String phoneNumber;
    private String email;
    private LocalDateTime dateRegistered = LocalDateTime.now();

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return userName;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setDateRegistered(String dateRegistered) {
        this.dateRegistered = LocalDateTime.now();
    }
    public LocalDateTime getDateRegistered() {
        return dateRegistered;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public String toString(){
        return String.format("""
                ============================
                Full Name: %s
                User Name: %s
                Password : %s
                Phone Number: %s
                Email Address: %s
                Date Registered: %s
                ============================""", fullName, userName, phoneNumber, email, dateRegistered);
    }
}
