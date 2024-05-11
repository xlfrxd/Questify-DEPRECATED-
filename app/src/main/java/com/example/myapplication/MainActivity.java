package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private TextView displayText;
    private Button displayBtn;
    private EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.inputText = findViewById(R.id.inputEditText);
        this.displayBtn = findViewById(R.id.displayButton);
        this.displayText = findViewById(R.id.displayTextView);

        this.inputText.setText("Insert Name Here");

        this.displayText.setText("No Name Inputted");

        this.displayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayText.setText("Hi, " + inputText.getText());
            }
        });
    }
}