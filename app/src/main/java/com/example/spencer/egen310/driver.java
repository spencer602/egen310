package com.example.spencer.egen310;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class driver extends AppCompatActivity
{
    private int torqueLeft;
    private int torqueRight;
    private TextView torqueLeftText;
    private TextView torqueRightText;
    Button leftPlus;
    Button rightPlus;
    Button bothPlus;

    Button leftMinus;
    Button rightMinus;
    Button bothMinus;

    Button turnLeft;
    Button turnRight;

    Button stop;

    /**
     * Updates the 'Left Torque' and 'Right Torque' Labels.
     */
    protected void updateLabels()
    {
        torqueLeftText.setText("Left Torque: " + torqueLeft);
        torqueRightText.setText("Right Torque: " + torqueRight);
    }

    /**
     * initializes the GUI and creates the action listeners
     * @param savedInstanceState saved instance state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);
        torqueLeft = 0;
        torqueRight = 0;
        runListeners();
    }

    /**
     * initializes all of the listeners for the buttons
     */
    protected void runListeners()
    {
        torqueLeftText = findViewById(R.id.torqueLeftText);
        torqueRightText = findViewById(R.id.torqueRightText);

        leftPlus = (Button) findViewById(R.id.leftPlus);
        rightPlus = findViewById(R.id.rightPlus);
        bothPlus = findViewById(R.id.bothPlus);

        leftMinus = findViewById(R.id.leftMinus);
        rightMinus = findViewById(R.id.rightMinus);
        bothMinus = findViewById(R.id.bothMinus);

        turnLeft = findViewById(R.id.turnLeft);
        turnRight = findViewById(R.id.turnRight);

        stop = findViewById(R.id.stop);

        stop.setOnClickListener(new View.OnClickListener()
        {
            /**
             * action to be taken when 'stop' button is clicked
             * @param view current pane
             */
            public void onClick(View view)
            {
                torqueRight = 0;
                torqueLeft = 0;

                updateLabels();
            }
        });

        turnRight.setOnClickListener(new View.OnClickListener()
        {
            /**
             * action to be taken when 'turn right' button is pressed
             * @param view current pane
             */
            public void onClick(View view)
            {
                torqueLeft++;
                torqueRight--;

                updateLabels();
            }
        });

        turnLeft.setOnClickListener(new View.OnClickListener()
        {
            /**
             * action to be taken when 'turn left' button is clicked
             * @param view current pane
             */
            public void onClick(View view)
            {
                torqueLeft--;
                torqueRight++;
                updateLabels();
            }
        });

        bothMinus.setOnClickListener(new View.OnClickListener()
        {
            /**
             * action to be taken when 'both minus' button is pressed
             * @param view current pane
             */
            public void onClick(View view)
            {
                torqueLeft--;
                torqueRight--;
                updateLabels();
            }
        });

        bothPlus.setOnClickListener(new View.OnClickListener()
        {
            /**
             * action to be taken when 'both plus' button is pressed
             * @param view current pane
             */
            public void onClick(View view)
            {
                torqueLeft++;
                torqueRight++;

                updateLabels();
            }
        });

        leftPlus.setOnClickListener(new View.OnClickListener()
        {
            /**
             * action to be taken when 'left plus' button is pressed
             * @param view  current pane
             */
            public void onClick(View view)
            {
                torqueLeft++;
                updateLabels();
            }
        });

        rightPlus.setOnClickListener(new View.OnClickListener()
        {
            /**
             * action to be taken when 'right plus' button is pressed
             * @param view  current pane
             */
            public void onClick(View view)
            {
                torqueRight++;
                updateLabels();
            }
        });

        leftMinus.setOnClickListener(new View.OnClickListener()
        {
            /**
             * action to be taken when 'left minus' button is pressed
             * @param view  current pane
             */
            public void onClick(View view)
            {
                torqueLeft--;
                updateLabels();
            }
        });

        rightMinus.setOnClickListener(new View.OnClickListener()
        {
            /**
             * action to be taken when 'right minus' button is pressed
             * @param view  current pane
             */
            public void onClick(View view)
            {
                torqueRight--;
                updateLabels();
            }
        });
    }
}