package io.github.abhishek.happybeing.ui.main;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.hsalf.smilerating.SmileRating;

import io.github.abhishek.happybeing.R;
import io.github.abhishek.happybeing.ui.question.QuestionActivity;
import io.github.abhishek.happybeing.ui.test.TestIssuesActivity;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    SmileRating smileRating;

    String[] listItems;
    boolean[] checkedItems;

    private TextView titleTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smileRating = findViewById(R.id.mood_rating_view);
        titleTv = findViewById(R.id.textView);

        listItems = getResources().getStringArray(R.array.emotions);
        checkedItems = new boolean[listItems.length];

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                smileRating.setVisibility(View.INVISIBLE);
                titleTv.setVisibility(View.INVISIBLE);

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                mBuilder.setTitle(R.string.dialog_title);
                mBuilder.setMultiChoiceItems(listItems, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int position, boolean isChecked) {

                        if(isChecked){
//                            mUserItems.add(position);
                        }else{
//                            mUserItems.remove((Integer.valueOf(position)));
                        }
                    }
                });

                mBuilder.setCancelable(false);
                mBuilder.setPositiveButton(R.string.ok_label, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        String item = "";
//                        for (int i = 0; i < mUserItems.size(); i++) {
//                            item = item + listItems[mUserItems.get(i)];
//                            if (i != mUserItems.size() - 1) {
//                                item = item + ", ";
//                            }
//                        }
//                        mItemSelected.setText(item);

                        findViewById(R.id.editTextInput).setVisibility(View.VISIBLE);
                        ((EditText)findViewById(R.id.editTextInput)).setHint("Write how do you feeling?");

                        findViewById(R.id.button).setEnabled(true);
                        ((Button)findViewById(R.id.button)).setText("Finishs");

                    }
                });


                AlertDialog mDialog = mBuilder.create();
                mDialog.show();

            }
        });
    }

    private void moodFeedback() {
        smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
            @Override
            public void onSmileySelected(int smiley, boolean reselected) {

            }
        });
    }




}
