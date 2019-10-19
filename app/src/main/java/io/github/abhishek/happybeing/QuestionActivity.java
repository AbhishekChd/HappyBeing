package io.github.abhishek.happybeing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

import io.github.abhishek.happybeing.databinding.ActivityQuestionBinding;

public class QuestionActivity extends AppCompatActivity {

    private ActivityQuestionBinding binding;
    private QuestionAdapter adapter;

    private String[] data = {
            "Hey there!",
            "Hey nigga!"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this,
                R.layout.activity_question);

        adapter = new QuestionAdapter(Arrays.asList(data));
        init();
    }

    private void init() {
        binding.listRcl.setLayoutManager(new LinearLayoutManager(this));
        binding.listRcl.setAdapter(adapter);
    }
}
