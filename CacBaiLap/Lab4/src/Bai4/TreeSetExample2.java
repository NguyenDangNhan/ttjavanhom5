/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.TreeSet;

/**
 *
 * @author nauq2
 */
public class TreeSetExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeSet<Student> ts = new TreeSet<Student>();
        Student st1 = new Student("Quân", 21, "Hà Nội");
        Student st2 = new Student("Hiếu", 21, "Sơn La");
        Student st3 = new Student("Tùng", 19, "Hà Nội");
        Student st4 = new Student("Trung", 21, "Hà Nam");
        ts.add(st1);
        ts.add(st2);
        ts.add(st3);
        ts.add(st4);
        ts.add(st1);
        for(Student s:ts)
        {
            System.out.println(s.toString());
        }
    }
    
}
