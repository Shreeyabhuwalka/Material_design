package com.example.materialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_profile,btn_finance,btn_education,btn_health,btn_comfort,btn_goal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_profile = (Button)findViewById(R.id.buttonProfile);
        btn_education = (Button) findViewById(R.id.buttonEducation);
        btn_finance = (Button) findViewById(R.id.buttonFinance);
        btn_comfort = (Button) findViewById(R.id.buttonComfort);
        btn_goal = (Button) findViewById(R.id.buttonGoal);
        btn_health = (Button) findViewById(R.id.buttonHealth);
        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Profile Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        btn_education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Education Clicked", Toast.LENGTH_SHORT).show();
            }
        }); btn_health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Health Clicked", Toast.LENGTH_SHORT).show();
            }
        }); btn_goal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Goal Clicked", Toast.LENGTH_SHORT).show();
            }
        }); btn_comfort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Comfort Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        btn_finance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Finance Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
