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

    private String ho;
    private String ten;

    public Person() {
    }

    public Person(String ho, String ten) {
        this.ho = ho;
        this.ten = ten;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
    @Override
    public String toString()
    {
        return ho+"\t"+ten;
    }
    
    @Override
    public int compareTo(Person o) {
        int result = ten.compareTo(o.ten);
        return result == 0 ? ho.compareTo(((Person)o).ho):result;
    }
}
