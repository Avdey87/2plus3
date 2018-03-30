package com.aavdeev.a2plus3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TwoActivity extends Activity {

    public static final String ACTIVITY = "activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        TextView textView = findViewById(R.id.text_view);
        Intent intent = getIntent();
        String message = intent.getStringExtra(ACTIVITY);
        textView.setText(message);

    }
}
