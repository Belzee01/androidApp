package com.example.belzee.fullscreentablet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.belzee.fullscreentablet.survey.steps.GenderStepActivity;

public class FullscreenActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_fullscreen);
    }

    public void backgroundClick(View view) {
        Intent nextStep = new Intent(FullscreenActivity.this, GenderStepActivity.class);
        FullscreenActivity.this.startActivity(nextStep);
    }
}
