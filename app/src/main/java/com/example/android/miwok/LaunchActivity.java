package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by SUMITABHA on 26-09-2017.
 */

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
    }

    public void spanish(View view)
    {
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("language","spanish");
        startActivity(i);
    }

    public void french(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        i.putExtra("language","french");
        startActivity(i);
    }

    public void search(View view)
    {
        Intent i = new Intent(this,SearchActivity.class);
        startActivity(i);
    }
}
