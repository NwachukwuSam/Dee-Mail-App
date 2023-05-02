package Data.Repositories;

import Data.Models.Email;

import java.util.ArrayList;
import java.util.List;

public class EmailRepositoryImpl implements EmailRepository{
    List<Email>myEmail = new ArrayList<>();
    int count;
    @Override
    public Email save(Email email) {
        boolean emailHasNotBeenSaved = email.getId() == 0;
        if (emailHasNotBeenSaved){
            email.setId(generateId());
            myEmail.add(email);
            count++;
        }
        return email;
    }
    public int generateId(){
        return count+1;
    }

    @Override
    public Email send(Email email) {
        return null;
    }

    @Override
    public Email findById(int id) {
        for (Email theEmail: myEmail){
            if (theEmail.getId() == id){
                return theEmail;
            }
        }
        return null;
    }
    @Override
    public Email findByTitle(String title) {
        for (Email theEmail: myEmail){
            if (theEmail.getTitle().equalsIgnoreCase(title)){
                return theEmail;
            }
        }
        return null;
    }

    @Override
    public List<Email> findAll() {
        return myEmail;
    }

    @Override
    public void deleteById(int id) {
        for (Email theEmail : myEmail){
            if (theEmail.getId() == id){
                myEmail.remove(theEmail);
                count--;
                break;
            }
        }
    }
    @Override
    public void deleteByTitle(String title) {
        for (Email theEmail : myEmail){
            if (theEmail.getTitle().equalsIgnoreCase(title)){
                myEmail.remove(theEmail);
                count--;
                break;
            }
        }
    }
    @Override
    public void deleteAll() {
        myEmail.clear();
        count = 0;
    }
    @Override
    public int count() {
        return count;
    }
}
