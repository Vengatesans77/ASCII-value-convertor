package com.example.asciiconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputChar;
    private Button convertButton;
    private TextView asciiValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        inputChar = findViewById(R.id.inputChar);
        convertButton = findViewById(R.id.convertButton);
        asciiValue = findViewById(R.id.asciiValue);

        // Set up the button click listener
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputChar.getText().toString();

                if (input.length() == 1) { // Ensure input is a single character
                    char character = input.charAt(0);
                    int ascii = (int) character; // Get ASCII value
                    asciiValue.setText("ASCII Value: " + ascii);
                } else {
                    Toast.makeText(MainActivity.this, "Please enter a single character", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
