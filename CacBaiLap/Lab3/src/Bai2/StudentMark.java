/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author nauq2
 */
public class StudentMark implements Imark{
    private String id;
    private String tenlop;
    private String monhoc;
    private int hocky;
    private float diem;

    public StudentMark() {
    }

    public StudentMark(String id, String tenlop, String monhoc, int hocky, float diem) {
        this.id = id;
        this.tenlop = tenlop;
        this.monhoc = monhoc;
        this.hocky = hocky;
        this.diem = diem;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public String getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(String monhoc) {
        this.monhoc = monhoc;
    }

    public int getHocky() {
        return hocky;
    }

    public void setHocky(int hocky) {
        this.hocky = hocky;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
    
    @Override
    public void input() {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập Id: ");
        id = nhap.nextLine();
        System.out.print("Nhập tên lớp: ");
        tenlop = nhap.nextLine();
        System.out.print("Nhập tên môn học: ");
        monhoc = nhap.nextLine();
        System.out.print("Nhập học kỳ: ");
        hocky = nhap.nextInt();
        System.out.print("Nhập diem: ");
        diem = nhap.nextInt();
    }

    @Override
    public void display() {
        System.out.println("Id: "+id);
        System.out.println("Tên lớp: "+tenlop);
        System.out.println("Tên môn học: "+monhoc);
        System.out.println("Học kỳ: "+hocky);
        System.out.println("Điểm: "+diem);
    }
    
}
