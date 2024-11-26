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
public interface Users {
     boolean userExists(String username);

    // Validate the password for a given username
    boolean validatePassword(String username, String enteredPassword);

    // Add a new user to the system
    void addUser(String username, String password, String contactNumber);

    // Retrieve a list of all user IDs
    List<String> getUserIDs();
    
}
