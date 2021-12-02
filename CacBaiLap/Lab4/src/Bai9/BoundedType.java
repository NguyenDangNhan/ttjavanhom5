/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai9;

/**
 *
 * @author nauq2
 */
class Stats<T extends Number>{
    T[] ds;

    public Stats(T[] ds) {
        this.ds = ds;
    }
    
    double TrungBinh(){
        double tong = 0;
        for(int i=0; i < ds.length; i++) 
            tong += ds[i].doubleValue();
        return tong / ds.length;
    }
}
public class BoundedType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer ds[] = { 1, 2, 3, 4, 5 };
        Stats<Integer> s = new Stats<Integer>(ds);
        System.out.println("Trung binh dãy số: " + s.TrungBinh());
        Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
    } 
}
