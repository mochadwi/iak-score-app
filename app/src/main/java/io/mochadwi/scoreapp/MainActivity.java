package io.mochadwi.scoreapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // UI
    private EditText edtTim1;
    private EditText edtTim2;
    private Button btnGo;

    // Data
    private String namaTim1;
    private String namaTim2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!TextUtils.isEmpty(edtTim1.getText().toString()) &&
                        !TextUtils.isEmpty(edtTim2.getText().toString())) {

                    namaTim1 = edtTim1.getText().toString();
                    namaTim2 = edtTim2.getText().toString();

                    Intent i = new Intent(getApplicationContext(), ScoreboardActivity.class);
                    i.putExtra("tim_1", namaTim1);
                    i.putExtra("tim_2", namaTim2);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Jangan sampai kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void initView() {
        btnGo = (Button) findViewById(R.id.btn_go);
        edtTim1 = (EditText) findViewById(R.id.edt_tim1);
        edtTim2 = (EditText) findViewById(R.id.edt_tim2);
    }
}
