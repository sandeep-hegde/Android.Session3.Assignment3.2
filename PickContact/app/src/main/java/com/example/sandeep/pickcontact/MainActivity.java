//Android Developer Training Session 3 - Assignment 3.2
//Problem Statement- Opens up contacts menu of your phone


package com.example.sandeep.pickcontact;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickContact(View v) {

        Intent openContact = new Intent();
        openContact.setAction(Intent.ACTION_VIEW);
        openContact.setData(Uri.parse("content://contacts/people/"));
        startActivity(openContact);


    }
}
