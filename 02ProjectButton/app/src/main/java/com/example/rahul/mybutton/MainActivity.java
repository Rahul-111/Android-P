package com.example.rahul.mybutton;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Button button;
    //Button buttonClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        button = findViewById(R.id.mybtn);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("TEST","Android Clicked");
//            }
//        });
//        buttonClick = findViewById(R.id.mybtnClick); //remains to make id
//        buttonClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("TEST","You Clicked");
//            }
//        });

    }

    public void redPressed(View view){
//    {
//        Context context1 = getApplicationContext();
//        CharSequence text1 = "Hello from Blue";
//        int duration1 = Toast.LENGTH_SHORT;
//
//        Toast toast = Toast.makeText(context1,text1,duration1);
//        toast.show();
    Toast.makeText(getApplicationContext(),"Hello from blue",Toast.LENGTH_SHORT).show();
    }
    public void greenPressed(View view){
     //   Log.d("Green","Clicked via method");

//        Context context = getApplicationContext();
//        //String text ="Hello from Green";
//        CharSequence text="Hello from Green";
//        int duration = Toast.LENGTH_SHORT;
//
//        Toast toast = Toast.makeText(context,text,duration);
//        toast.show();
        Toast.makeText(this,"Hello form Green",Toast.LENGTH_SHORT).show();

    }
}
