package com.example.belajarintens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class button6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button6);
        Button Lanjutkan = (Button)findViewById(R.id.lanjutkanEnam);
        Lanjutkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(button6Activity.this , MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
