package com.example.appshoppe.bottom;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.appshoppe.R;
import com.example.appshoppe.adapter.BrandAdapter;
import com.example.appshoppe.adapter.GiayAdapter;
import com.example.appshoppe.model.Brand;
import com.example.appshoppe.model.Giay;

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Fragment {

    private GridView grv_brand;
    private ArrayList<Brand> brandList;
    private BrandAdapter brandAdapter;
    private Brand brand;
    Context context;


    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context=getActivity();
        View r = inflater.inflate(R.layout.fragment_search, container, false);

        grv_brand=(GridView) r.findViewById(R.id.gv_brand);
        brandList=new ArrayList<>();

        listbrand();
        brandAdapter=new BrandAdapter(context,brandList);
        grv_brand.setAdapter(brandAdapter);

        return r;
    }

    private void listbrand() {

        brand=new Brand();
        brand.setId(1);
        brand.setHinh(R.drawable.puma);
        brand.setTen("Puma");
        brandList.add(brand);

        brand=new Brand();
        brand.setId(2);
        brand.setHinh(R.drawable.wood);
        brand.setTen("Wooland");
        brandList.add(brand);

        brand=new Brand();
        brand.setId(3);
        brand.setHinh(R.drawable.campus);
        brand.setTen("Campus");
        brandList.add(brand);

        brand=new Brand();
        brand.setId(4);
        brand.setHinh(R.drawable.vkc);
        brand.setTen("VKC");
        brandList.add(brand);

        brand=new Brand();
        brand.setId(5);
        brand.setHinh(R.drawable.power);
        brand.setTen("Power");
        brandList.add(brand);

        brand=new Brand();
        brand.setId(6);
        brand.setHinh(R.drawable.paragon);
        brand.setTen("Paragon");
        brandList.add(brand);

        brand=new Brand();
        brand.setId(7);
        brand.setHinh(R.drawable.action);
        brand.setTen("Action");
        brandList.add(brand);

        brand=new Brand();
        brand.setId(8);
        brand.setHinh(R.drawable.fsport);
        brand.setTen("F Sports");
        brandList.add(brand);

        brand=new Brand();
        brand.setId(9);
        brand.setHinh(R.drawable.dhl);
        brand.setTen("DHL");
        brandList.add(brand);

        brand=new Brand();
        brand.setId(10);
        brand.setHinh(R.drawable.beta);
        brand.setTen("Beta");
        brandList.add(brand);

        brand=new Brand();
        brand.setId(11);
        brand.setHinh(R.drawable.sole);
        brand.setTen("Solethreads");
        brandList.add(brand);

        brand=new Brand();
        brand.setId(12);
        brand.setHinh(R.drawable.aerowalk);
        brand.setTen("Aerowalk");
        brandList.add(brand);

    }

}
