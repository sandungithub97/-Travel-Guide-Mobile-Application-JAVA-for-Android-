package com.example.tourist_guide;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class login extends AppCompatActivity {
    private EditText user_name, passw;
    DBHelper DB;
    private Button button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user_name = findViewById(R.id.username);
        passw = findViewById(R.id.password);
        DB = new DBHelper(this);
    }
    public void go(View view) {
        String username = user_name.getText().toString();
        String password = passw.getText().toString();

        if (username.equals("")||password.equals("")){
            Toast.makeText(login.this,"Please Enter UserName and Password", Toast.LENGTH_SHORT).show();
        }
        else{
            boolean checkUserAndPass = DB.checkusernamepassword(username, password);
            if(checkUserAndPass==true){
                Toast.makeText(login.this,"Sign in Successfully...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(login.this,"Please Check Username and Password again...", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void register(View view) {
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
        finish();
    }
}
