package io.github.abhishek.happybeing.ui.test;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import io.github.abhishek.happybeing.R;

public class TestIssuesAdapter extends RecyclerView.Adapter<TestIssuesAdapter.CViewHolder> {
    private List<String> listItems;

    TestIssuesAdapter(List<String> listItems){
        this.listItems = listItems;
    }

    @NonNull
    @Override
    public TestIssuesAdapter.CViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.test_issues_item, viewGroup, false);
        return new CViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CViewHolder viewHolder, int position) {
        viewHolder.text.setText(listItems.get(position));
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    class CViewHolder extends RecyclerView.ViewHolder {
        final TextView text;

        CViewHolder(View view) {
            super(view);
            text = view.findViewById(R.id.textView);
        }
    }
}
