package Dtos.Response;

public class RegisterResponse {
    private String fullName;
    private String phoneNumber;
    private String email;
    private String username;
    private String dateRegistered;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(String dateRegistered) {
        this.dateRegistered = dateRegistered;
    }
    @Override
    public String toString() {
        return String.format("""
                ========================
                Full Name: %s
                Phone Number: %s
                Email Address :%s
                Username: %s
                Date Registered: %s
                ========================""", fullName, phoneNumber, email, username, dateRegistered);
    }
}
