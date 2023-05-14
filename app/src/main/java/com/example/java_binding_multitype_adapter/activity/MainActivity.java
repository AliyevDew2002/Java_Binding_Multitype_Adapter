package com.example.java_binding_multitype_adapter.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.java_binding_multitype_adapter.databinding.ActivityMainBinding;



public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

        initViews();
    }
    void initViews(){
        binding.mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetailPage();
            }
        });
    }
    void openDetailPage(){
        Intent intent= new Intent(this, DetailActivity.class);
        startActivity(intent);
    }
}