package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int cowboysScore = 0;
    int ravensScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Cowboys by 1 point.
     */
    public void extraPointForCowboys(View v) {
        cowboysScore = cowboysScore+1;
        String currentScore = "Score: " + cowboysScore;
        displayForCowboys(currentScore);
    }

    /**
     * Increase the score for Cowboys by 2 points.
     */
    public void safetyForCowboys(View v) {
        cowboysScore = cowboysScore +2;
        String currentScore = "Score: " + cowboysScore;
        displayForCowboys(currentScore);
    }

    /**
     * Increase the score for Cowboys by 6 points.
     */
    public void touchDownForCowboys(View v) {
        cowboysScore = cowboysScore + 6;
        String currentScore = "Score: " + cowboysScore;
        displayForCowboys(currentScore);
    }
    /**
     * Increase the score for Cowboys by 3 points.
     */
    public void fieldGoalForCowboys(View v) {
        cowboysScore = cowboysScore + 3;
        String currentScore = "Score: " + cowboysScore;
        displayForCowboys(currentScore);
    }
    /**
     * Increase the score for Cowboys by 2 points.
     */
    public void conversionForCowboys(View v) {
        cowboysScore = cowboysScore + 2;
        String currentScore = "Score: " + cowboysScore;
        displayForCowboys(currentScore);
    }

    /**
     * Displays the given score for Dallas.
     */
    public void displayForCowboys(String score) {
        TextView scoreView =  findViewById(R.id.dc_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the score for Ravens by 1 point.
     */
    public void extraPointForRavens(View v) {
        ravensScore = ravensScore+1;
        String currentScore = "Score: " + ravensScore;
        displayForRavens(currentScore);
    }

    /**
     * Increase the score for Ravens by 2 points.
     */
    public void safetyForRavens(View v) {
        ravensScore = ravensScore +2;
        String currentScore = "Score: " + ravensScore;
        displayForRavens(currentScore);
    }

    /**
     * Increase the score for Ravens by 6 points.
     */
    public void touchDownForRavens(View v) {
        ravensScore = ravensScore + 6;
        String currentScore = "Score: " + ravensScore;
        displayForRavens(currentScore);
    }
    /**
     * Increase the score for Ravens by 3 points.
     */
    public void fieldGoalForRavens(View v) {
        ravensScore = ravensScore + 3;
        String currentScore = "Score: " + ravensScore;
        displayForRavens(currentScore);
    }
    /**
     * Increase the score for Ravens by 2 points.
     */
    public void conversionForRavens(View v) {
        ravensScore = ravensScore + 2;
        String currentScore = "Score: " + ravensScore;
        displayForRavens(currentScore);
    }
    public void resetScore(View v) {
        ravensScore = 0;
        cowboysScore = 0;
        String resetRavens = "Score: " +ravensScore;
        String resetCowboys = "Score: " +cowboysScore;
        displayForRavens(resetRavens);
        displayForCowboys(resetCowboys);
    }
    /**
     * Displays the given score for Baltimore.
     */
    public void displayForRavens(String score) {
        TextView scoreView =  findViewById(R.id.br_score);
        scoreView.setText(String.valueOf(score));
    }

}
