package com.karthi.acpage1;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;

public class Game2a extends AppCompatActivity {
TextToSpeech t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_2a);
        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                }
            }
        });

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

    public void onBut16(View view) {
        t1.speak("Alma mater",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void onBut17(View view) {
        t1.speak("Verbiage",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void onBut18(View view)  {
        t1.speak("Militate",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void onBut19(View view)  {
        t1.speak("Iconoclast",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void onBut20(View view)  {
        t1.speak("Uxoricide",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void onBut21(View view)  {
        t1.speak("Creed",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void onBut22(View view)  {
        t1.speak("Equine",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void onBut23(View view)  {
        t1.speak("Harridan",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void onBut24(View view)  {
        t1.speak("Sororicide",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void onBut25(View view)  {
        t1.speak("Chauvinism",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void onBut26(View view)  {
        t1.speak("Misogamy",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void onBut27(View view)  {
        t1.speak("Gauche",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void onBut28(View view)  {
        t1.speak("Dexterous",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void onBut29(View view)  {
        t1.speak("Adroit",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void onBut30(View view)  {
        t1.speak("Sphygmomanomentor",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void onPage1Test(View view) {
        Intent in=new Intent(Game2a.this,Page2t.class);
        startActivity(in);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(Game2a.this,Home.class));
    }
}
