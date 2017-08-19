package io.mochadwi.scoreapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // UI
    private EditText edtTim1;
    private EditText edtTim2;
    private Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ScoreboardActivity.class);
                i.putExtra("tim_1", edtTim1.getText().toString());
                i.putExtra("tim_2", edtTim2.getText().toString());
                startActivity(i);
            }
        });
    }

    private void initView() {
        btnGo = (Button) findViewById(R.id.btn_go);
        edtTim1 = (EditText) findViewById(R.id.edt_tim1);
        edtTim2 = (EditText) findViewById(R.id.edt_tim2);
    }
}
