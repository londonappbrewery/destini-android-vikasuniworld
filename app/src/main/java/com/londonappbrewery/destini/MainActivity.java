package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyTextView;
    Button buttonTop;
    Button buttonBottom;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        storyTextView = findViewById(R.id.storyTextView);
        buttonBottom = findViewById(R.id.buttonBottom);
        buttonTop = findViewById(R.id.buttonTop);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1 || mStoryIndex == 2){
                    storyTextView.setText((R.string.T3_Story));
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex = mStoryIndex+2;
                }else {
                    storyTextView.setText(R.string.T6_End);
                    buttonBottom.setVisibility(View.GONE);
                    buttonTop.setVisibility(View.GONE);
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1){
                    storyTextView.setText((R.string.T2_Story));
                    buttonTop.setText(R.string.T2_Ans1);
                    buttonBottom.setText(R.string.T2_Ans2);
                    mStoryIndex++;
                }else if (mStoryIndex == 2){
                    buttonBottom.setVisibility(View.GONE);
                    buttonTop.setVisibility(View.GONE);
                    storyTextView.setText(R.string.T4_End);
                    mStoryIndex++;
                }else {
                    buttonBottom.setVisibility(View.GONE);
                    buttonTop.setVisibility(View.GONE);
                    storyTextView.setText(R.string.T5_End);
                }
            }
        });
    }
}
