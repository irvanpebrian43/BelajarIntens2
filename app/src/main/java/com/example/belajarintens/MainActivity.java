package com.example.belajarintens;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button exclicitintent;
    Button implicitintent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exclicitintent = (Button) findViewById(R.id.explicitintent);
        implicitintent = (Button) findViewById(R.id.implicitintent);

        exclicitintent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , IntentActivity.class);
                startActivity(intent);
            }
        });

        implicitintent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.w3school.com"));
                startActivity(intent);

            }
        });

    }


}


