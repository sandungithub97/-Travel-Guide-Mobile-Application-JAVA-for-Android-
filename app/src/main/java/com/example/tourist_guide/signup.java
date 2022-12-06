package com.example.tourist_guide;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class signup extends AppCompatActivity {
    private EditText agee, user_name, pass, country_name, full_;
    private Button btnRegister;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        user_name = (EditText) findViewById(R.id.username);
        full_ = (EditText) findViewById(R.id.full);
        pass = (EditText) findViewById(R.id.password);
        country_name = (EditText) findViewById(R.id.country);
        agee = (EditText) findViewById(R.id.age);
        DB = new DBHelper(this);
        btnRegister = (Button) findViewById(R.id.buttonSignUp);
    }

    public void save(View view) {
        String username = user_name.getText().toString();
        String country = country_name.getText().toString();
        String password = pass.getText().toString();
        String full_name = full_.getText().toString();
        String age = agee.getText().toString();

            if (username.equals("")||password.equals("")||full_name.equals("")||country.equals("")||age.equals("")){
                Toast.makeText(signup.this,"Please Enter all the fields", Toast.LENGTH_SHORT).show();
            }
            else{
                boolean checkUser = DB.checkusername(username);
                if(checkUser==false) {
                    Boolean insert = DB.insertData(username, password, full_name, country, age);
                    if (insert==true){
                        Toast.makeText(signup.this,"Registered Successfully...", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), login.class);
                        startActivity(intent);

                        }else{
                            Toast.makeText(signup.this,"Registration Failed...", Toast.LENGTH_SHORT).show();
                        }
                   }
                else{
                        Toast.makeText(signup.this,"UserName already Exist....", Toast.LENGTH_SHORT).show();
                    }
                }
    }

    public void login(View view) {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
        finish();
    }
}
