/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author nauq2
 */
public class Student implements Comparable<Student>{

    private String ten;
    private int tuoi;
    private String diachi;

    public Student() {
    }

    public Student(String ten, int tuoi, String diachi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    
    @Override
    public String toString()
    {
        return "Tên = " + ten + ", Tuổi = " + tuoi + ", Địa chỉ = " + diachi;
    }
    @Override
    public int compareTo(Student o) {
        return this.ten.compareTo(o.getTen());
    }
}
