/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

/**
 *
 * @author nauq2
 */
public class Person implements Comparable<Person>{
    private String ht;
    private String dc;

    public Person() {
    }

    public Person(String ht, String dc) {
        this.ht = ht;
        this.dc = dc;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }
    
    @Override
    public String toString()
    {
        return ("Họ tên: "+ht+", Địa chỉ: "+dc);
    }
    @Override
    public int compareTo(Person o)
    {
        if(ht.equalsIgnoreCase(o.getHt()))
            return 0;
        else
            return 1;
    }
}
