package com.example.appshoppe.message;

import java.util.List;

public class ListData {
    private int type;
    private List<Thongbao> listThongbao;

    public ListData(int type, List<Thongbao> listThongbao) {
        this.type = type;
        this.listThongbao = listThongbao;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<Thongbao> getListThongbao() {
        return listThongbao;
    }

    public void setListThongbao(List<Thongbao> listThongbao) {
        this.listThongbao = listThongbao;
    }
}
