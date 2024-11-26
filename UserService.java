/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACKEND;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ivan
 */
public class UserService implements Users{
     private final List<String> userID = new ArrayList<>();
    private final List<String> password = new ArrayList<>();
    private final List<String> contactNumber = new ArrayList<>();

    @Override
    public boolean userExists(String username) {
        return userID.contains(username);
    }

    @Override
    public boolean validatePassword(String username, String enteredPassword) {
        int index = userID.indexOf(username);
        return index != -1 && password.get(index).equals(enteredPassword);
    }

    @Override
    public void addUser(String username, String password, String contactNumber) {
        if (!userExists(username)) {
            this.userID.add(username);
            this.password.add(password);
            this.contactNumber.add(contactNumber);
        } else {
            System.out.println("User already exists!");
        }
    }

    @Override
    public List<String> getUserIDs() {
        return new ArrayList<>(userID); // Return a copy of the userID list
    }
}
