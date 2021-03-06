package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    public static final String EXTRA_DATA = "EXTRA DATA";
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        txtResult = (TextView) findViewById(R.id.textView);

        if(getIntent().getExtras() !=null){
            String data = getIntent().getExtras().getString(TargetActivity.EXTRA_DATA);
            txtResult.setText(data);
        }
    }
}