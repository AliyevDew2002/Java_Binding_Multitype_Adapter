package com.example.java_binding_multitype_adapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.java_binding_multitype_adapter.databinding.MemberListQolipBinding;
import com.example.java_binding_multitype_adapter.model.Member;


import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Member_Adapter extends RecyclerView.Adapter<Member_Adapter.CustomViewHolder> {
    MemberListQolipBinding binding;
    private List<Member> members;
    private Context context;

    public Member_Adapter(Context context, ArrayList<Member> members) {
        this.context = context;
        this.members = members;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        MemberListQolipBinding binding = MemberListQolipBinding.inflate(layoutInflater);
        return new CustomViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        Member member = members.get(position);
        if (holder instanceof CustomViewHolder){
           ImageView profile = holder.binding.ivProfile;
           TextView  fullname=holder.binding.tvFullname;

           profile.setImageResource(member.getProfile());
           fullname.setText(member.getFullname());
        }
    }

    @Override
    public int getItemCount() {
        return members.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        private final MemberListQolipBinding binding;

        public CustomViewHolder(MemberListQolipBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }


    }
}

