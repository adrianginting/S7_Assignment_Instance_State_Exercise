package com.example.s7assignmentinstancestateexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textViewNilai;
    EditText editTextNilai;
    Button buttonNilai;

    private static final String STATE_NILAI_1 = "";
    private int mNilai1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewNilai = findViewById(R.id.tv_nilai);
        editTextNilai = findViewById(R.id.et_Nilai);
        buttonNilai = findViewById(R.id.btn_nilai);

        buttonNilai.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        mNilai1++;
        textViewNilai.setText(String.valueOf(mNilai1));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(STATE_NILAI_1, mNilai1);
        super.onSaveInstanceState(outState);
    }

}