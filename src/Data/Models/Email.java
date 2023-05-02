package Data.Models;

import java.time.LocalDateTime;


public class Email {
    private int id;
    private String title;
    private String recipientEmail;
    private String body;
    private LocalDateTime localDateTime = LocalDateTime.now();

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }
    public String getRecipientEmail() {
        return recipientEmail;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
    public void setLocalDateTime(String localDateTime) {
        this.localDateTime = LocalDateTime.now();
    }
    public LocalDateTime getLocalDateTime() {
        return LocalDateTime.now();
    }


}
