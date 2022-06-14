package com.example.basicdebbugandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int math = 5;
        int chem =5;
        int physics=5;
        int average=0;

        average=(math+chem+physics)/3;
        if(average>=6){
            Toast.makeText(this,"Aprobado",Toast.LENGTH_LONG).show();

        }else if (average<=5){
            Toast.makeText(this,"Aprobado",Toast.LENGTH_LONG).show();
        }

    }
}