package com.example.appshoppe.model;

public class Brand {
    private String ten;
    private int id,hinh;

    public Brand(String ten, int id, int hinh) {
        this.ten = ten;
        this.id = id;
        this.hinh = hinh;
    }

    public Brand() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
