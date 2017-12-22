package com.karthi.acpage1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void next(View view) {
        Intent intent=new Intent(this,Page1.class);
        startActivity(intent);
    }

    public void inext(View view) {
        Intent intent=new Intent(this,Page1.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
       startActivity(intent);
    }
}
