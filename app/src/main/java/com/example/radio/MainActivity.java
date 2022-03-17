package com.example.radio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup Radio;
    CheckBox Pepsi,Kfc,CocaCola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Radio=findViewById(R.id.Radio);
        Pepsi=findViewById(R.id.pepsick);
        Kfc=findViewById(R.id.kfcck);
        CocaCola=findViewById(R.id.cocacolack);

        Radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.coke:
                        Toast.makeText(MainActivity.this, "Coke Checked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.pepsi:
                        Toast.makeText(MainActivity.this, "Pepsi Checked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.redbull:
                        Toast.makeText(MainActivity.this, "Redbull Checked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.hunter:
                        Toast.makeText(MainActivity.this, "Hunter Checked", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        Pepsi.setOnClickListener(View->{
            Toast.makeText(MainActivity.this, "Pepsi Selected", Toast.LENGTH_SHORT).show();
        });
        Kfc.setOnClickListener(View->{
            Toast.makeText(MainActivity.this,"Pepsi Selected", Toast.LENGTH_SHORT).show();
            Kfc.setText("Pepsi Checked");
        });
        CocaCola.setOnClickListener(View->{
            Toast.makeText(MainActivity.this,"Pepsi Selected", Toast.LENGTH_SHORT).show();
        });

    Pepsi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if(b){
                Pepsi.setText("Pepsi Checked");
            }else Pepsi.setText("Pepsi");
        }
    });
    }
}