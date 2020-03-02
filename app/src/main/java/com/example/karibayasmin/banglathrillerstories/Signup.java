package com.example.karibayasmin.banglathrillerstories;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class Signup extends AppCompatActivity implements View.OnClickListener{

    Button back;
    private   Button submit;
    private   EditText etPassword;
    private   EditText  etUsername;
    private   EditText etName;
    private   EditText etEmail;
    private   EditText etCountryName;
    private   EditText etGender;

    private static final String REGISTER_URL="http://6d4b6f15.ngrok.io/client/index.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        back = (Button)findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent backbutton = new Intent(getApplicationContext(),Home.class);
                startActivity(backbutton);

            }
        });
        etPassword=(EditText)findViewById(R.id.etPassword);
        etUsername=(EditText)findViewById(R.id.etUsername);
        etName=(EditText)findViewById(R.id.etName);
        etGender= (EditText)findViewById(R.id.etGender);
        etCountryName=(EditText)findViewById(R.id.etCountryName);
        etEmail=(EditText)findViewById(R.id.etEmail);
        submit=(Button)findViewById(R.id.submit);


        submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v==submit){
            registerUser();
        }
    }

    private void registerUser(){
        String name=etName.getText().toString().trim();
        String countryname=etCountryName.getText().toString().trim();
        String email=etEmail.getText().toString().trim();
        String gender=etGender.getText().toString().trim();
        String username=etUsername.getText().toString().trim();
        String password=etPassword.getText().toString().trim();

        register(name, countryname, email, gender, username, password);

    }

    private void register(String name,String countryname,String email,String gender,String  username,String password){
        class RegisterUser extends AsyncTask<String,Void,String>{
            ProgressDialog loading;
            RegisterUserClass ruc=new RegisterUserClass();

            @Override
            protected void onPreExecute(){
                super.onPreExecute();
                loading=ProgressDialog.show(Signup.this,"Please wait",null,true,true);
            }

            @Override
            protected void onPostExecute(String s){
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(getApplicationContext(),"If you want to log in now then press the back button\n",Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(String...params){
                HashMap<String,String> data=new HashMap<String,String>();
                data.put("name",params[0]);
                data.put("countryname",params[1]);
                data.put("email",params[2]);
                data.put("gender",params[3]);
                data.put("username",params[4]);
                data.put("password",params[5]);

                String result= ruc.sendPostRequest(REGISTER_URL,data);

                return result;
            }
        }

        RegisterUser ru=new RegisterUser();
        ru.execute(name, countryname, email, gender, username, password);
    }
}