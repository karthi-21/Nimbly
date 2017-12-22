package com.karthi.acpage1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class Page3a extends AppCompatActivity implements View.OnClickListener {
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv0;
    TextView tvv1,tvv2,tvv3,tvv4,tvv5,tvv6,tvv7,tvv8,tvv9,tvv0;
    LottieAnimationView av0,av1,av2,av3,av4,av5,av6,av7,av8,av9;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3a);

        tv0=findViewById(R.id.same0);
        tv0.setOnClickListener(this);
        tv1=findViewById(R.id.same1);
        tv1.setOnClickListener(this);
        tv2=findViewById(R.id.same2);
        tv2.setOnClickListener(this);
        tv3=findViewById(R.id.same3);
        tv3.setOnClickListener(this);
        tv4=findViewById(R.id.same4);
        tv4.setOnClickListener(this);
        tv5=findViewById(R.id.same5);
        tv5.setOnClickListener(this);
        tv6=findViewById(R.id.same6);
        tv6.setOnClickListener(this);
        tv7=findViewById(R.id.same7);
        tv7.setOnClickListener(this);
        tv8=findViewById(R.id.same8);
        tv8.setOnClickListener(this);
        tv9=findViewById(R.id.same9);
        tv9.setOnClickListener(this);

        tvv0=findViewById(R.id.opposite0);
        tvv0.setOnClickListener(this);
        tvv1=findViewById(R.id.opposite1);
        tvv1.setOnClickListener(this);
        tvv2=findViewById(R.id.opposite2);
        tvv2.setOnClickListener(this);
        tvv3=findViewById(R.id.opposite3);
        tvv3.setOnClickListener(this);
        tvv4=findViewById(R.id.opposite4);
        tvv4.setOnClickListener(this);
        tvv5=findViewById(R.id.opposite5);
        tvv5.setOnClickListener(this);
        tvv6=findViewById(R.id.opposite6);
        tvv6.setOnClickListener(this);
        tvv7=findViewById(R.id.opposite7);
        tvv7.setOnClickListener(this);
        tvv8=findViewById(R.id.opposite8);
        tvv8.setOnClickListener(this);
        tvv9=findViewById(R.id.opposite9);
        tvv9.setOnClickListener(this);

        av0=findViewById(R.id.animation_view0);
        av1=findViewById(R.id.animation_view1);
        av2=findViewById(R.id.animation_view2);
        av3=findViewById(R.id.animation_view3);
        av4=findViewById(R.id.animation_view4);
        av5=findViewById(R.id.animation_view5);
        av6=findViewById(R.id.animation_view6);
        av7=findViewById(R.id.animation_view7);
        av8=findViewById(R.id.animation_view8);
        av9=findViewById(R.id.animation_view9);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.same0: tv0.setTextColor(Color.RED);tv0.setEnabled(false);tvv0.setEnabled(false);
                Toast.makeText(Page3a.this,"Wrong",Toast.LENGTH_LONG).show();break;

            case R.id.same1:tv1.setTextColor(Color.RED);tv1.setEnabled(false);tvv1.setEnabled(false);
                Toast.makeText(Page3a.this,"Wrong",Toast.LENGTH_LONG).show();break;

            case R.id.same2:av2.playAnimation();count++;tv2.setEnabled(false);tvv2.setEnabled(false);
                tv2.setTextColor(Color.GREEN);break;
            case R.id.same3:av3.playAnimation();count++;tv3.setEnabled(false);tvv3.setEnabled(false);
                tv3.setTextColor(Color.GREEN);break;
            case R.id.same4:av4.playAnimation();count++;tv4.setEnabled(false);tvv4.setEnabled(false);
                tv4.setTextColor(Color.GREEN);break;
            case R.id.same5:av5.playAnimation();count++;tv5.setEnabled(false);tvv5.setEnabled(false);
                tv5.setTextColor(Color.GREEN);break;
            case R.id.same6:av6.playAnimation();count++;tv6.setEnabled(false);tvv6.setEnabled(false);
                tv6.setTextColor(Color.GREEN);break;

            case R.id.same7:tv7.setTextColor(Color.RED);tv7.setEnabled(false);tvv7.setEnabled(false);
                Toast.makeText(Page3a.this,"Wrong",Toast.LENGTH_LONG).show();break;

            case R.id.same8:av8.playAnimation();count++;tv8.setEnabled(false);tvv8.setEnabled(false);
                tv8.setTextColor(Color.GREEN);break;
            case R.id.same9:av9.playAnimation();count++;tv9.setEnabled(false);tvv9.setEnabled(false);
                tv9.setTextColor(Color.GREEN);break;

            case R.id.opposite0:av0.playAnimation();tv0.setEnabled(false);tvv0.setEnabled(false);
                tvv0.setTextColor(Color.rgb(0,128,0));break;

            case R.id.opposite1:av1.playAnimation();count++;tv1.setEnabled(false);tvv1.setEnabled(false);
                tvv1.setTextColor(Color.GREEN);break;

            case R.id.opposite2:tvv2.setTextColor(Color.RED);tv2.setEnabled(false);tvv2.setEnabled(false);
                Toast.makeText(Page3a.this,"Wrong",Toast.LENGTH_LONG).show();break;

            case R.id.opposite3:tvv3.setTextColor(Color.RED);tv3.setEnabled(false);tvv3.setEnabled(false);
                Toast.makeText(Page3a.this,"Wrong",Toast.LENGTH_LONG).show();break;

            case R.id.opposite4:tvv4.setTextColor(Color.RED);tv4.setEnabled(false);tvv4.setEnabled(false);
                Toast.makeText(Page3a.this,"Wrong",Toast.LENGTH_LONG).show();break;

            case R.id.opposite5:tvv5.setTextColor(Color.RED);tv5.setEnabled(false);tvv5.setEnabled(false);
                Toast.makeText(Page3a.this,"Wrong",Toast.LENGTH_LONG).show();break;

            case R.id.opposite6:tvv6.setTextColor(Color.RED);tv6.setEnabled(false);tvv6.setEnabled(false);
                Toast.makeText(Page3a.this,"Wrong",Toast.LENGTH_LONG).show();break;

            case R.id.opposite7:av7.playAnimation();count++;tv7.setEnabled(false);tvv7.setEnabled(false);
                tvv7.setTextColor(Color.GREEN);break;

            case R.id.opposite8:tvv8.setTextColor(Color.RED);tv8.setEnabled(false);tvv8.setEnabled(false);
                Toast.makeText(Page3a.this,"Wrong",Toast.LENGTH_LONG).show();break;

            case R.id.opposite9:tvv9.setTextColor(Color.RED);tv9.setEnabled(false);tvv9.setEnabled(false);
                Toast.makeText(Page3a.this,"Wrong",Toast.LENGTH_LONG).show();break;
            default:break;
        }

    }

    public void levelup(View view) {

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(Page3a.this,Home.class));
    }
}
