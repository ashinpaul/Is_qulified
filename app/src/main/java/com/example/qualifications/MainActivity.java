package com.example.qualifications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2,c3;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(CheckBox) findViewById(R.id.c1);
        c2=(CheckBox) findViewById(R.id.c2);
        c3=(CheckBox) findViewById(R.id.c3);
        e1=(EditText) findViewById(R.id.e1);
    }
    public void ugselect(View v){
        if(c3.isChecked()) {
            c2.setChecked(true);
            c1.setChecked(true);
            e1.setText("ug,+2,sslc selected");
        }
        else{
            e1.setText("+2,sslc selected");
        }
    }
    public  void twoselect(View v){
        if(c2.isChecked()||(c2.isChecked()==false)){
            c1.setChecked(true);
            c3.setChecked(false);
            e1.setText("+2,sslc selected");
        }
    }
    public void sslcselect(View v){
        if(c1.isChecked()||(c1.isChecked()==false)){
            c2.setChecked(false);
            c3.setChecked(false);
            e1.setText("sslc selected");
        }
        else{
            e1.setText("");
        }
    }
}