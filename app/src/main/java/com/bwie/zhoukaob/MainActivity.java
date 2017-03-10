package com.bwie.zhoukaob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private Yuan yuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        yuan = (Yuan) findViewById(R.id.yuan);
        yuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //四位随机数
                int numcode = (int) ((Math.random() * 9 + 1) * 1000);
                String smstext = ""+numcode;
                tv.setText(smstext);
            }
        });

    }


}
