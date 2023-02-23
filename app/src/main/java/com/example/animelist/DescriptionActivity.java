package com.example.animelist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        TextView title = findViewById(R.id.title);
        TextView description = findViewById(R.id.description);

        Intent intent = getIntent();
        if (intent != null) {
            title.setText(intent.getStringExtra("title"));
            description.setText(intent.getStringExtra("fullDescription"));
        }
    }
}