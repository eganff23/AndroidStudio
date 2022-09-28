package com.ega.therecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class beranda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
    }

    public void steak(View view) {
        Intent intent = new Intent(getApplicationContext(), steak.class);
        startActivity(intent);
    }

    public void bakso(View view) {
        Intent intent = new Intent(getApplicationContext(), bakso.class);
        startActivity(intent);
    }

    public void nasgor(View view) {
        Intent intent = new Intent(getApplicationContext(), nasgor.class);
        startActivity(intent);
    }

    public void telurkukus(View view) {
        Intent intent = new Intent(getApplicationContext(), telur_kukus.class);
        startActivity(intent);
    }

    public void pokcoy(View view) {
        Intent intent = new Intent(getApplicationContext(), pokcoy.class);
        startActivity(intent);
    }

    public void nugget(View view) {
        Intent intent = new Intent(getApplicationContext(), nugget.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_out){
            Intent intent = new Intent(beranda.this, MainActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_fav){
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.putExtra(Intent.EXTRA_TEXT, "Favorites Recipe");
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_info){
            Intent intent = new Intent(beranda.this, tentang.class);
            startActivity(intent);
            return true;
        }
        return  super.onOptionsItemSelected(item);
    }
}