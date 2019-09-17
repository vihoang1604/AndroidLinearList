package com.example.android_text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] names = new String[]{"Vi", "Thao", "Lan", "Phuong"};
        LinearLayout main =findViewById(R.id.text);
        for(int i=0; i<names.length;i++){
            LinearLayout linearLayout=new LinearLayout(MainActivity.this);
            linearLayout.setOrientation(linearLayout.HORIZONTAL);

            TextView textView  = new TextView(MainActivity.this);
            textView.setText(names[i]);
            textView.setWidth(520);
            linearLayout.addView(textView);

            Button button = new Button(MainActivity.this);
            linearLayout.addView(button);
            button.setText("+");

            main.addView(linearLayout);
        }
    }
}
