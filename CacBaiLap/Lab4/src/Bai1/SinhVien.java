/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Date;

/**
 *
 * @author nauq2
 */
public class SinhVien implements Comparable<SinhVien>{
    private String masv;
    private String tensv;
    private Date namsinh;
    private String diachi;
    private String lop;

    public SinhVien() {
    }

    public SinhVien(String masv, String tensv, Date namsinh, String diachi, String lop) {
        this.masv = masv;
        this.tensv = tensv;
        this.namsinh = namsinh;
        this.diachi = diachi;
        this.lop = lop;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public Date getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(Date namsinh) {
        this.namsinh = namsinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
    @Override
    public String toString()
    {
        return "Sinh viên (Mã sinh viên: "+masv+", Tên sinh viên: "+tensv+", Năm sinh: "+namsinh+", Địa chỉ: "+diachi+", Lớp: "+lop+")";
    }

    @Override
    public int compareTo(SinhVien o) {
        if(masv.equalsIgnoreCase(o.getMasv()))
            return 0;
        else
            return 1;
    }
}
