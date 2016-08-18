package com.example.suman.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {   //got user view
    EditText e1,e2;
    Button b;
    TextView t;
    private float sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);
        b = (Button)findViewById(R.id.button);
        t = (TextView)findViewById(R.id.textView3);

        AddData();
    }

    public  void AddData(){
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n1,n2,sum;
                n1 = Float.parseFloat(e1.getText().toString());
                n2 = Float.parseFloat(e2.getText().toString());

                sum = n1 + n2;

                s(sum);
            }
        });
    }

    private void s(float sum) {
        this.sum = sum;

        t.setText("SUM : "+sum);
    }

}

//done coding by om