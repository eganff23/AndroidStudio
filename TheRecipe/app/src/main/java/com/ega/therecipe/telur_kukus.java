package com.ega.therecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class telur_kukus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telur_kukus);

        final TextView mTextView = findViewById(R.id.resepe3);
        Button mBtnShare = findViewById(R.id.share5);
        mBtnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = mTextView.getText().toString();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "Saya sudah mencoba recook resep ini dan sekarang giliran anda untuk mencoba" + s);
                startActivity(intent);
            }
        });
    }
}