package com.example.hp.smartcafe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class Contact extends AppCompatActivity implements View.OnClickListener {

    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

    b=(Button)findViewById(R.id.button1);
        b.setOnClickListener(this);

    }

    @Override
    public void onPress(View v) {
        Intent i=new Intent(Intent.ACTION_CALL);
        i.setData(Uri.parse("Tell: 9610356925"));
        startActivity(i);
    }
}
