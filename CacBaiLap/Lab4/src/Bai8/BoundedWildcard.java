/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nauq2
 */
public class BoundedWildcard {

    /**
     * @param args the command line arguments
     */
    public static double TrungBinh(List<? extends Number> ds)
    {
        double total = 0.0;
        for (Number n : ds){
            total += n.doubleValue();
        }
        return total / ds.size();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> ds = new ArrayList<Integer>();
        ds.add(3);
        ds.add(30);
        ds.add(300);
        System.out.println(TrungBinh(ds));
    }
    
}
