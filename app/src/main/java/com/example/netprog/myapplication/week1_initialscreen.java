package com.example.netprog.myapplication;

        import android.content.Intent;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.DisplayMetrics;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.TextView;

        import com.ssomai.android.scalablelayout.ScalableLayout;

/**
 * Created by netprog on 2017-04-10.
 */

public class week1_initialscreen extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.week1_initialscreen);

        //-----------
        Button button1 = (Button) findViewById(R.id.forName) ;
        button1.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), forName.class);
                startActivity(intent);
                //finish();
            }
        });


        Button button2 = (Button) findViewById(R.id.forList);
        button2.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), forList.class);
                startActivity(intent);
                //finish();
            }
        });


        Button button3 = (Button) findViewById(R.id.forSolution);
        button3.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), forSolution.class);
                startActivity(intent);
                //finish();
            }
        });
    }}


