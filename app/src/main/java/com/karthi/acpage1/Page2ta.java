package com.karthi.acpage1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Page2ta extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2ta);
       

        Intent intent=getIntent();
        int count=intent.getIntExtra("count",0);
        TextView textView=findViewById(R.id.score);
        textView.setText("Answered "+count+" words correctly");
    }

    public void onGamenext(View view) {
        startActivity(new Intent(Page2ta.this,Page3.class));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(Page2ta.this,Home.class));
    }
}
