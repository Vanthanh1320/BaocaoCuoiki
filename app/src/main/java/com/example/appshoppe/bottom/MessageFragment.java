package com.example.appshoppe.bottom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.appshoppe.R;
import com.example.appshoppe.message.Thongbao;
import com.example.appshoppe.adapter.ThongbaoAdapter;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MessageFragment extends Fragment {
    private ListView lvitems;
    private ThongbaoAdapter adapter=null;
    private ArrayList<Thongbao> list;
    DatabaseReference mData;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View r = inflater.inflate(R.layout.fragment_message, container, false);
        lvitems=r.findViewById(R.id.lv);
        list=new ArrayList<Thongbao>();

        adapter= new ThongbaoAdapter(this.getActivity(),R.layout.item_thongbao,list);
        lvitems.setAdapter(adapter);

        mData= FirebaseDatabase.getInstance().getReference();

        Thongbao thongbao=new Thongbao();
        mData.child("ThongBao").push().setValue(thongbao);

        mData.child("ThongBao").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                Thongbao thongbao1=snapshot.getValue(Thongbao.class);
//                Toast.makeText(MessageFragment.this.getActivity(), thongbao1.getTtin(), Toast.LENGTH_SHORT).show();
                list.add(thongbao1);
                adapter.notifyDataSetChanged();
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


//        list.add(new Thongbao(R.drawable.km3,"Chương trình khuyến mãi dành cho các thành viên của Tuloshop","3 giờ trước"));
//        list.add(new Thongbao(R.drawable.km2,"Chương trình khuyến mãi giảm giá 50%, chỉ duy nhất hôm nay","2 ngày trước"));
//        list.add(new Thongbao(R.drawable.km1,"Chương trình tri ân khách hàng","1 tuần trước"));
//        list.add(new Thongbao(R.drawable.km4,"Chương trình siêu khuến mãi, giảm giá hơn 50% các sản phẩm","2 tuần trước"));
//


        return r;
    }
}
