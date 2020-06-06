/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author razmy
 */
public class TeacherFuctions {
    
    private List<Student> studentList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public TeacherFuctions() {
        
    }
    
    public List<Student> getStudentList(){
    
        return this.studentList;
    }
    
    public void addStudent(){
        Student student = new Student();
        System.out.println("Enter Student ID");
            student.setId(scanner.nextInt());
        System.out.println("Enter Password for Student");
            student.setPassword(scanner.next());
        System.out.println("Enter Student First Name");
            student.setFirstName(scanner.next());
        System.out.println("Enter Student Last Name");
            student.setLastName(scanner.next());
        System.out.println("Enter Student Address");
            student.setAddress(scanner.next());
        System.out.println("Enter Mark for Subject A");
            student.setMarksA(scanner.nextInt());
            student.setGradeA(markCalculater(student.getMarksA()));
        System.out.println("Enter Mark for Subject B");
            student.setMarksB(scanner.nextInt());
            student.setGeadeB(markCalculater(student.getMarksB()));
        System.out.println("Enter Mark for Subject C");
            student.setMarksC(scanner.nextInt());
            student.setGradeC(markCalculater(student.getMarksC()));
       
        studentList.add(student);
    }
    
    public void displayAllStudent(){
        
        System.out.println("--------------------------------------------------------------------------------------------------"+"\n");
        System.out.printf("%3s %10s %10s %15s %10s %10s %10s %10s %10s %10s ","ID", "FIRSTNAME", "LASTNAME", "ADDRESS","Sub-A Mark","Sub-A Grade","Sub-B Mark","Sub-B Grade","Sub-C Mark","Sub-C Grade"+"\n");
        System.out.println("--------------------------------------------------------------------------------------------------"+"\n");
        for(Student student : studentList){
            System.out.format("%3s %10s %10s %15s %10d %10s %10d %10s %10d %10s",student.getId(), student.getFirstName(), student.getLastName(),
                    student.getAddress(),student.getMarksA(),student.getGradeA(),student.getMarksB(),student.getGeadeB(),student.getMarksC(),student.getGradeC()+"\n");
        System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
       
    }
    
    public void displayHigerMarkHolder(){
    
        
        HashMap<String, Integer> subA = new HashMap<>();
        HashMap<String, Integer> subB  = new HashMap<>();
        HashMap<String, Integer> subC  = new HashMap<>();
       
        for(Student stu : studentList){
        
            subA.put(stu.getFirstName() + " " + stu.getLastName(), stu.getMarksA());
            subB.put(stu.getFirstName() + " " + stu.getLastName(), stu.getMarksB());
            subC.put(stu.getFirstName() + " " + stu.getLastName(), stu.getMarksC());
            
        }
        
        Object maxNameA = Collections.max(subA.entrySet(), Map.Entry.comparingByValue()).getKey();   
        Object maxNameB = Collections.max(subB.entrySet(), Map.Entry.comparingByValue()).getKey();    
        Object maxNameC = Collections.max(subC.entrySet(), Map.Entry.comparingByValue()).getKey();    

        System.out.println("For Subject A = " + maxNameA);
        System.out.println("For Subject B = " + maxNameB);
        System.out.println("For Subject C = " + maxNameC);
        //System.out.println(subA);
        
    }
    
    public void printStudentReport(){
        System.out.println("Please Enter Student ID to Print Report");
        int student_id = scanner.nextInt();
        for(Student student : studentList){
        
            if(student_id == student.getId()){
            System.out.println("-----------------------Student Report for  "+student.getFirstName()+" " +student.getLastName()+"------");
            System.out.println("--------------------------------------------------------------------------------------------------"+"\n");
            System.out.printf("%3s %10s %10s %10s %10s %10s %10s %10s %10s ","ID", "FIRSTNAME", "LASTNAME","Sub-A Mark","Sub-A Grade","Sub-B Mark","Sub-B Grade","Sub-C Mark","Sub-C Grade"+"\n");
            System.out.println("--------------------------------------------------------------------------------------------------"+"\n");
            System.out.format("%3s %10s %10s %10d %10s %10d %10s %10d %10s",student.getId(), student.getFirstName(), student.getLastName(),
                    student.getMarksA(),student.getGradeA(),student.getMarksB(),student.getGeadeB(),student.getMarksC(),student.getGradeC()+"\n");
        System.out.println();
               
            }
        }
    }
    
    public void removeStudent(){
        
        System.out.println("Please Enter Student ID to Remove from system");
        int studentID = scanner.nextInt();
        studentList.removeIf(n -> (n.getId()==studentID));
        displayAllStudent();
    }
    
    public String markCalculater(int marks){
    
        String grade = null;
        if(marks<=34){
        
            grade ="F";
        }
        else if(marks>34 && marks<=54){
        
            grade = "D";
        }
        else if(marks>54 && marks<=64){
        
            grade = "C";
        }
        else if(marks>64 && marks<=74){
        
            grade = "B";
        }
        else if(marks>74 && marks<=100){
        
            grade ="A";
        }
        
        return grade;
    }
}
