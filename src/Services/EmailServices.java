package Services;

import Dtos.Requests.CreateEmailRequest;
import Dtos.Response.FindEmailResponse;

public interface EmailServices {
    FindEmailResponse createEmail(CreateEmailRequest createEmailRequest);
    FindEmailResponse sendEmail(CreateEmailRequest request);
    FindEmailResponse findEmailByTitle(String emailTitle);
    void deleteEmailbyTitle(String emailTitle);

}
