package io.github.abhishek.happybeing.ui.question;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import java.util.Arrays;

import io.github.abhishek.happybeing.R;
import io.github.abhishek.happybeing.databinding.ActivityQuestionBinding;

public class QuestionActivity extends AppCompatActivity {

    private ActivityQuestionBinding binding;
    private QuestionAdapter adapter;

    private String[] data = {
            "What is depression?",
            "How does depression affect my mind?"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this,
                R.layout.activity_question);

        init();
    }

    private void init() {
        adapter = new QuestionAdapter(Arrays.asList(data));
        binding.listRcl.setLayoutManager(new LinearLayoutManager(this));
        binding.listRcl.setAdapter(adapter);
    }
}
