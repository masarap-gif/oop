/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.util.ArrayList;
import javax.swing.SwingUtilities;

/**
 *
 * @author ivan
 */
public class main {
      private LogInUI loginUI;
    private signUpUi signUpUI;
    private ValidationUI validationUI;
    private DashBoarUI dashboardUI;
    
        public static void main(String[] args) {
        // Show the ValidationUI screen first
        SwingUtilities.invokeLater(() -> {
            new ValidationUI();
        });
    }
}





