/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author abdulbasith
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student("Basith","s1");
        
        Student[] studentList = new Student[3];
        studentList[0] = s1;
        studentList[1] = new Student("abc","s2");
        studentList[2] = new Student("def","s3");
        
        for (Student studentList1 : studentList) {
            System.out.println(studentList1.getSname());
        }
    
    }
}
