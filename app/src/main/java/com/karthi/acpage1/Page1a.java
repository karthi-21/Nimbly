package com.karthi.acpage1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Page1a extends Activity implements SpellCheckerSession.SpellCheckerSessionListener {
    int count;
    int countt;
    private SpellCheckerSession mScs;
    TextView txt;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_1a);

        final Intent intent=getIntent();
        final String mess=intent.getStringExtra("text");
        final String[] splitted=mess.split("\\s+");
        final String len= String.valueOf(splitted.length);
       //Toast.makeText(this,len,Toast.LENGTH_LONG).show();


        txt=findViewById(R.id.txext);
        txt.setText("Number of words you have entered is :" + len);
        Button but=findViewById(R.id.butpage1a);
///////////
        Button check=findViewById(R.id.checkk);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0;i<Integer.parseInt(len);i++){
                        mScs.getSuggestions(new TextInfo(splitted[i]), 1);
                    }
            }
        });



       /////////////

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        Intent intent1=new Intent(Page1a.this,Page2.class);
                        startActivity(intent1);
            }
        });




    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(Page1a.this,Home.class));
    }


   //spell
    public void onResume() {
        super.onResume();
        final TextServicesManager tsm = (TextServicesManager)
                getSystemService(Context.TEXT_SERVICES_MANAGER_SERVICE);
        mScs = tsm != null ? tsm.newSpellCheckerSession(null, null, this, true) : null;
    }

    public void onPause() {
        super.onPause();
        if (mScs != null) {
            mScs.close();
        }
    }

    public void onGetSuggestions(final SuggestionsInfo[] arg0) {
        final StringBuilder sb = new StringBuilder();

        // sb.append("\n").append(arg0[0].getSuggestionAt(0));
        for (SuggestionsInfo anArg0 : arg0) {
            // Returned suggestions are contained in SuggestionsInfo
            final int len = anArg0.getSuggestionsCount();
            //sb.append('\n'+ed1.getText().toString()+"="+ arg0[i].getSuggestionAt(0));
            //sb.append('\n');

            for (int j = 0; j < len; ++j) {
                sb.append('\n').append(arg0[0].getSuggestionAt(j));
            }

            //sb.append(" (" + len + ")");
        }

        runOnUiThread(new Runnable() {
            public void run() {
                txt.append(sb.toString());

            }
        });
    }

    @Override
    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] arg0) {
        // TODO Auto-generated method stub
    }
//spell finished

}
