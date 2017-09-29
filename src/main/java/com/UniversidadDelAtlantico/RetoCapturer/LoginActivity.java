package com.UniversidadDelAtlantico.RetoCapturer;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button blogin = (Button)findViewById(R.id.login);

        blogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText demail = (EditText)findViewById(R.id.email);
                String pass = ((EditText)findViewById(R.id.password)).getText().toString();
                if(!validateEmail(demail.getText().toString())) {
                    demail.setError("Correo institucional invalido");
                    demail.requestFocus();
                }else if(pass.equals("")){
                    Toast.makeText(getApplicationContext(), "Ingrese su Contraseña", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(LoginActivity.this, InfoActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
    //Return true if email is valid and false if email is invalid
    protected boolean validateEmail(String email) {
        String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.)*uniatlantico.edu.co";

        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}