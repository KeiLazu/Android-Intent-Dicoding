package com.github.myintentappdicoding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {

    public static final String EXTRA_AGE = "extra_age";
    public static final String EXTRA_NAME = "extra_name";
    private TextView lblDataReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        InitView();
        GetSavedInstanceState();
    }

    private void InitView() {
        lblDataReceived = findViewById(R.id.lbl_data_received);
    }

    private void GetSavedInstanceState() {
        String name = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE, 0);

        String text = String.format(getString(R.string.name_age_settings), name, age);
        DataDisplayer(text);
    }

    private void DataDisplayer(String text) {
        lblDataReceived.setText(text);
    }

}
