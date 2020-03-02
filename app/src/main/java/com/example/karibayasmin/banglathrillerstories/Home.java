package com.example.karibayasmin.banglathrillerstories;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import java.util.HashMap;

public class Home extends AppCompatActivity implements AsyncResponse, View.OnClickListener {

    Button signin, signup;
    EditText etusername, etpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        signin = (Button) findViewById(R.id.signin);
        signup = (Button) findViewById(R.id.signup);

        signup = (Button) findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Signup.class);
                startActivity(i);
            }

        });


        etusername = (EditText) findViewById(R.id.etusername);
        etpassword = (EditText) findViewById(R.id.etpassword);
        signin = (Button) findViewById(R.id.signin);


        signin.setOnClickListener(this);


    }


    @Override
    public void processFinish(String result) {
        if (result.equals("success")) {
            Intent in = new Intent(getApplicationContext(), Stories.class);
            startActivity(in);
        } else {
            Toast.makeText(this, "May be u have given wrong username or password, Please try again later", Toast.LENGTH_LONG).show();
        }


    }


    @Override
    public void onClick(View v) {

        HashMap postData = new HashMap();
        postData.put("mobile", "android");
        postData.put("txtUsername", etusername.getText().toString());
        postData.put("txtPassword", etpassword.getText().toString());

        PostResponseAsyncTask task = new PostResponseAsyncTask(this, postData);
        task.execute("http://311601e7.ngrok.io/client/login.php");

    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Home.this);
        builder.setMessage("Do you want to exit?");
        builder.setCancelable(true);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                finish();

            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();

            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}