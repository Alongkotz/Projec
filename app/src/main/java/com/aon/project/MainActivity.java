package com.aon.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import  java.util.Random;
public class MainActivity extends AppCompatActivity {
    private Button ButtonStart,ButtonEnd ;
    static public int array[] = new int[1000];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButtonStart = (Button) findViewById(R.id.start);
        ButtonEnd = (Button)findViewById(R.id.end);
        ButtonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity aon = new MainActivity();
                int nel = aon.random();
                for(int i =0;i<3;i++){
                    array[i] = 0;
                }
                if(nel == 1) {
                    Intent PageOne = new Intent(MainActivity.this, Main2Activity.class);
                    aon.array(nel);
                    startActivity(PageOne);
                }
                else if(nel == 2){
                    Intent PageOne = new Intent(MainActivity.this, Main3Activity.class);
                    aon.array(nel);
                    startActivity(PageOne);

                }
                else if(nel==3){
                    Intent PageOne = new Intent(MainActivity.this, Main4Activity.class);
                    aon.array(nel);;
                    startActivity(PageOne);

                }
            }
        });
        ButtonEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public int random(){
        Random randomdakamon = new Random();
        int n = randomdakamon.nextInt(3)+1;
        return n;
    }
    public void array(int n){
        if(array[n] == 0) {
            array[n] = 1;
        }
    }
    public boolean check(int n){
        if(array[n] == 1){
            return true;
        }
        else{
            return false;
        }
    }

}
