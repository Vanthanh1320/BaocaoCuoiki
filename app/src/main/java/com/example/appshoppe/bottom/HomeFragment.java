package com.example.appshoppe.bottom;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.appshoppe.GioHangActivity;
import com.example.appshoppe.GridActivity;
import com.example.appshoppe.adapter.AccAdapter;
import com.example.appshoppe.adapter.BagAdapter;
import com.example.appshoppe.adapter.BoyAdapter;
import com.example.appshoppe.adapter.GirlAdapter;
import com.example.appshoppe.adapter.WomenAdapter;
import com.example.appshoppe.model.Acc;
import com.example.appshoppe.model.Bags;
import com.example.appshoppe.model.Boy;
import com.example.appshoppe.model.Giay;
import com.example.appshoppe.R;
import com.example.appshoppe.adapter.GiayAdapter;
import com.example.appshoppe.model.Girl;
import com.example.appshoppe.model.Women;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private GridView grv_men,grv_women,grv_boy,grv_girl,grv_acc,grv_bag;
    private ArrayList<Giay> giayList;
    private ArrayList<Boy> boyList;
    private ArrayList<Women> womenList;
    private ArrayList<Girl> girlList;
    private ArrayList<Acc> accList;
    private ArrayList<Bags> bagsList;
    private BoyAdapter boyAdapter;
    private WomenAdapter womenAdapter;
    private GirlAdapter girlAdapter;
    private AccAdapter accAdapter;
    private BagAdapter bagAdapter;
    private GiayAdapter giayAdapter;
    private Giay giay;
    private Boy boy;
    private Girl girl;
    private Women women;
    private Acc acc;
    private Bags bags;
//    private CustomAdapter customAdapter;
    Context context;
    Button btn_shop;
    DatabaseReference mData;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context=getActivity();
        View r = inflater.inflate(R.layout.fragment_home, container, false);


        grv_men = r.findViewById(R.id.gv_men);
        grv_women=r.findViewById(R.id.gv_women);
        grv_boy=r.findViewById(R.id.gv_boy);
        grv_girl=r.findViewById(R.id.gv_girl);
        grv_acc=r.findViewById(R.id.gv_acc);
        grv_bag=r.findViewById(R.id.gv_bag);
        giayList=new ArrayList<>();
        boyList=new ArrayList<>();
        womenList=new ArrayList<>();
        girlList=new ArrayList<>();
        accList=new ArrayList<>();
        bagsList=new ArrayList<>();

//        listgiaymen();
        giayAdapter=new GiayAdapter(context,giayList);
        grv_men.setAdapter(giayAdapter);

        mData= FirebaseDatabase.getInstance().getReference();

//        Giay giay=new Giay();
//        mData.child("Men").push().setValue(giay);

        mData.child("Men").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                Giay g=snapshot.getValue(Giay.class);
                giayList.add(g);
                giayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

//        listgiaywomen();
        womenAdapter=new WomenAdapter(context,womenList);
        grv_women.setAdapter(womenAdapter);

        mData= FirebaseDatabase.getInstance().getReference();

//        Women women=new Women();
//        mData.child("Women").push().setValue(women);

        mData.child("Women").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                Women w=snapshot.getValue(Women.class);
                womenList.add(w);
                womenAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


//        listgiayboy();
        boyAdapter=new BoyAdapter(context,boyList);
        grv_boy.setAdapter(boyAdapter);

        mData= FirebaseDatabase.getInstance().getReference();
//
//        Boy boy=new Boy();
//        mData.child("Boy").push().setValue(boy);

        mData.child("Boy").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                Boy b=snapshot.getValue(Boy.class);
                boyList.add(b);
                boyAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        girlAdapter=new GirlAdapter(context,girlList);
        grv_girl.setAdapter(girlAdapter);


        mData= FirebaseDatabase.getInstance().getReference();

//        Girl girl=new Girl();
//        mData.child("Girl").push().setValue(girl);

        mData.child("Girl").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                Girl g=snapshot.getValue(Girl.class);
                girlList.add(g);
                girlAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



        accAdapter=new AccAdapter(context,accList);
        grv_acc.setAdapter(accAdapter);

        mData= FirebaseDatabase.getInstance().getReference();

//        Acc acc=new Acc();
//        mData.child("Acc").push().setValue(acc);

        mData.child("Acc").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                Acc ac=snapshot.getValue(Acc.class);
                accList.add(ac);
                accAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        bagAdapter=new BagAdapter(context,bagsList);
        grv_bag.setAdapter(bagAdapter);

        mData= FirebaseDatabase.getInstance().getReference();

//        Bags bags=new Bags();
//        mData.child("Bags").push().setValue(bags);

        mData.child("Bags").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                Bags bg=snapshot.getValue(Bags.class);
                bagsList.add(bg);
                bagAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        btn_shop=r.findViewById(R.id.shop);
        btn_shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeFragment.this.getActivity(), GioHangActivity.class);
                startActivity(intent);
            }
        });

        ImageSlider imageSlider = r.findViewById(R.id.slide);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.qcgiay3));
        slideModels.add(new SlideModel(R.drawable.qcgiay));
        slideModels.add(new SlideModel(R.drawable.qcgiay2));
        slideModels.add(new SlideModel(R.drawable.qcgiay4));
        slideModels.add(new SlideModel(R.drawable.qcgiay5));
        imageSlider.setImageList(slideModels, true);


        grv_men.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(context, giayList.get(i).getTen(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context.getApplicationContext(), GridActivity.class);
                intent.putExtra("name", giayList.get(i).getTen());
                intent.putExtra("count", giayList.get(i).getGia());
//              intent.putExtra("hinh",giayList.get(i).getHinh());
                startActivity(intent);
            }

        });

        grv_women.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(context, womenList.get(i).getTen(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context.getApplicationContext(), GridActivity.class);
                intent.putExtra("name", womenList.get(i).getTen());
                intent.putExtra("count", womenList.get(i).getGia());
//                intent.putExtra("image", womenList.get(i).getHinh());
                startActivity(intent);
            }

        });

        grv_boy.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(context, boyList.get(i).getTen(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context.getApplicationContext(), GridActivity.class);
                intent.putExtra("name", boyList.get(i).getTen());
                intent.putExtra("count", boyList.get(i).getGia());
//                intent.putExtra("image", boyList.get(i).getHinh());
                startActivity(intent);
            }

        });

        grv_girl.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(context, girlList.get(i).getTen(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context.getApplicationContext(), GridActivity.class);
                intent.putExtra("name", girlList.get(i).getTen());
                intent.putExtra("count", girlList.get(i).getGia());
//                intent.putExtra("image", girlList.get(i).getHinh());
                startActivity(intent);
            }

        });

        grv_acc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(context, accList.get(i).getTen(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context.getApplicationContext(), GridActivity.class);
                intent.putExtra("name", accList.get(i).getTen());
                intent.putExtra("count", accList.get(i).getGia());
//                intent.putExtra("image", accList.get(i).getHinh());
                startActivity(intent);
            }

        });

        grv_bag.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(context, bagsList.get(i).getTen(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context.getApplicationContext(), GridActivity.class);
                intent.putExtra("name", bagsList.get(i).getTen());
                intent.putExtra("count", bagsList.get(i).getGia());
//                intent.putExtra("image", bagsList.get(i).getHinh());
                startActivity(intent);
            }

        });


        return r;
    }




}
