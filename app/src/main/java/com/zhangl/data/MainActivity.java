package com.zhangl.data;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangl.data.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        UserBean userBean = new UserBean("zhangl",24);

        mainBinding.setUserBean(userBean);


    }
}
