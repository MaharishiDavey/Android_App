package com.example.roommanegment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AdminActivity extends AppCompatActivity {

    FloatingActionButton Amore, Addcolm;
    int vis = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        Amore = findViewById(R.id.Amore);
        Addcolm = findViewById(R.id.Add_Coloum);
        Amore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vis++;
                if (vis%2==0){
                    Addcolm.setVisibility(View.VISIBLE);
                }
                else {
                    Addcolm.setVisibility(View.GONE);
                }
            }
        });

    }
}