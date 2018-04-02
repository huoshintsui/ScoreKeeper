package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {
    int scoreHome = 0;
    int scoreAway = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Click "Touch Down!" to add 6 points for Home Team
     */
    public void touchDownHomeTeam6Points(View view) {
        scoreHome = scoreHome + 6;
        displayForHomeTeam(scoreHome);
    }

    /**
     * Click "Field Goal" to add 3 points for Home Team
     */
    public void fieldGoalHomeTeam3Points(View view) {
        scoreHome = scoreHome + 3;
        displayForHomeTeam(scoreHome);
    }

    /**
     * Click "Two Points" to add 2 points for Home Team
     */
    public void twoPointsHomeTeam(View view) {
        scoreHome = scoreHome + 2;
        displayForHomeTeam(scoreHome);
    }

    /**
     * Click "One Point" to add 1 point for Home Team
     */

    public void onePointHomeTeam(View view) {
        scoreHome = scoreHome + 1;
        displayForHomeTeam(scoreHome);
    }

    /**
     * Click "Touch Down!" to add 6 points for Away Team
     */
    public void touchDownAwayTeam6Points(View view) {
        scoreAway = scoreAway + 6;
        displayForAwayTeam(scoreAway);
    }

    /**
     * Click "Field Goal" to add 3 points for Away Team
     */
    public void fieldGoalAwayTeam3Points(View view) {
        scoreAway = scoreAway + 3;
        displayForAwayTeam(scoreAway);
    }

    /**
     * Click "Two Points" to add 2 points for Away Team
     */
    public void twoPointsAwayTeam(View view) {
        scoreAway = scoreAway + 2;
        displayForAwayTeam(scoreAway);
    }

    /**
     * Click "Free Throw" to add 1 point for Team B
     */
    public void onePointAwayTeam(View view) {
        scoreAway = scoreAway + 1;
        displayForAwayTeam(scoreAway);
    }

    /**
     * Click "reset" to reset scores for Team A and B to 0
     */
    public void reset(View view) {
        scoreHome = 0;
        scoreAway = 0;
        displayForHomeTeam(scoreHome);
        displayForAwayTeam(scoreAway);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForHomeTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_team_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForAwayTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_team_score);
        scoreView.setText(String.valueOf(score));
    }
}
