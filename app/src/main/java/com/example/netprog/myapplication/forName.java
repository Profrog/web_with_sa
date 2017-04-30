package com.example.netprog.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class forName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.for_searching_name);




        final EditText editText = (EditText)findViewById(R.id.edittext);
        Button button = (Button)findViewById(R.id.buttonforName);
        final TextView textView = (TextView)findViewById(R.id.textview);

        button.setOnClickListener(new View.OnClickListener(){
     @Override
             public void onClick(View v){

         textView.setText(editText.getText());
        //서버에서 들어온 값을 보여줘야 할 듯



        }

    });
    }






}