package ir.hs.myapplication.viewmodel;

import android.content.Context;

import ir.hs.myapplication.model.user;

public class UserViewModel {

    private String name;
    private  String phone;

    private Context context;

    public UserViewModel(user user) {
        this.name = name;
        this.phone = phone;
    }

    public UserViewModel(Context context) {
        this.context = context;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
