package io.github.abhishek.happybeing.ui.main;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import io.github.abhishek.happybeing.R;
import io.github.abhishek.happybeing.ui.question.QuestionActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(this, QuestionActivity.class));
    }
}
