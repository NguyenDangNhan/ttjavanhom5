/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai10;

/**
 *
 * @author nauq2
 */
class Gen<T>{
    T obj;

    public Gen() {
    }

    public Gen(T obj) {
        this.obj = obj;
    }
    
    T getObject(){
        System.out.println("Đối tượng lớp Gen: " );
        return obj;
    }
}
class Gen2<T> extends Gen<T>{

    public Gen2(T obj) {
        super(obj);
    }
    
    T getObject(){
        System.out.println("Đối tượng lớp Gen2: ");
        return obj;
    }
}
public class OverrideGenericMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gen<Integer> Intobject = new Gen<Integer>(88);
        Gen2<Long> longObject = new Gen2<Long>(99L);
        Intobject.getObject();
        longObject.getObject();
    }
    
}
