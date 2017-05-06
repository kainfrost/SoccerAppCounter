package support.android.com.soccerappcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * Tracks the score for Team A.
     */
    int scoreTeamA = 0;

    /**
     * Tracks the yellow cards for Team A.
     */
    int cardTeamA = 0;

    /**
     * Tracks the corners for Team A.
     */
    int cornerTeamA = 0;


    /**
     *Tracks the score for Team B.
     */
    int scoreTeamB = 0;

    /**
     *Tracks the yellow cards for Team B.
     */
    int cardTeamB = 0;

    /**
     * Tracks the corners for Team B.
     */
    int cornerTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addGoalForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the cards for Team A by 1 .
     */
    public void addCardForTeamA(View v) {
        cardTeamA = cardTeamA + 1;
        cardForTeamA(cardTeamA);
    }

    /**
     * Increase the corner for Team A by 1.
     */
    public void addCornerForTeamA(View v) {
        cornerTeamA = cornerTeamA + 1;
        cornerForTeamA(cornerTeamA);
    }


    /**
     * Increase the score for Team B by 1 point.
     */
    public void addGoalForTeamB (View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the card for Team B by 1 point.
     */
    public void addCardForTeamB (View v) {
        cardTeamB = cardTeamB + 1;
        cardForTeamB(cardTeamB);
    }
    /**
     * Increase the corners for Team B by 1 point.
     */
    public void addCornerForTeamB (View v) {
        cornerTeamB = cornerTeamB + 1;
        cornerForTeamB(cornerTeamB);
    }

    /**
     * Resets all the results when clicked.
     */
    public void resetScore (View v) {
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        cardTeamB=0;
        cardForTeamB(cardTeamB);
        cornerTeamB=0;
        cornerForTeamB(cornerTeamB);
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        cardTeamA=0;
        cardForTeamA(cardTeamA);
        cornerTeamA=0;
        cornerForTeamA(cornerTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given cards for Team A.
     */
    public void cardForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given corner for Team A.
     */
    public void cornerForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_corner);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given cards for Team B.
     */
    public void cardForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given corner for Team B.
     */
    public void cornerForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_corner);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Reset score for both teams.
     */
    public void resetScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.reset_score);
        scoreView.setText(String.valueOf(score));
    }

}
