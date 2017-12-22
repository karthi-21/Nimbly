package com.karthi.acpage1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    }

    boolean handler=new Handler().postDelayed(new Runnable(){
        @Override
        public void run() {
                /* Create an Intent that will start the Menu-Activity. */
            Intent mainIntent = new Intent(SplashScreen.this,Home.class);
            SplashScreen.this.startActivity(mainIntent);
            SplashScreen.this.finish();
        }
    }, SPLASH_DISPLAY_LENGTH);

}
