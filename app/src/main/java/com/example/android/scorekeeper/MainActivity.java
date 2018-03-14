package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Tracks the score for Team A
    int scoreTeamA = 0;

    //Tracks the fouls for Team A
    int foulsA = 0;

    //Tracks the score for Team B
    int scoreTeamB = 0;

    //Tracks the fouls for Team B
    int foulsB = 0;

    /**
     * Increase the score for Team A by 1 goal.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the fouls for Team A by 1.
     */
    public void addFoulForTeamA(View v) {
        foulsA = foulsA + 1;
        displayFoulForTeamA((foulsA) + " FOULS");
    }

    /**
     * Increase the score for Team B by 1 goal.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the fouls for Team B by 1.
     */
    public void addFoulForTeamB(View v) {
        foulsB = foulsB + 1;
        displayFoulForTeamB((foulsB) + " FOULS");
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team A.
     * @param foul
     */
    public void displayFoulForTeamA(String foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team B.
     * @param foul
     */
    public void displayFoulForTeamB(String foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(foul));
    }

    /**
     * Reset score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset fouls for both teams back to 0.
     */
    public void resetFouls(View v) {
        foulsA = 0;
        displayFoulForTeamA((foulsA) + " FOULS");
        foulsB = 0;
        displayFoulForTeamB((foulsB) + " FOULS");
    }

    public void resetAll (View v) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);

        foulsA = 0;
        displayFoulForTeamA((foulsA) + " FOULS");
        foulsB = 0;
        displayFoulForTeamB((foulsB) + " FOULS");
    }
}
