package com.example.marty.lab03_courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mGrade = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitThree(View view) {

        mGrade = mGrade + 3;
        TextView gradeTextView = (TextView)findViewById(R.id.grade);
        gradeTextView.setText(Integer.toString(mGrade));

    }

    public void submitTwo(View view) {

        mGrade = mGrade + 2;
        TextView gradeTextView = (TextView)findViewById(R.id.grade);
        gradeTextView.setText(Integer.toString(mGrade));
    }

    public void submitPenalty(View view) {

        mGrade = mGrade + 1;
        TextView gradeTextView = (TextView)findViewById(R.id.grade);
        gradeTextView.setText(Integer.toString(mGrade));
    }



    public void submitResert(View view) {

        mGrade = 0;
        TextView gradeTextView = (TextView)findViewById(R.id.grade);
        gradeTextView.setText(Integer.toString(mGrade));
    }
}


