package Dtos.Requests;

import java.util.Date;

public class CreateEmailRequest {
    private String title;
    private String body;
    private String recipientEmail;


    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle()  {
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

}
