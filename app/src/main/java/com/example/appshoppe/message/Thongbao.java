package com.example.appshoppe.message;

public class Thongbao {
    private String image;
//    private int image;
    private String ttin,tgian;

    public Thongbao( String ttin, String tgian,String image) {
         this.image = image;
        this.ttin = ttin;
        this.tgian = tgian;
    }

    public Thongbao() {
    }

//    public int getImage() {
//        return image;
//    }
//
//    public void setImage(int image) {
//        this.image = image;
//    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTtin() {
        return ttin;
    }

    public void setTtin(String ttin) {
        this.ttin = ttin;
    }

    public String getTgian() {
        return tgian;
    }

    public void setTgian(String tgian) {
        this.tgian = tgian;
    }
}
