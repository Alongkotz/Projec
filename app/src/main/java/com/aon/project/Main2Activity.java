package com.aon.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button True,Fail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button True = (Button)findViewById(R.id.True);
        Button Fail = (Button)findViewById(R.id.Fail);

        True.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Pagetwo = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(Pagetwo);
            }
        });
        Fail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Pagethree = new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(Pagethree);
            }
        });
    }
}
