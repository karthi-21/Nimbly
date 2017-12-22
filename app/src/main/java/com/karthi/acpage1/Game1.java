package com.karthi.acpage1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Game1 extends AppCompatActivity  {

    TextView timer;
    Handler customHandler=new Handler();
    Long startTime=0L,timeInMilliSeconds=0L,timeSwapBuff=0L,updateTime=0L;

    Runnable updateTimerThread=new Runnable() {
        @SuppressLint({"SetTextI18n", "DefaultLocale"})
        @Override
        public void run() {
            timeInMilliSeconds=SystemClock.uptimeMillis()-startTime;
            updateTime=timeSwapBuff+timeInMilliSeconds;
            int secs=(int) (updateTime/1000);
            int mins=secs/60;
            secs%=60;
            int milliseconds=(int)(updateTime%1000);
            timer.setText(""+mins+":"+String.format("%2d",secs)+":"+String.format("%3d",milliseconds));
            customHandler.postDelayed(this,0);
        }
    };
    private final int SPLASH_DISPLAY_LENGTH = 155000;
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_1);

        timer=findViewById(R.id.id_timer);

        startTime= SystemClock.uptimeMillis();
        customHandler.postDelayed(updateTimerThread,0);

        ed=(EditText)findViewById(R.id.edit);

    }



    boolean handler=new Handler().postDelayed(new Runnable(){
        @Override
        public void run() {
                /* Create an Intent that will start the Menu-Activity. */
            Intent mainIntent = new Intent(Game1.this,Page1a.class);
            String str=ed.getText().toString();
            mainIntent.putExtra("text",str);
            Game1.this.startActivity(mainIntent);
            Game1.this.finish();
        }
    }, SPLASH_DISPLAY_LENGTH);

    public void finish(View view) {
        Intent mainIntent = new Intent(Game1.this,Page1a.class);
        String str=ed.getText().toString();
        mainIntent.putExtra("text",str);
        Game1.this.startActivity(mainIntent);
        Game1.this.finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(Game1.this,Home.class));
    }
}




