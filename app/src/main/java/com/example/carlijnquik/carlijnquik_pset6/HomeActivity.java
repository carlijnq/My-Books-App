package com.example.carlijnquik.carlijnquik_pset6;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    ImageButton ibHome;
    ImageButton ibMyBooks;
    ImageButton ibSearch;
    ImageButton ibLogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // views
        ibHome = (ImageButton) findViewById(R.id.ibHome);
        ibMyBooks = (ImageButton) findViewById(R.id.ibMyBooks);
        ibSearch = (ImageButton) findViewById(R.id.ibSearch);
        ibLogOut = (ImageButton) findViewById(R.id.ibLogOut);

        ibHome.setImageResource(R.drawable.this_act);
        ibMyBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                My_Books_Clicked();
            }
        });
        ibSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Search_Clicked();
            }
        });
        ibLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log_Out_Clicked();
            }
        });

    }

    public void My_Books_Clicked(){
        Intent goToBooks = new Intent(this, BooksActivity.class);
        startActivity(goToBooks);
    }
    public void Search_Clicked(){
        Intent goToSearch = new Intent(this, SearchActivity.class);
        startActivity(goToSearch);
    }
    public void Log_Out_Clicked(){
        Intent goToLogOut = new Intent(this, LogOutActivity.class);
        startActivity(goToLogOut);
    }
}