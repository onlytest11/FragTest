package com.example.doctorsfab.androidfragtest1;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MainFragment fragment1;
    MenuFragment fragment2;

    Button button;
    Button button2;
    Button button3;
    TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.TextVew_TestFragment);
        FragmentSetting();
        ButtonSetting();


    }



    public void FragmentSetting() {

        fragment1 = new MainFragment();
        fragment2 = new MenuFragment();


    }

    public void ButtonSetting() {

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment2).commit();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, TestFragment.newInstance("aaa","aaa")).commit();
            }
        });


    }
}