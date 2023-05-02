package Dtos.Response;

import java.time.LocalDateTime;
import java.util.Date;

public class FindEmailResponse {
    private String title;
    private String body;
    private String recipientEmail;
    private LocalDateTime dateSent = LocalDateTime.now();

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setRecipient(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }
    public String getRecipient() {
        return recipientEmail;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getBody() {
        return body;
    }
    public void setDateSent(String dateRegistered) {
        this.dateSent = LocalDateTime.now();
    }
    public LocalDateTime getDateSent() {
        return dateSent;
    }

    @Override
    public String toString(){
        return String.format("""
                ==============================
                Recipient's Email: %s
                Email Title: %s
                Email Body: %s
                Date Sent: %s
                ==============================
                """, recipientEmail, title, body, dateSent);
    }

}
