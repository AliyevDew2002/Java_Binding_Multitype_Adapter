package com.example.java_binding_multitype_adapter.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.java_binding_multitype_adapter.R;
import com.example.java_binding_multitype_adapter.adapter.Member_Adapter;
import com.example.java_binding_multitype_adapter.databinding.ActivityDetailBinding;
import com.example.java_binding_multitype_adapter.model.Member;


import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    ActivityDetailBinding detailBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        detailBinding=ActivityDetailBinding.inflate(getLayoutInflater());
        View view=detailBinding.getRoot();
        setContentView(view);


        initViews();
    }
    void initViews(){
        detailBinding.listView.setLayoutManager(new GridLayoutManager(this,1));
        refreshAdapter(prepareMemberList());
    }
    ArrayList<Member> prepareMemberList(){
        ArrayList<Member> members= new ArrayList<>();
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));
        members.add(new Member(R.drawable.ic_launcher_foreground,"Shaxzod Aliyev"));

        return members;
    }
    void refreshAdapter(ArrayList<Member> members){
        Member_Adapter adapter= new Member_Adapter(this,members);
        detailBinding.listView.setAdapter(adapter);
    }
}