/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementapp;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author razmy
 */
public class Login {
    
    private Teacher teacher;
    private TeacherFuctions teacherFuctions;
    Scanner scanner = new Scanner(System.in);

    public Login() {
        
    
        
        teacher = new Teacher();
        teacher.setId(1);
        teacher.setPassword("123");
        teacher.setName("Default Teacher");
        
        
        
        teacherFuctions = new TeacherFuctions();
        
        
    }
    
    public void teacherLogin(){
        System.out.println("Please Enter Teacher Id");
        int id = scanner.nextInt();
        System.out.println("Please Enter Password");
        String password = scanner.next();
        if(id!=teacher.getId() && password!=teacher.getPassword()){
        
            System.err.println("Unautherized");
            
        }
        else { 
            System.out.println("Welcome  " + teacher.getName()); 
            afterTeacherLogin();
        }
    }
    
    public void studentLogin(){
    
        System.out.println("Please Enter Student Id");
        int id = scanner.nextInt();
        System.out.println("Please Enter Student Password");
        String password = scanner.next();
        
        for(Student student: teacherFuctions.getStudentList()){
        
            if(id!=student.getId() && password != student.getPassword()){
            
               System.err.println("Unautherized");  
            }
            else{ 
                System.out.println("Welcome  " + student.getFirstName() +" "+student.getLastName() );
                afterStudentLogin(student);
                
            }
        }
  
    }
    
    public void afterTeacherLogin(){
    
        int option=0;
        do{
        
            System.out.println("####### Teacher's  Menue ######");
            System.out.println("Press 1 To Add Student");
            System.out.println("Press 2 To Print Students Details with Grade");
            System.out.println("Print 3 To Find higher mark holder for each subject ");
            System.out.println("Press 4 to Print Student Report");
            System.out.println("Press 5 to remove student");
            System.out.println("Pres 6 Logout");
           
            int ch = scanner.nextInt();
            
            switch(ch){
            
                case 1:
                    System.out.println("Please Provide information about Student");
                    teacherFuctions.addStudent();
                    break;
                case 2:
                    
                    teacherFuctions.displayAllStudent();
                    break;
                case 3:
                    teacherFuctions.displayHigerMarkHolder();
                    break;
                case 4:
                    teacherFuctions.printStudentReport();
                case 5:
                    teacherFuctions.removeStudent();
                case 6:
                    this.startApp();
                
            }
            System.out.println("Press 6 to logout press any other key to continue");
            option = scanner.nextInt();
        }while(option!=6);
    }
    
    public void afterStudentLogin(Student student){
    
        System.out.println("--------------------------------------------------------------------------------------------------"+"\n");
        System.out.printf("%3s %10s %10s %10s %10s %10s %10s %10s %10s ","ID", "FIRSTNAME", "LASTNAME","Sub-A Mark","Sub-A Grade","Sub-B Mark","Sub-B Grade","Sub-C Mark","Sub-C Grade"+"\n");
        System.out.println("--------------------------------------------------------------------------------------------------"+"\n");
        System.out.format("%3s %10s %10s %10d %10s %10d %10s %10d %10s",student.getId(), student.getFirstName(), student.getLastName(),
                    student.getMarksA(),student.getGradeA(),student.getMarksB(),student.getGeadeB(),student.getMarksC(),student.getGradeC()+"\n");
        System.out.println();
    }
    
    public void startApp(){
    
         Scanner scanner = new Scanner(System.in);
         int option = 0;
         
        
        do{
        
            System.out.println("#######  Menue ######");
            System.out.println("ENTER 1 FOR Teacher Login");
            System.out.println("ENTER 2 FOR Student Login");
            System.out.println("ENTER 3 FOR Exit");
           
            int ch = scanner.nextInt();
            
            switch(ch){
            
                case 1:
                    System.out.println("Teacher Login --- please enter id and password");
                    this.teacherLogin();
                    break;
                case 2:
                    System.out.println("Student Login ---- please enter student id and password");
                    this.studentLogin();
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
