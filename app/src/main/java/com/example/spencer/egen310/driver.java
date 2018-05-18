package com.example.spencer.egen310;

import android.content.DialogInterface;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);
        torqueLeft = 0;
        torqueRight = 0;
        runListeners();
    }

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
            public void onClick(View view)
            {
                torqueRight = 0;
                torqueLeft = 0;

                torqueLeftText.setText("Left Torque: " + torqueLeft);
                torqueRightText.setText("Right Torque: " + torqueRight);
            }
        });

        turnRight.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                torqueLeft++;
                torqueRight--;
                torqueLeftText.setText("Left Torque: " + torqueLeft);
                torqueRightText.setText("Right Torque: " + torqueRight);
            }
        });


        turnLeft.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                torqueLeft--;
                torqueRight++;
                torqueLeftText.setText("Left Torque: " + torqueLeft);
                torqueRightText.setText("Right Torque: " + torqueRight);
            }
        });


        bothMinus.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                torqueLeft--;
                torqueRight--;
                torqueLeftText.setText("Left Torque: " + torqueLeft);
                torqueRightText.setText("Right Torque: " + torqueRight);
            }
        });



        bothPlus.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                torqueLeft++;
                torqueRight++;
                torqueLeftText.setText("Left Torque: " + torqueLeft);
                torqueRightText.setText("Right Torque: " + torqueRight);
            }
        });

        leftPlus.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                torqueLeft++;
                torqueLeftText.setText("Left Torque: " + torqueLeft);

            }
        });

        rightPlus.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                torqueRight++;
                torqueRightText.setText("Right Torque: " + torqueRight);

            }
        });

        leftMinus.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                torqueLeft--;
                torqueLeftText.setText("Left Torque: " + torqueLeft);

            }
        });

        rightMinus.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                torqueRight--;
                torqueRightText.setText("Right Torque: " + torqueRight);

            }
        });




    }

}
