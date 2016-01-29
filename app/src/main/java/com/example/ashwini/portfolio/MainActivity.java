package com.example.ashwini.portfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button streamerAppBtn = (Button)findViewById(R.id.btn_streamer_app);
        Button scoresAppBtn = (Button)findViewById(R.id.btn_scores_app);
        Button libraryAppBtn = (Button)findViewById(R.id.btn_library_app);
        Button buildAppBtn = (Button)findViewById(R.id.btn_build_app);
        Button readerAppBtn = (Button)findViewById(R.id.btn_reader_app);
        Button capstoneAppBtn = (Button)findViewById(R.id.btn_capstone_app);

        View.OnClickListener buttonClickLictener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleButtonClick(v.getId());
            }
        };
        streamerAppBtn.setOnClickListener(buttonClickLictener);
        scoresAppBtn.setOnClickListener(buttonClickLictener);
        libraryAppBtn.setOnClickListener(buttonClickLictener);
        buildAppBtn.setOnClickListener(buttonClickLictener);
        readerAppBtn.setOnClickListener(buttonClickLictener);
        capstoneAppBtn.setOnClickListener(buttonClickLictener);
    }

    private void handleButtonClick(int buttonId){
        switch (buttonId){
            case R.id.btn_streamer_app:
                showAppHelpMessage(getString(R.string.streamer_app_name));
                break;
            case R.id.btn_scores_app:
                showAppHelpMessage(getString(R.string.scores_app_name));
                break;
            case R.id.btn_library_app:
                showAppHelpMessage(getString(R.string.library_app_name));
                break;
            case R.id.btn_build_app:
                showAppHelpMessage(getString(R.string.build_app_name));
                break;
            case R.id.btn_reader_app:
                showAppHelpMessage(getString(R.string.reader_app_name));
                break;
            case R.id.btn_capstone_app:
                showAppHelpMessage(getString(R.string.capstone_app_name));
                break;
        }
    }

    private void showAppHelpMessage(String appName) {
        String message = String.format(getString(R.string.app_help_message), appName);
        Toast.makeText(getBaseContext(), message, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
