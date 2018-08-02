package com.example.belzee.fullscreentablet.survey.steps;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.belzee.fullscreentablet.FullscreenActivity;
import com.example.belzee.fullscreentablet.R;

public class GenderStepActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // remove title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.gender_layout);
    }

    public void onMenBtnClick(View view) {
        Intent nextStep = new Intent(GenderStepActivity.this, YearsStepActivity.class);
        GenderStepActivity.this.startActivity(nextStep);
    }

    public void onWomenBtnClick(View view) {
        Intent nextStep = new Intent(GenderStepActivity.this, YearsStepActivity.class);
        GenderStepActivity.this.startActivity(nextStep);
    }
}
