package com.example.acer.loginfake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private TextView text1;
    private EditText user, pass;
    private String user2, pass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.clickBotton);
        text1 = findViewById(R.id.newText);
        user = (EditText) findViewById(R.id.usernametext);
        pass = (EditText) findViewById(R.id.password);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text1.setText(user.getText().toString());
            }
        });

        btn1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                text1.setText(pass.getText().toString());
                return false;
            }
        });


    }
}
