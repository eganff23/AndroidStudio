package com.ega.therecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class pokcoy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokcoy);

        final TextView mTextView = findViewById(R.id.resepe4);
        Button mBtnShare = findViewById(R.id.share3);
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