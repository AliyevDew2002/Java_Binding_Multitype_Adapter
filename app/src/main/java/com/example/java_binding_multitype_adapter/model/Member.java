package com.example.java_binding_multitype_adapter.model;

import java.io.Serializable;

public class Member implements Serializable {
    int profile;
    String fullname;

    public Member(int profile, String fullname){
        this.fullname=fullname;
        this.profile=profile;
    }

    public String getFullname() {
        return fullname;
    }

    public int getProfile() {
        return profile;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }
}
