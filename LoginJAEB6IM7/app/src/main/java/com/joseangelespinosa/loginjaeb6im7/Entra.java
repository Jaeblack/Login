package com.joseangelespinosa.loginjaeb6im7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Entra extends AppCompatActivity {

    TextView txtVwHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        txtVwHome = findViewById(R.id.txtVwHome);
        String usuario = getIntent().getStringExtra("Usuario");
        txtVwHome.setText(txtVwHome.getText().toString()+ usuario);
    }
}