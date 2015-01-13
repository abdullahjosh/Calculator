package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by Zuel on 09-01-2015.
 */
public class CalculationActivity extends Activity {
    EditText n1,n2,ans;
    TextView r;
    RadioButton _add, _sub, _multi, _devide;
    Button _show;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculation);
        r= (TextView) findViewById(R.id.r);
        n1= (EditText) findViewById(R.id.num1);
        n2= (EditText) findViewById(R.id.num2);
        ans= (EditText) findViewById(R.id.answ);
        ans.setVisibility(View.INVISIBLE);
        r.setVisibility(View.INVISIBLE);
        _add= (RadioButton) findViewById(R.id.add);
        _sub= (RadioButton) findViewById(R.id.sub);
        _multi= (RadioButton) findViewById(R.id.multi);
        _devide= (RadioButton) findViewById(R.id.devide);
        _add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _sub.setChecked(false);
                _multi.setChecked(false);
                _devide.setChecked(false);
            }
        });
        _sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _add.setChecked(false);
                _multi.setChecked(false);
                _devide.setChecked(false);
            }
        });
        _multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _sub.setChecked(false);
                _add.setChecked(false);
                _devide.setChecked(false);
            }
        });
        _devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _sub.setChecked(false);
                _multi.setChecked(false);
                _add.setChecked(false);
            }
        });

        _show= (Button) findViewById(R.id.calculate);
        _show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=n1.getText().toString();
                String s2=n2.getText().toString();
                Long new1, new2, new3;
                new3=new Long(0);
                new1=new Long(0);
                new2=new Long(0);
                new1= Long.parseLong(s1);
                new2= Long.parseLong(s2);
                if(_add.isChecked()==true)
                {
                    new3=new1+new2;

                }
                if(_sub.isChecked()==true)
                {
                    new3=new1-new2;

                }
                if(_multi.isChecked()==true)
                {
                    new3=new1*new2;

                }
                if(_devide.isChecked()==true)
                {
                   // Double nd;
                   // if(v.getId()==R.id.calculate)
                  //  {

                    //    ans.setText(

                   // }
                    if(new2!=0){
                    new3=new1/new2;}
                }

                if(v.getId()==R.id.calculate)
                {
                    ans.setVisibility(View.VISIBLE);
                    r.setVisibility(View.VISIBLE);
                    if(new2!=0)
                    {
                    ans.setText(Long.toString(new3));
                    }
                    else
                    {
                        ans.setText("Infinity");
                    }

                }



            }
        });

        //simple commit and push using github :)

    }

}