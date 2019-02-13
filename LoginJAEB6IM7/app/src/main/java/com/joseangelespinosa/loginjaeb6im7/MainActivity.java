package com.joseangelespinosa.loginjaeb6im7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnEntrar;
    EditText edtTxtUser, edtTxtPass;
    final String USUARIO = "Jaeblack";
    final String CONTRASENIA = "j43bl4ck";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEntrar = findViewById(R.id.btnEntrar);

        edtTxtUser = findViewById(R.id.edtTxtUser);
        edtTxtPass = findViewById(R.id.edtTxtPass);


        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtTxtUser.getText().toString().equals(USUARIO) && edtTxtPass.getText().toString().equals(CONTRASENIA)){

                    try{

                        Toast.makeText( MainActivity.this , "Ingresando", Toast.LENGTH_LONG).show();
                        Intent inicio = new Intent(MainActivity.this, Entra.class);
                        inicio.putExtra("Usuario", USUARIO);
                        startActivity(inicio);
                    }
                    catch (Throwable throwable) {
                        throwable.printStackTrace();
                    }

                }
                else{
                    Toast.makeText(MainActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
