package com.hrz.hrzapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

//public class MainActivity extends AppCompatActivity {
public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity_";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        //TextView textView1 = (TextView)findViewById(R.id.textv1);
        //textView1.setText("this is hrz android program.");


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(TAG, "onBackPressed: onBackPressed_hrz");
        
    }
}
