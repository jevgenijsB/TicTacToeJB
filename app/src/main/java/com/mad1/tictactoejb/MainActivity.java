package com.mad1.tictactoejb;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView text;
    private TextView[][] grid_TextView = new TextView[3][3];
    private String[][] grid_String = new String[3][3];
    private int i,a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        grid_TextView[0][0] = (TextView) findViewById(R.id.row1Col1);
        grid_TextView[0][0].setOnClickListener(this);
        grid_TextView[0][1] = (TextView) findViewById(R.id.row1Col2);
        grid_TextView[0][1].setOnClickListener(this);
        grid_TextView[0][2] = (TextView) findViewById(R.id.row1Col3);
        grid_TextView[0][2].setOnClickListener(this);
        grid_TextView[1][0] = (TextView) findViewById(R.id.row2Col1);
        grid_TextView[1][0].setOnClickListener(this);
        grid_TextView[1][1] = (TextView) findViewById(R.id.row2Col2);
        grid_TextView[1][1].setOnClickListener(this);
        grid_TextView[1][2] = (TextView) findViewById(R.id.row2Col3);
        grid_TextView[1][2].setOnClickListener(this);
        grid_TextView[2][0] = (TextView) findViewById(R.id.row3Col1);
        grid_TextView[2][0].setOnClickListener(this);
        grid_TextView[2][1] = (TextView) findViewById(R.id.row3Col2);
        grid_TextView[2][1].setOnClickListener(this);
        grid_TextView[2][2] = (TextView) findViewById(R.id.row3Col3);
        grid_TextView[2][2].setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.row1Col1:
                grid_String[0][0] = "X";
                  display_Grid();
                  break;
            case R.id.row1Col2:
                grid_String[0][1] = "X";
                display_Grid();
                break;
            case R.id.row1Col3:
                grid_String[0][2] = "X";
                display_Grid();
                break;
            case R.id.row2Col1:
                grid_String[1][0] = "X";
                display_Grid();
                break;
            case R.id.row2Col2:
                grid_String[1][1] = "X";
                display_Grid();
                break;
            case R.id.row2Col3:
                grid_String[1][2] = "X";
                display_Grid();
                break;
            case R.id.row3Col1:
                grid_String[2][0] = "X";
                display_Grid();
                break;
            case R.id.row3Col2:
                grid_String[2][1] = "X";
                display_Grid();
                break;
            case R.id.row3Col3:
                grid_String[2][2] = "X";
                display_Grid();
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.action_new_game:
               text.setText("New Game");
               break;

            case R.id.action_settings:
                text.setText("Settings");
                break;

            case R.id.action_exit:
                text.setText("Exit");
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    public void display_Grid(){
        for (int i=0;i<3;i++){
            for(int a=0;a<3;a++){
                 grid_TextView[i][a].setText(grid_String[i][a]);
            }
        }
    }



}