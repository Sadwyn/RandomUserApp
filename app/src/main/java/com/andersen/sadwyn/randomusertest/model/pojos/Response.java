package com.andersen.sadwyn.randomusertest.model.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Response {
    @SerializedName("results")
    @Expose
    private List<User> users = new ArrayList<>();
    @SerializedName("info")
    @Expose
    private Info info;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}
