package io.github.abhishek.happybeing.ui.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.Arrays;

import io.github.abhishek.happybeing.R;
import io.github.abhishek.happybeing.databinding.ActivityQuestionBinding;
import io.github.abhishek.happybeing.databinding.ActivityTestIssuesBinding;
import io.github.abhishek.happybeing.utils.ItemClickSupport;

public class TestIssuesActivity extends AppCompatActivity {

    private ActivityTestIssuesBinding binding;
    private TestIssuesAdapter adapter;

    private String[] list = {
            "Anxiety",
            "Depression",
            "Panic Attacks",
            "Bipolar Disorder",
            "Hoarding",
            "Hypomania",
            "Loneliness",
            "Psychosis"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_test_issues);

        init();
    }

    private void init() {
        adapter = new TestIssuesAdapter(Arrays.asList(list));

        binding.list.setLayoutManager(new GridLayoutManager(this, 2));
        binding.list.setAdapter(adapter);

        ItemClickSupport.addTo(binding.list).setOnItemClickListener((recyclerView, position, v) -> {

        });
    }
}
