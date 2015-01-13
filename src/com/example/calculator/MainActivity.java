package com.example.calculator;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button welcome;
        welcome=(Button) findViewById(R.id.button);
       // final Context con=this;
        welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
               // if(v.getId()==R.id.button)
               // {

               // }
                    Intent A= new Intent(getApplicationContext(),CalculationActivity.class);

                startActivity(A);
            }
        });
    }
}
