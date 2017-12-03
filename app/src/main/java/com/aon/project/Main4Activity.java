package com.aon.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
    private Button Goto,Shit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button Goto = (Button) findViewById(R.id.Goto);
        Button Shit = (Button) findViewById(R.id.Shit);
        Goto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent Pagethree = new Intent(Main4Activity.this, Correct.class);
                    startActivity(Pagethree);
            }
        });
        Shit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent Pagetwo = new Intent(Main4Activity.this, Fail.class);
                    startActivity(Pagetwo);
            }
        });

    }
}
