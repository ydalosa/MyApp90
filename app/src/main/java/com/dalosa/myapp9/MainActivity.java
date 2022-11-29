package com.dalosa.myapp9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView toto = findViewById(R.id.testTvAscii);
        EditText tes = findViewById(R.id.et);
        Button Accepter = findViewById(R.id.Accepter);
        toto.setText("");

        Accepter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ascii = Integer.parseInt(tes.getText().toString())    ;
                char ch = (char) ascii;
                String s = String.valueOf(ch);
                toto.setText(s);






            }
        });

    }
}