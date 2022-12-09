package Controllers;

import java.util.ArrayList;
import Models.User;

public class LoginController {

    User userObj;
                
    ArrayList<User> userDB=new ArrayList<>();;

    public LoginController() {
    }

    //store database data into this array list    
    public void addDBdata(String userName, String password) {
        userDB.add(new User(userName, password));
    }

    //take user inputs
    public User addUser(String userName, String password) {
        userObj = new User(userName, password);
        return userObj;
    }

    //validate user inputs with DB values
    public Boolean validateUser(User user) {
        for (User u : userDB) {
            if (user.getUserName().equals(u.getUserName()) && user.getPassword().equals(u.getPassword())) {
                return true;
            }
        }

        return false;
    }

}
