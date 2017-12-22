package com.karthi.acpage1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Page2t extends AppCompatActivity {
//int count=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_2t);
    }

    public void onPageTest(View view) {

            Intent intent = new Intent(this, Game2t.class);
            startActivity(intent);
        }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(Page2t.this,Home.class));
    }
}
