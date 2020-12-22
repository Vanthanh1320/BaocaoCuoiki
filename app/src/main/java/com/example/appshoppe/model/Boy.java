package com.example.appshoppe.model;

public class Boy {
    private String ten,gia,hinh;
    private int id;

    public Boy(String ten, String gia, String hinh,int id) {
        this.ten = ten;
        this.gia = gia;
        this.hinh = hinh;
        this.id=id;
    }

    public Boy() {

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

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }
}
