package edu.miracosta.cs134.practice_01_layoutandelements;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

       Log.d("woot", "i am here " + counter);

        // Display a toast
        Toast.makeText(this, R.string.cool_message, Toast.LENGTH_LONG).show();

    }



    public void incrementCounter(View view)
    {
        counter++;
        Log.d("counter" , String.valueOf(counter));
        counterTextView.setText(String.valueOf(counter));


    }
}
