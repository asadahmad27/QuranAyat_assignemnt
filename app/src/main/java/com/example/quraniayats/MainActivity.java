package com.example.quraniayats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView paraNUm;
    TextView ayatNum;
    Button btnSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paraNUm = findViewById(R.id.ParahNum);
        ayatNum = findViewById(R.id.AyatNum);
        btnSearch = findViewById(R.id.btnSearch);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(paraNUm.getText() == "" && ayatNum.getText() == "")
                {

                }
                else
                {

                }
            }
        });
    }
}