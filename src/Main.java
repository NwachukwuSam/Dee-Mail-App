import Controllers.EmailCntroller;
import Controllers.UserController;
import Dtos.Requests.CreateEmailRequest;
import Dtos.Requests.RegisterUserRequest;
import Dtos.Response.FindUserResponse;

import javax.swing.*;

public class Main {
    private static UserController userController = new UserController();
    private static EmailCntroller emailController = new EmailCntroller();

    public static void main(String[] args) {
        StartApp();
    }
    private static void StartApp() {
        String mainMenu = """
                ===========================
                Welcome To JioDeeMail
                1 -> Register
                2 -> Login
                3 -> Exit Application
                ============================
                """;
        try {
            String userInput = input(mainMenu);
            switch (userInput.charAt(0)) {
                case '1' -> register();
                case '2' -> login();
                case '3' -> exitApplication();
                default -> {
                    display("Invalid Input Try Again");
                    StartApp();
                }
            }
        } catch (Exception ex) {
            display(ex.getMessage());
            StartApp();
        }
    }
    private static void mainMenu(){
                String login = """
                                ===========================
                                1 -> Create New Email
                                2 -> Inbox
                                3 -> Outbox
                                4 -> Find Account
                                5 -> Delete Email
                                6 -> Back To Main Menu
                                """;
                String nextInput = input(login);
                switch (nextInput.charAt(0)) {
                    case '1' -> createNewEmail();
                    case '2' -> inbox();
                    case '3' -> outBox();
                    case '4' -> findAccount();
                    case '5' -> deleteEmail();
                    case '6' -> StartApp();
                    default -> {
                        display("Invalid Input Try Again");
                        StartApp();
                    }
                }
        }
    private static void register() {
        RegisterUserRequest request = new RegisterUserRequest();
        request.setFirstName(input("Enter First Name: "));
        request.setLastName(input("Enter Last Name: "));
        request.setPhoneNumber(input("Enter Phone Number: "));
        request.setPassword(input("Enter Password"));
        var registration = userController.register(request);
        display(registration.toString());
        display("JioDee Mail Successfully Created!!");
        StartApp();
    }
    private static void login(){
       try {
            String name = input("Input Username: ");
            String password = input("Enter Password: ");
            userController.login(name,password);
            display("Login Successful!!");
            mainMenu();
        } catch (IllegalArgumentException e){
            display(e.getMessage());

          login();
       }
    }
    private static void findAccount() {
        String name = (input("Enter Username: "));
        String password = (input("Enter Password: "));
         var find = userController.findUser(name);
        display(find.toString());
        StartApp();
    }

    private static void createNewEmail() {
        CreateEmailRequest createEmail = new CreateEmailRequest();
        createEmail.setRecipientEmail(input("Enter Recipient Email: "));
        createEmail.setTitle(input("Enter Email Subject: "));
        createEmail.setBody(input("Type in Your Email Message"));
        var emailMessage = emailController.createEmail(createEmail);
        display(emailMessage.toString());
        StartApp();
    }
    private static void inbox() {
        String viewEmail = input("Enter Email Title: ");
        var view = emailController.findEmail(viewEmail);
        display(view.toString());
        StartApp();
    }
    private static void outBox() {
        String sentEmail = input("Enter Email Title: ");
        display("Oh Sorry!! This Feature Has Not been Added");
    }
    private static void deleteEmail() {
        String deleteEMail = input("Enter Email Title: ");
        emailController.deleteMail(deleteEMail);
        display("Email Deleted Successfully!!!");
    }
    private static void exitApplication() {
        display("Thanks for Using JioDeeMail");
        System.exit(1);
    }
    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }
    private static void display(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
    }


}
