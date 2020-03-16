package com.twelve.latesleeper.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.twelve.latesleeper.R;

public class RefocusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refocus);
    }

    //OnClick for the save button will trigger the next screen in the workflow
    public void nextButtonAlarm(View view){
        Intent intent = new Intent(RefocusActivity.this, AlarmClockWakeUpActivity.class);
        startActivity(intent);

        //TODO --> We need to save all the information the user enters on this screen into the database on save
    }

    //OnClick for the cancel button will not save any information
    /*public void backButtonRefocus(View view){
        Intent intent = new Intent(RefocusActivity.this, ReframeActivity.class);
        startActivity(intent);
    }*/
}
