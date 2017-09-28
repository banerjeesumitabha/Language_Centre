package com.example.android.miwok;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by SUMITABHA on 28-09-2017.
 */

public class SearchActivity extends AppCompatActivity {

    EditText searchText ;
    RadioButton spanish ;
    RadioButton french ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        searchText =(EditText)findViewById(R.id.search_text);
        spanish = (RadioButton)findViewById(R.id.rb_spanish);
        french = (RadioButton)findViewById(R.id.rb_french);

        spanish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (french.isChecked()) {
                    french.setChecked(false);
                    spanish.setChecked(true);
                }
                else
                {
                    spanish.setChecked(true);
                }
            }
        });

        french.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(spanish.isChecked())
                {
                    spanish.setChecked(false);
                    french.setChecked(true);
                }
                else
                {
                    french.setChecked(true);
                }
            }
        });
    }

    public void translate(View view)
    {
        Intent i = new Intent(Intent.ACTION_WEB_SEARCH);
        String query = searchText.getText().toString();
        if(!query.equals("")) {
            if (spanish.isChecked()) {
                i.putExtra(SearchManager.QUERY, query + " in Spanish");
                startActivity(i);
            } else if (french.isChecked()) {
                i.putExtra(SearchManager.QUERY, query + " in French");
                startActivity(i);
            } else {
                Toast.makeText(this, "Please Choose Language", Toast.LENGTH_LONG).show();
            }
        }
        else
        {
            Toast.makeText(this,"Please enter text",Toast.LENGTH_LONG).show();
        }
    }

}
