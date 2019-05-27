package com.example.contoh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnMove;
    public static final String EXTRA_PERSON = "EXTRA_PERSON";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMove = findViewById(R.id.btn_move);
        btnMove.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Person person = new Person();
        person.setName("elissa");
        person.setAge("23");
        person.setEmail("elissapuspita@gmail.com");
        person.setCity("Batu Raja");

        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        intent.putExtra(EXTRA_PERSON, person);
        startActivity(intent);
    }
}
