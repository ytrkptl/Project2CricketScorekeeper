package com.example.android.project2cricketscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int scorePlayerOneTeamA = 0;
    int scorePlayerTwoTeamA = 0;
    int scorePlayerOneTeamB = 0;
    int scorePlayerTwoTeamB = 0;
    int wicketTeamA = 0;
    int wicketTeamB = 0;
    int wicket = 0;
    boolean on = false;
    RadioButton playerRadioOneTeamA;
    RadioButton playerRadioTwoTeamA;
    RadioButton playerRadioOneTeamB;
    RadioButton playerRadioTwoTeamB;
    int selectedPlayerId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onToggleClicked(View view) {
        // Is the toggle on?
        toggleButton = findViewById(R.id.toggle_button);
        on = toggleButton.isChecked();

        if (on) {
            // Enable vibrate
            selectTeam();
        } else {
            // Disable vibrate
            selectTeam();
        }
    }

    public void selectTeam() {
        int run = 0;
        if (on) {
            selectBattingTeamB(run, wicket);
        } else {
            selectBattingTeamA(run, wicket);
        }
    }

    /**
     * This method is called when the +1 button is clicked.
     */
    public void addOneRun(View v) {
        int run = 1;
        if (on) {
            selectBattingTeamB(run, 0);
        } else {
            selectBattingTeamA(run, 0);
        }
    }


    /**
     * This method is called when the +2 button is clicked.
     */
    public void addTwoRuns(View v) {
        int run = 2;
        if (on) {
            selectBattingTeamB(run, 0);
        } else {
            selectBattingTeamA(run, 0);
        }
    }

    /**
     * This method is called when the +3 button is clicked.
     */
    public void addThreeRuns(View v) {
        int run = 3;
        if (on) {
            selectBattingTeamB(run, 0);
        } else {
            selectBattingTeamA(run, 0);
        }
    }

    /**
     * This method is called when the +4 button is clicked.
     */
    public void addFourRuns(View v) {
        int run = 4;
        if (on) {
            selectBattingTeamB(run, 0);
        } else {
            selectBattingTeamA(run, 0);
        }
    }

    /**
     * This method is called when the +6 button is clicked.
     */
    public void addSixRuns(View v) {
        int run = 6;
        if (on) {
            selectBattingTeamB(run, 0);
        } else {
            selectBattingTeamA(run, 0);
        }
    }

    /**
     * This method is called when the +1 button is clicked.
     */
    public void addWicket(View v) {
        wicket = 1;
        if (on) {
            selectBattingTeamB(0, wicket);
        } else {
            selectBattingTeamA(0, wicket);
        }
    }

    /**
     * This method is called when the +1 button is clicked.
     */
    public void minusOneRun(View v) {
        int run = -1;
        if (on) {
            selectBattingTeamB(run, 0);
        } else {
            selectBattingTeamA(run, 0);
        }
    }

    /**
     * This method is called when the +2 button is clicked.
     */
    public void minusTwoRuns(View v) {
        int run = -2;
        if (on) {
            selectBattingTeamB(run, 0);
        } else {
            selectBattingTeamA(run, 0);
        }
    }

    /**
     * This method is called when the +3 button is clicked.
     */
    public void minusThreeRuns(View v) {
        int run = -3;
        if (on) {
            selectBattingTeamB(run, 0);
        } else {
            selectBattingTeamA(run, 0);
        }
    }

    /**
     * This method is called when the +4 button is clicked.
     */
    public void minusFourRuns(View v) {
        int run = -4;
        if (on) {
            selectBattingTeamB(run, 0);
        } else {
            selectBattingTeamA(run, 0);
        }
    }

    /**
     * This method is called when the +6 button is clicked.
     */
    public void minusSixRuns(View v) {
        int run = -6;
        if (on) {
            selectBattingTeamB(run, 0);
        } else {
            selectBattingTeamA(run, 0);
        }
    }

    /**
     * This method is called when the +1 button is clicked.
     */
    public void minusWicket(View v) {
        wicket = -1;
        if (on) {
            selectBattingTeamB(0, wicket);
        } else {
            selectBattingTeamA(0, wicket);
        }
    }

    public void selectBattingTeamA(int run, int wicket) {
        playerRadioOneTeamA = findViewById(R.id.player_1);
        playerRadioTwoTeamA = findViewById(R.id.player_2);
        playerRadioOneTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerRadioTwoTeamA.setChecked(false);
                selectedPlayerId = 1;
            }
        });
        playerRadioTwoTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerRadioOneTeamA.setChecked(false);
                selectedPlayerId = 2;
            }
        });
        checkRadioTeamOne(selectedPlayerId, run, wicket);
    }

    public void selectBattingTeamB(int run, int wicket) {
        playerRadioOneTeamB = findViewById(R.id.player_teamB_1);
        playerRadioTwoTeamB = findViewById(R.id.player_teamB_2);
        playerRadioOneTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerRadioTwoTeamB.setChecked(false);
                selectedPlayerId = 1;
            }
        });
        playerRadioTwoTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerRadioOneTeamB.setChecked(false);
                selectedPlayerId = 2;
            }
        });
        checkAnswersRadio(selectedPlayerId, playerRadioOneTeamB, playerRadioTwoTeamB, run, wicket);
    }

    /**
     * Check the answer to question one and return the result of question 1 upon pressing the      *
     * Check answer button that is located right under Question 1.
     */
    private void checkRadioTeamOne(int selectedPlayerId, int run, int wicket) {
        if (selectedPlayerId == 0) {
            Toast.makeText(this, getString(R.string.select_player_on_strike), Toast.LENGTH_LONG).show();
        } else if (selectedPlayerId == 1) {
            if (wicket == 0) {
                displayForTeamA(run);
                displayForPlayerOneTeamA(run);
                displayWicketsForTeamA(wicket);
            } else {
                displayWicketsForTeamA(wicket);
                playerRadioOneTeamA.setChecked(false);
                playerRadioOneTeamA.setEnabled(false);
                playerRadioTwoTeamA.setChecked(true);
            }
        } else if (selectedPlayerId == 2) {
            if (wicket == 0) {
                displayForTeamA(run);
                displayForPlayerTwoTeamA(run);
                displayWicketsForTeamA(wicket);
            } else {
                displayWicketsForTeamA(wicket);
                playerRadioTwoTeamA.setChecked(false);
                playerRadioTwoTeamA.setEnabled(false);
            }
        }
    }

    /**
     * Check the answer to question one and return the result of question 1 upon pressing the      *
     * Check answer button that is located right under Question 1.
     */
    private void checkAnswersRadio(int selectedPlayerId, RadioButton playerRadioOneTeamB, RadioButton playerRadioTwoTeamB,
                                   int run, int wicket) {
        if (selectedPlayerId == 0) {
            Toast.makeText(this, getString(R.string.select_player_on_strike), Toast.LENGTH_LONG).show();
        } else if (selectedPlayerId == 1) {
            if (wicket == 0) {
                displayForTeamA(run);
                displayForPlayerOneTeamB(run);
                displayWicketsForTeamB(wicket);
            } else {
                displayWicketsForTeamA(wicket);
                playerRadioOneTeamB.setChecked(false);
                playerRadioOneTeamB.setEnabled(false);
            }
        } else if (selectedPlayerId == 2) {
            if (wicket == 0) {
                displayForTeamA(run);
                displayForPlayerTwoTeamB(run);
                displayWicketsForTeamB(wicket);
            } else {
                displayWicketsForTeamA(wicket);
                playerRadioTwoTeamB.setChecked(false);
                playerRadioTwoTeamB.setEnabled(false);
            }
        }
    }

    /**
     * This method displays the total score for Team A on the screen.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.runsA);
        scoreTeamA = scoreTeamA + score;
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    /**
     * This method displays the total score for Player 1 on the screen.
     */
    public void displayForPlayerOneTeamA(int score) {
        TextView scoreView = findViewById(R.id.playerOneRuns);
        scorePlayerOneTeamA = scorePlayerOneTeamA + score;
        scoreView.setText(String.valueOf(scorePlayerOneTeamA));
    }

    /**
     * This method displays the total score for Player 2 on the screen.
     */
    public void displayForPlayerTwoTeamA(int score) {
        TextView scoreView = findViewById(R.id.playerTwoRunsTeamA);
        scorePlayerTwoTeamA = scorePlayerTwoTeamA + score;
        scoreView.setText(String.valueOf(scorePlayerTwoTeamA));
    }

    /**
     * This method displays the total wickets for Team A on the screen.
     */
    public void displayWicketsForTeamA(int wicket) {
        TextView scoreView = findViewById(R.id.wicketsA);
        wicketTeamA = wicketTeamA + wicket;
        scoreView.setText(String.valueOf(wicketTeamA));
    }

    /**
     * This method displays the total score for Team B on the screen.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.runsB);
        scoreTeamB = scoreTeamB + score;
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    /**
     * This method displays the total score for Player 1 on the screen.
     */
    public void displayForPlayerOneTeamB(int score) {
        TextView scoreView = findViewById(R.id.playerOneRunsTeamB);
        scorePlayerOneTeamB = scorePlayerOneTeamB + score;
        scoreView.setText(String.valueOf(scorePlayerOneTeamB));
    }

    /**
     * This method displays the total score for Player 2 on the screen.
     */
    public void displayForPlayerTwoTeamB(int score) {
        TextView scoreView = findViewById(R.id.playerTwoRunsTeamB);
        scorePlayerTwoTeamB = scorePlayerTwoTeamB + score;
        scoreView.setText(String.valueOf(scorePlayerTwoTeamB));
    }

    /**
     * This method displays the total wickets for Team B on the screen.
     */
    public void displayWicketsForTeamB(int wicket) {
        TextView scoreView = findViewById(R.id.wicketsB);
        wicketTeamB = wicketTeamB + wicket;
        scoreView.setText(String.valueOf(wicketTeamB));
    }

    /**
     * Resets the scores for Team B.
     */
    public void resetScores(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        wicketTeamA = 0;
        wicketTeamB = 0;
        scorePlayerOneTeamA = 0;
        scorePlayerTwoTeamA = 0;
        scorePlayerOneTeamB = 0;
        scorePlayerTwoTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayWicketsForTeamA(wicketTeamA);
        displayWicketsForTeamB(wicketTeamB);
        displayForPlayerOneTeamA(scorePlayerOneTeamA);
        displayForPlayerTwoTeamA(scorePlayerOneTeamA);
        displayForPlayerOneTeamB(scorePlayerOneTeamB);
        displayForPlayerTwoTeamB(scorePlayerOneTeamA);
    }
}
