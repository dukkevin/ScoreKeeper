package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Tracks the score for Team A
    int scoreTeamA = 0;

    int foults = 0;

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the foults for Team A by 1 point.
     */
    public void addFoultForTeamA(View v) {
        foults = foults + 1;
        displayFoultForTeamA((foults) + " FOULTS");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     * @param foult
     */
    public void displayFoultForTeamA(String foult) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foults);
        scoreView.setText(String.valueOf(foult));
    }
}
