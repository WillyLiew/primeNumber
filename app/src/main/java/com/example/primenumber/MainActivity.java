package com.example.primenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result ="";
                int counter = 0;
                Boolean p = true;
                EditText limit1 = (EditText) findViewById(R.id.limit1);
                EditText limit2 = (EditText) findViewById(R.id.limit2);
                TextView display = (TextView) findViewById(R.id.display);

                int l1 = Integer.parseInt(limit1.getText().toString());
                int l2 = Integer.parseInt(limit2.getText().toString());
                for(int x=l1;x<=l2;x++)
                {
                    p = true;
                    if(x == 1)
                        p = false;
                    for(int temp=x-1;temp>1;temp--)
                        if(x%temp==0)
                            p = false;
                    if(p)
                    {
                        result = result + x + ",  ";
                        counter += 1;
                    }
                }
                display.setText("There are "+counter+" prime number(s) between "+l1+" and " + l2+": \n"+result);
            }
        });

    }
}
