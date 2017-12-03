package com.aon.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Correct extends AppCompatActivity {
    private Button next,quit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct);
        next = (Button) findViewById(R.id.True);
        quit = (Button) findViewById(R.id.Fail);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity aon = new MainActivity();
                int nel = aon.random();
                for(int i =0;;i++){
                    if (nel == 1) {
                        if (!aon.check(nel)) {
                            Intent Pagetwo = new Intent(Correct.this, Main2Activity.class);
                            aon.array(nel);
                            startActivity(Pagetwo);
                            break;
                        }
                    } else if (nel == 2) {
                        if (!aon.check(nel)) {
                            Intent Pagetwo = new Intent(Correct.this, Main3Activity.class);
                            aon.array(nel);
                            startActivity(Pagetwo);
                            break;
                        }
                    } else if (nel == 3) {
                        if (!aon.check(nel)) {
                            Intent Pagetwo = new Intent(Correct.this, Main4Activity.class);
                            aon.array(nel);
                            startActivity(Pagetwo);
                            break;
                        }
                    }
                }
                }
        });
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
