package io.mochadwi.scoreapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    // UI
    private TextView tvWinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initView();

        String winner = getIntent().getStringExtra("winner");
        tvWinner.setText(winner);
    }

    private void initView() {
        tvWinner = (TextView) findViewById(R.id.tv_winner);
    }
}
