package com.example.builditbigger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class JokeLibraryActivity extends AppCompatActivity {

    public static String key_API="JOKE_KEY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_library);
        Intent intent=getIntent();
        if(intent!=null&&intent.hasExtra(key_API)){
            TextView txt_joke=findViewById(R.id.txt_joke);
            txt_joke.setText(intent.getStringExtra(key_API));
        }
    }
}
