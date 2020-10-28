package com.mad1.tictactoejb;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text, row1Col1;
    private TextView grid[][];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        addListenerOnTextView();
    }

    public void addListenerOnTextView(){
        row1Col1 = (TextView) findViewById(R.id.row1Col1);
        row1Col1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        row1Col1.setText("X");
                    }
                }
        );
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
}