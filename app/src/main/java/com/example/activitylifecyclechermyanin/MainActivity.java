package com.example.activitylifecyclechermyanin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle", "onCreate");
        txtView = findViewById(R.id.txtView);
        txtView.append("\n" + "onCreate");
        if (savedInstanceState == null) {
            Log.d("Lifecycle", " Нет данных");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle", "onStart");
        txtView = findViewById(R.id.txtView);
        txtView.append("\n" + "onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("Lifecycle", "onRestoreInstanceState");
        txtView = findViewById(R.id.txtView);
        txtView.append("\n" + "onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle", "onResume");
        txtView = findViewById(R.id.txtView);
        txtView.append("\n" + "onResume");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("Lifecycle", "onSaveInstanceState");
        txtView = findViewById(R.id.txtView);
        txtView.append("\n" + "onSaveInstanceState");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle", "onPause");
        txtView = findViewById(R.id.txtView);
        txtView.append("\n" + "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle", "onStop");
        txtView = findViewById(R.id.txtView);
        txtView.append("\n" + "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle", "onDestroy");
        txtView = findViewById(R.id.txtView);
        txtView.append("\n" + "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lifecycle", "onRestart");
        txtView = findViewById(R.id.txtView);
        txtView.append("\n" + "onRestart");
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d("Lifecycle", "onPostCreate");
        txtView = findViewById(R.id.txtView);
        txtView.append("\n" + "onPostCreate");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("Lifecycle", "onPostResume");
        txtView = findViewById(R.id.txtView);
        txtView.append("\n" + "onPostResume");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        super.onKeyDown(keyCode, event);
        Log.d("Lifecycle", "onKeyDown");
        txtView = findViewById(R.id.txtView);
        txtView.append("\n" + "onKeyDown");
        event.startTracking();
        return true;
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        super.onKeyLongPress(keyCode, event);
        Log.d("Lifecycle", "onKeyLongPress");
        txtView = findViewById(R.id.txtView);
        txtView.append("\n" + "onKeyLongPress");
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d("Lifecycle", "onBackPressed");
        txtView = findViewById(R.id.txtView);
        txtView.append("\n" + "onBackPressed");
    }
}