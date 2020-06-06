/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementapp;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author razmy
 */
public class Application {

    
    public Application() {
       
    }
    
    public void startApp(){
    
         Scanner scanner = new Scanner(System.in);
         int option = 0;
         Login login = new Login();
        
        do{
        
            System.out.println("#######  Menue ######");
            System.out.println("ENTER 1 FOR Teacher Login");
            System.out.println("ENTER 2 FOR Student Login");
            System.out.println("ENTER 3 FOR Exit");
           
            int ch = scanner.nextInt();
            
            switch(ch){
            
                case 1:
                    System.out.println("Teacher Login --- please enter id and password");
                    login.teacherLogin();
                    break;
                case 2:
                    System.out.println("Student Login ---- please enter student id and password");
                    login.studentLogin();
                    break;
                case 3:
                    System.out.println("Exiting System");
                    System.exit(0);
                
            }
            System.out.println("Press 3 to exit press any other key to continue");
            option = scanner.nextInt();
        }while(option!=3);
    }
    
    
}
