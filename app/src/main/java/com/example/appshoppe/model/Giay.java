package com.example.appshoppe.model;

public class Giay {
    private String ten,gia;
    private int id;
    private String hinh;

    public Giay(String ten, String gia,int id,String hinh) {
        this.ten = ten;
        this.gia = gia;
        this.hinh = hinh;
        this.id=id;
    }

    public Giay() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

//    public int getHinh() {
//        return hinh;
//    }
//
//    public void setHinh(int hinh) {
//        this.hinh = hinh;
//    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

}
