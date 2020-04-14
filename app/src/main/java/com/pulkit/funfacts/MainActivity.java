package com.pulkit.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView factTextView;
    private Button showFactButton;
    private FactBook factBook = new FactBook();
    private RelativeLayout relativeLayout;
    private ColorWheel colorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        relativeLayout = findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = factBook.getFact();
                factTextView.setText(fact);
                int color = colorWheel.getColor();
                //sets the background colour
                relativeLayout.setBackgroundColor(color);
                //setting button text colour every time a button is clicked
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);



    }
}
