package com.karthi.acpage1;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class Game2t extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10;
String str1,str2,str3,str4,str5,str6,str7,str8,str9,str10;
TextToSpeech t1;
TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10;
Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10;
int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_2t);

        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                }
            }
        });
    }
    public void speak1(View view) {
        t1.speak("rendezvous", TextToSpeech.QUEUE_FLUSH, null);
    }
    public void speak2(View view) {
        t1.speak("malign", TextToSpeech.QUEUE_FLUSH, null);
    }
    public void speak3(View view) {
        t1.speak("querulous", TextToSpeech.QUEUE_FLUSH, null);
    }
    public void speak4(View view) {
        t1.speak("effigy", TextToSpeech.QUEUE_FLUSH, null);
    }
    public void speak5(View view) {
        t1.speak("verbiage", TextToSpeech.QUEUE_FLUSH, null);
    }
    public void speak6(View view) {
        t1.speak("equine", TextToSpeech.QUEUE_FLUSH, null);
    }
    public void speak7(View view) {
        t1.speak("misogamy", TextToSpeech.QUEUE_FLUSH, null);
    }
    public void speak8(View view) {
        t1.speak("iconoclast", TextToSpeech.QUEUE_FLUSH, null);
    }
    public void speak9(View view) {
        t1.speak("harridan", TextToSpeech.QUEUE_FLUSH, null);
    }
    public void speak10(View view) {
        t1.speak("adroit", TextToSpeech.QUEUE_FLUSH, null);
    }


    public void check1(View view) {
        ed1=findViewById(R.id.editbox1);
        ed1.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        str1=ed1.getText().toString();
        if (str1.equals("rendezvous")){
            tv1=findViewById(R.id.correct1);
            tv1.setText("☺ Correct");
            count++;
        }
        else {
            tv1=findViewById(R.id.worng1);
            tv1.setText("× Wrong\nrendezvous");
        }
        bt1=findViewById(R.id.button);
        bt1.setEnabled(false);
    }

    public void check2(View view) {
        ed2=findViewById(R.id.editbox2);
        ed2.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        str2=ed2.getText().toString();
        if (str2.equals("malign")){
            tv2=findViewById(R.id.correct2);
            tv2.setText("☺ Correct");
            count++;
        }
        else {
            tv2=findViewById(R.id.worng2);
            tv2.setText("× Wrong\nmalign");
        }
        bt2=findViewById(R.id.button2);
        bt2.setEnabled(false);
    }

    public void check3(View view) {
        ed3=findViewById(R.id.editbox3);
        ed3.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        str3=ed3.getText().toString();
        if (str3.equals("querulous")){
            tv3=findViewById(R.id.correct3);
            tv3.setText("☺ Correct");
            count++;
        }
        else {
            tv3=findViewById(R.id.worng3);
            tv3.setText("× Wrong\nquerulous");
        }
        bt3=findViewById(R.id.button3);
        bt3.setEnabled(false);
    }

    public void check4(View view) {
        ed4=findViewById(R.id.editbox4);
        ed4.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        str4=ed4.getText().toString();
        if (str4.equals("effigy")){
            tv4=findViewById(R.id.correct4);
            tv4.setText("☺ Correct");
            count++;
        }
        else {
            tv4=findViewById(R.id.worng4);
            tv4.setText("× Wrong\neffigy");
        }
        bt4=findViewById(R.id.button4);
        bt4.setEnabled(false);
    }

    public void check5(View view) {
        ed5=findViewById(R.id.editbox5);
        ed5.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        str5=ed5.getText().toString();
        if (str5.equals("verbiage")){
            tv5=findViewById(R.id.correct5);
            tv5.setText("☺ Correct");
            count++;
        }
        else {
            tv5=findViewById(R.id.worng5);
            tv5.setText("× Wrong\nverbiage");
        }
        bt5=findViewById(R.id.button5);
        bt5.setEnabled(false);
    }

    public void check6(View view) {
        ed6=findViewById(R.id.editbox6);
        ed6.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        str6=ed6.getText().toString();
        if (str6.equals("equine")){
            tv6=findViewById(R.id.correct6);
            tv6.setText("☺ Correct");
            count++;
        }
        else {
            tv6=findViewById(R.id.worng6);
            tv6.setText("× Wrong\nequine");
        }
        bt6=findViewById(R.id.button6);
        bt6.setEnabled(false);
    }

    public void check7(View view) {
        ed7=findViewById(R.id.editbox7);
        ed7.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        str7=ed7.getText().toString();
        if (str7.equals("misogamy")){
            tv7=findViewById(R.id.correct7);
            tv7.setText("☺ Correct");
            count++;
        }
        else {
            tv7=findViewById(R.id.worng7);
            tv7.setText("× Wrong\nmisogamy");
        }
        bt7=findViewById(R.id.button7);
        bt7.setEnabled(false);
    }

    public void check8(View view) {
        ed8=findViewById(R.id.editbox8);
        ed8.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        str8=ed8.getText().toString();
        if (str8.equals("iconoclast")){
            tv8=findViewById(R.id.correct8);
            tv8.setText("☺ Correct");
            count++;
        }
        else {
            tv8=findViewById(R.id.worng8);
            tv8.setText("× Wrong\niconoclast");
        }
        bt8=findViewById(R.id.button8);
        bt8.setEnabled(false);
    }

    public void check9(View view) {
        ed9=findViewById(R.id.editbox9);
        ed9.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        str9=ed9.getText().toString();
        if (str9.equals("harridan")){
            tv9=findViewById(R.id.correct9);
            tv9.setText("☺ Correct");
            count++;
        }
        else {
            tv9=findViewById(R.id.worng9);
            tv9.setText("× Wrong\nharridan");
        }
        bt9=findViewById(R.id.button9);
        bt9.setEnabled(false);
    }

    public void check10(View view) {
        ed10=findViewById(R.id.editbox10);
        ed10.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        str10=ed10.getText().toString();
        if (str10.equals("adroit")){
            tv10=findViewById(R.id.correct10);
            tv10.setText("☺ Correct");
            count++;
        }
        else {
            tv10=findViewById(R.id.worng10);
            tv10.setText("× Wrong\nadroit");
        }
        bt10=findViewById(R.id.button10);
        bt10.setEnabled(false);
    }

    public void onPage3(View view) {
        Intent intent=new Intent(this,Page2ta.class);
        intent.putExtra("count",count);
        startActivity(intent);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(Game2t.this,Home.class));
    }

}
