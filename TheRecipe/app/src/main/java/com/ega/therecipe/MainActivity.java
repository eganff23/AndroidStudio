package com.ega.therecipe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.pass);
        btnlogin = (Button) findViewById(R.id.started);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey =
                        username.getText().toString();
                String passwordKey =
                        password.getText().toString();
                if (usernameKey.equals("admin") &&
                        passwordKey.equals("123")) {
                    Toast.makeText(getApplicationContext(),
                            "Login Sukses", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), beranda.class);
                    startActivity(intent);
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username atau Password yang anda masukkan salah !")
                            .setNegativeButton("Retry", null).create().show();
                }
            }
        });

    }

}