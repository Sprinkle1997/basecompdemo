package com.example.lushichen.basecompdemo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends Activity implements CompoundButton.OnCheckedChangeListener {
    CheckBox box1;
    CheckBox box2;
    CheckBox box3;
    CheckBox box4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.font);
        init();
        //给复选按钮绑定事件
        box1.setOnCheckedChangeListener(this);//当前对象
        box2.setOnCheckedChangeListener(this);
        box3.setOnCheckedChangeListener(this);
        box4.setOnCheckedChangeListener(this);


    }

    //该方法用于初始化，找到复选框
    public void init() {
        box1 = (CheckBox) findViewById(R.id.box1);
        box2 = (CheckBox) findViewById(R.id.box2);
        box3 = (CheckBox) findViewById(R.id.box3);
        box4 = (CheckBox) findViewById(R.id.box4);
    }

    //buttonview：当前选中的按钮 ，ischecked:是否选中
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            Toast.makeText(this, "选中了" + buttonView.getText(), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "取消" + buttonView.getText(), Toast.LENGTH_SHORT).show();
        }

    }
}
