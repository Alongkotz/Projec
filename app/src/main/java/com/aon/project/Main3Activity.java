package com.aon.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    private Button go1,end1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button go1 = (Button) findViewById(R.id.Goto);
        Button end1 = (Button)findViewById(R.id.Shit);
        go1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent Pagethree = new Intent(Main3Activity.this, Correct.class);
                    startActivity(Pagethree);
            }
        });
        end1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent Pagetwo = new Intent(Main3Activity.this, Fail.class);
                    startActivity(Pagetwo);
            }
        });

    }
}
