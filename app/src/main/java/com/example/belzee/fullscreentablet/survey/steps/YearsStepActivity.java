package com.example.belzee.fullscreentablet.survey.steps;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import com.example.belzee.fullscreentablet.R;

public class YearsStepActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // remove title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.years_layout);

        GridView gridView = (GridView)findViewById(R.id.gridview);

        gridView.addView();
    }

    public static class YearsAdapter extends BaseAdapter {

        private final Context mContext;
        private final Button[] buttons;

        // 1
        public YearsAdapter(Context context, Button[] buttons) {
            this.mContext = context;
            this.buttons = buttons;
        }

        // 2
        @Override
        public int getCount() {
            return buttons.length;
        }

        // 3
        @Override
        public long getItemId(int position) {
            return 0;
        }

        // 4
        @Override
        public Object getItem(int position) {
            return null;
        }

        // 5
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView dummyTextView = new TextView(mContext);
            dummyTextView.setText(String.valueOf(position));
            return dummyTextView;
        }

    }

}
