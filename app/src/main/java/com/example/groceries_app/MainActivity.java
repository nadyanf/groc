package com.example.groceries_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }

    /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Reviews:
                // *** WHAT HAPPEN WHEN CLICK Reviews ***
                return true;
            case R.id.SignIn:
                // *** WHAT HAPPEN WHEN CLICK SignIn ***
                return true;
            case R.id.AboutUs:
                // *** WHAT HAPPEN WHEN CLICK AboutUs ***
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }*/
}