package com.example.contoh;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import static com.example.contoh.MainActivity.EXTRA_PERSON;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Person person = getIntent().getParcelableExtra(EXTRA_PERSON);
        TextView textResult = findViewById(R.id.tv_result);
        textResult.setText("Nama : "+person.getName()+"\n"+
                "Age : "+person.getAge()+"\n"+
                "Email : "+person.getEmail()+"\n"+
                "City : "+person.getCity());
    }

}
