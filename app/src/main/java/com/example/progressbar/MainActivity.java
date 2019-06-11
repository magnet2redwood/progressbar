package com.example.progressbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.daimajia.numberprogressbar.NumberProgressBar;

public class MainActivity extends AppCompatActivity {
    String Percentage;
    int i;
    EditText editText;
    NumberProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText= (EditText) findViewById(R.id.percentage);
        progressBar=(NumberProgressBar)findViewById(R.id.number_progress_bar);



    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void givePercentage(View view) {
        Percentage= editText.getText().toString();
        i= Integer.valueOf(Percentage);
        Log.d("TAG","value of edittaext"+i);
        progressBar.setProgress(i);
    }

    public void gotoSecond(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
