package edu.miracosta.cs134.practice_01_layoutandelements;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{
    // Fields
    private Button incrementCounterButton;
    //private EditText counterView;
    private TextView counterTextView;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Reference view elements
        incrementCounterButton = findViewById(R.id.incrementButton);
        //counterView = findViewById(R.id.counterView);
        counterTextView = findViewById(R.id.counterTextView);

        counter = 0;
        counterTextView.setText(String.valueOf(counter));
       // counterView.setTex
    }



    public void incrementCounter(View view)
    {
        counter++;
        counterTextView.setText(String.valueOf(counter));
    }
}
