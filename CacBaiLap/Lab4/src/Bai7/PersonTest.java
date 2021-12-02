/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

import java.util.Arrays;

/**
 *
 * @author nauq2
 */
public class PersonTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person[] ds = {
            new Person("C", "D"),
            new Person("G", "H"),
            new Person("A", "B"),
            new Person("E", "F"),
            new Person("I", "I")
        };
        Arrays.sort(ds);
        for(Person p:ds)
            System.out.println(p);
        int vitri = 0;
        System.out.println("Tìm kiếm:");
        for(Person p:ds)
        {
            vitri = Arrays.binarySearch(ds, p);
            if(vitri>=0)
                System.out.println(p +" tại vị trí thứ "+ (vitri+1));
            else
                System.out.println("Không tìm thấy.");
        }
    }
    
}
