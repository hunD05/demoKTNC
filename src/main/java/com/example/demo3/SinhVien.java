package com.example.demo3;

public class SinhVien {
    private String maSv;
    private String ten;
    private int tuoi;
    private float diem;
    private String chuyenNganh;

    public SinhVien() {
    }

    public SinhVien(String maSv, String ten, int tuoi, float diem, String chuyenNganh) {
        this.maSv = maSv;
        setTen(ten);
        setTuoi(tuoi);
        setDiem(diem);
        setChuyenNganh(chuyenNganh);
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if(ten == null || ten.isEmpty()){
            throw new IllegalArgumentException("Ten khong duoc de trong");
        }
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if(tuoi < 0){
            throw new IllegalArgumentException("Tuoi khong duoc nho hon 0");
        }
        this.tuoi = tuoi;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        if (diem < 0 || diem > 10){
            throw new IllegalArgumentException("Diem khong duoc nho hon 0 va lon hon 10");
        }
        this.diem = diem;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        if(chuyenNganh == null || chuyenNganh.isEmpty()){
            throw new IllegalArgumentException("ChuyenNganh khong duoc de trong");
        }
        this.chuyenNganh = chuyenNganh;
    }
}
