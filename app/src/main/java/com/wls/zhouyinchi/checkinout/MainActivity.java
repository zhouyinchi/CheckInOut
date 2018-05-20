package com.wls.zhouyinchi.checkinout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.OnClick;

import com.beardedhen.androidbootstrap.BootstrapButton;
import com.beardedhen.androidbootstrap.BootstrapButtonGroup;
import com.beardedhen.androidbootstrap.api.defaults.ButtonMode;

public class MainActivity extends BaseActivity{

    @BindView(R.id.weekday_group) BootstrapButtonGroup weekdayGroup;
    @BindView(R.id.btnMon) BootstrapButton MonBtn;
    @BindView(R.id.btnTue) BootstrapButton TueBtn;
    @BindView(R.id.btnWed) BootstrapButton WedBtn;
    @BindView(R.id.btnThu) BootstrapButton ThuBtn;
    @BindView(R.id.btnFri) BootstrapButton FriBtn;
    @BindView(R.id.btnSat) BootstrapButton SatBtn;
    @BindView(R.id.btnSun) BootstrapButton SunBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public void setCompones() {
        super.setCompones();
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setData() {
        super.setData();
        weekdayGroup.setButtonMode(ButtonMode.REGULAR);
        weekdayGroup.setClickable(false);
        SunBtn.setClickable(false);
        SatBtn.setClickable(false);
        MonBtn.setSelected(true);
        TueBtn.setSelected(true);
        WedBtn.setSelected(true);
        ThuBtn.setSelected(true);
        FriBtn.setSelected(true);
    }

    @OnClick(R.id.time_btn_m) void onMouTimeSelect(){
    }
    @OnClick(R.id.time_btn_m) void onAftTimeSelect(){
    }
    @OnClick(R.id.time_btn_m) void onlatSelect(){
    }
    @OnClick(R.id.time_btn_m) void onLonSelect(){
    }
    @OnClick(R.id.time_btn_m) void onLocSelect(){
    }
}
