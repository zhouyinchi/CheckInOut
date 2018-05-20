package com.wls.zhouyinchi.checkinout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import butterknife.ButterKnife;
/**
 * Created by stephon on 2018/5/19.
 */

public class BaseActivity extends AppCompatActivity implements View.OnClickListener,IComActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setCompones();
        setData();
    }


    @Override
    public void onClick(View view) {
    }

    @Override
    public void setCompones() {

    }

    @Override
    public void setData() {
        ButterKnife.bind(this);

    }
}
