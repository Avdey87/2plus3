package com.aavdeev.a2plus3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TwoPlusThreeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2plus3);
    }

    public void onClickActivity(View view) {
        EditText editText = findViewById(R.id.edit_text);
        String editMessage = editText.getText().toString();
        Intent intent = new Intent(this, TwoActivity.class);
        intent.putExtra(TwoActivity.ACTIVITY, editMessage);
        startActivity(intent);

    }

    public void onClickIntent(View view) {
        EditText editText = findViewById(R.id.edit_text);
        String editMessage = editText.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        Intent cngIntent = Intent.createChooser(intent, "Метод отправки");
        intent.putExtra(Intent.EXTRA_TEXT, editMessage);
        intent.setType("text/plain");
        startActivity(cngIntent);
    }
}
