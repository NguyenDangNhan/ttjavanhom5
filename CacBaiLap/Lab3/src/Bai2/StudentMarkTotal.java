/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author nauq2
 */
public class StudentMarkTotal extends StudentMark{
    private int tongmon;
    private float diemtb;

    public StudentMarkTotal() {
    }

    public StudentMarkTotal(int tongmon, float diemtb, String id, String tenlop, String monhoc, int hocky, float diem) {
        super(id, tenlop, monhoc, hocky, diem);
        this.tongmon = tongmon;
        this.diemtb = diemtb;
    }

    public int getTongmon() {
        return tongmon;
    }

    public void setTongmon(int tongmon) {
        this.tongmon = tongmon;
    }

    public float getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(float diemtb) {
        this.diemtb = diemtb;
    }
    public int getTongmon(StudentMarkTotal[] arr) {
        return arr.length;
    }
    public void TinhDTB(StudentMarkTotal[] arr) {
        for (int i = 0; i < arr.length; i++) {
            diemtb+=arr[i].getDiem();
        }
    }
}
