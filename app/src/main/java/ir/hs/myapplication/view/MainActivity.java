package ir.hs.myapplication.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import ir.hs.myapplication.R;
import ir.hs.myapplication.databinding.ActivityMainBinding;
import ir.hs.myapplication.viewmodel.UserViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserViewModel userViewModel = new UserViewModel(this);
        activityMainBinding.setUser(userViewModel);
    }
}
