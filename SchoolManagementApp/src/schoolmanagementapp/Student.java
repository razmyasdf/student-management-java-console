/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementapp;

/**
 *
 * @author razmy
 */
public class Student {
    
    int id;
    String password;
    String firstName;
    String lastName;
    String address;
    int marksA;
    int marksB;
    int marksC;
    
    String gradeA;
    String geadeB;
    String gradeC;
    

    public Student() {
    }

    public Student(int id, String password, String firstName, String lastName, String address, int marksA, int marksB, int marksC, String gradeA, String geadeB, String gradeC) {
        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.marksA = marksA;
        this.marksB = marksB;
        this.marksC = marksC;
        this.gradeA = gradeA;
        this.geadeB = geadeB;
        this.gradeC = gradeC;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMarksA() {
        return marksA;
    }

    public void setMarksA(int marksA) {
        this.marksA = marksA;
    }

    public int getMarksB() {
        return marksB;
    }

    public void setMarksB(int marksB) {
        this.marksB = marksB;
    }

    public int getMarksC() {
        return marksC;
    }

    public void setMarksC(int marksC) {
        this.marksC = marksC;
    }

    public String getGradeA() {
        return gradeA;
    }

    public void setGradeA(String gradeA) {
        this.gradeA = gradeA;
    }

    public String getGeadeB() {
        return geadeB;
    }

    public void setGeadeB(String geadeB) {
        this.geadeB = geadeB;
    }

    public String getGradeC() {
        return gradeC;
    }

    public void setGradeC(String gradeC) {
        this.gradeC = gradeC;
    }
    

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", password=" + password + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + '}';
    }
    
    
}
