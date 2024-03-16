package com.example.click;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mainText;
    private long score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = findViewById(R.id.mainTxt);
    }

    public void plusScore(View view) {
        score++;
        updateText();
    }

    public void minusScore(View view) {
        if (score > 0) {
            score--;
            updateText();
        }
    }

    public void sbrosScore(View view) {
        score = 0;
        updateText();
    }

    private void updateText() {
        String s = getResources().getString(R.string.click_score, score);
        mainText.setText(s);
    }
}
