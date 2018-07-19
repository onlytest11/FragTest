package com.example.doctorsfab.androidfragtest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = findViewById(R.id.textView4);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc");
        stringBuilder.append("ddd");
        textView1.setText(stringBuilder.toString());

    }

}
