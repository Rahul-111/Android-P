package com.example.rahul.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void BluePressed(View view){
//        Toast.makeText(this,"oK",Toast.LENGTH_SHORT).show();
        showCustom();
    }
    public void showCustom()
    {
        LayoutInflater inflater= getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout,(ViewGroup)findViewById(R.id.toast_root));


        Toast toast = new Toast(getApplicationContext());
        toast.setView(layout);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }
}
