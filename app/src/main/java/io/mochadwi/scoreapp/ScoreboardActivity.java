package io.mochadwi.scoreapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreboardActivity extends AppCompatActivity {

    // UI
    private TextView tvNameTim1;
    private TextView tvNameTim2;
    private TextView tvScoreTim1;
    private TextView tvScoreTim2;
    private Button btnTwoScoreTim1;
    private Button btnTwoScoreTim2;
    private Button btnThreeScoreTim1;
    private Button btnThreeScoreTim2;

    // Data
    private int scoreTim1 = 0;
    private int scoreTim2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoreboard);

        initView();
    }

    private void initView() {
        // Get data from intent
        String namaTim1 = getIntent().getStringExtra("tim_1");
        String namaTim2 = getIntent().getStringExtra("tim_2");

        tvNameTim1 = (TextView) findViewById(R.id.tim_satu);
        tvNameTim2 = (TextView) findViewById(R.id.tim_dua);
        tvNameTim1.setText(namaTim1);
        tvNameTim2.setText(namaTim2);

        tvScoreTim1 = (TextView) findViewById(R.id.score_tim_satu);
        tvScoreTim2 = (TextView) findViewById(R.id.score_tim_dua);

        btnTwoScoreTim1 = (Button) findViewById(R.id.btn_dua_point_tim_satu);
        btnTwoScoreTim2 = (Button) findViewById(R.id.btn_dua_point_tim_dua);

        btnThreeScoreTim1 = (Button) findViewById(R.id.btn_tiga_point_tim_satu);
        btnThreeScoreTim1 = (Button) findViewById(R.id.btn_tiga_point_tim_dua);
    }

    public void twoScoreTim1(View view) {
        scoreTim1 += 2;
        tvScoreTim1.setText(String.valueOf(scoreTim1));
    }

    public void threeScoreTim1(View view) {
        scoreTim1 += 3;
        tvScoreTim1.setText(String.valueOf(scoreTim1));
    }

    public void twoScoreTim2(View view) {
        scoreTim2 += 2;
        tvScoreTim2.setText(String.valueOf(scoreTim2));
    }

    public void threeScoreTim2(View view) {
        scoreTim2 += 3;
        tvScoreTim2.setText(String.valueOf(scoreTim2));
    }

    public void reset(View view) {
        scoreTim1 = 0;
        scoreTim2 = 0;

        tvScoreTim1.setText(String.valueOf(scoreTim2));
        tvScoreTim2.setText(String.valueOf(scoreTim2));
    }
}
