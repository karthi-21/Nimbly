package com.karthi.acpage1;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.Locale;

public class Game2 extends AppCompatActivity {
    TextToSpeech t1;
    int count=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_2);

        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                     t1.setLanguage(Locale.US);
                }
            }
        });

    }

    public void onBut1(View view) {
        t1.speak("rendezvous", TextToSpeech.QUEUE_FLUSH, null);
    }

    public void onBut2(View view) {
        t1.speak("apathy", TextToSpeech.QUEUE_FLUSH, null);
    }

    public void onBut3(View view) {
        t1.speak("nescience", TextToSpeech.QUEUE_FLUSH, null);
    }

    public void onBut4(View view) {
        t1.speak("grotesque", TextToSpeech.QUEUE_FLUSH, null);
    }

    public void onBut5(View view) {
        t1.speak("obviate", TextToSpeech.QUEUE_FLUSH, null);
    }

    public void onBut6(View view) {
        t1.speak("malign", TextToSpeech.QUEUE_FLUSH, null);
    }

    public void onBut7(View view) {
        t1.speak("acquiesce", TextToSpeech.QUEUE_FLUSH, null);
    }

    public void onBut8(View view) {
        t1.speak("prognostic", TextToSpeech.QUEUE_FLUSH, null);
    }

    public void onBut9(View view) {
        t1.speak("effigy", TextToSpeech.QUEUE_FLUSH, null);
    }

    public void onBut10(View view) {
        t1.speak("bibulous", TextToSpeech.QUEUE_FLUSH, null);
    }

    public void onBut11(View view) {
        t1.speak("dolorous", TextToSpeech.QUEUE_FLUSH, null);
    }

    public void onBut12(View view) {
        t1.speak("querulous", TextToSpeech.QUEUE_FLUSH, null);
    }

    public void onBut13(View view) {
        t1.speak("ubiquity", TextToSpeech.QUEUE_FLUSH, null);
    }

    public void onBut14(View view) {
        t1.speak("labyrinth", TextToSpeech.QUEUE_FLUSH, null);
    }

    public void onBut15(View view) {
        t1.speak("regicide", TextToSpeech.QUEUE_FLUSH, null);
    }

    public void onPause(){
        if(t1 !=null){
            t1.stop();
            t1.shutdown();
        }
        super.onPause();


    }

    public void onNext1(View view) {

            Intent in = new Intent(Game2.this, Page2a.class);
            startActivity(in);
        }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(Game2.this,Home.class));
    }

}
