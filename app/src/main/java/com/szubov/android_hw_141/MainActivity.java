package com.szubov.android_hw_141;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    public static final String TEXT_VIEW_LIFE_CYCLE = "lifeCycleString";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Lifecycle", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            Log.d("Lifecycle", "savedInstanceState != null");
            mTextView = findViewById(R.id.textView);
            mTextView.setText(savedInstanceState.getString(TEXT_VIEW_LIFE_CYCLE));
        } else {
            Log.d("Lifecycle", "savedInstanceState == null");
            mTextView = findViewById(R.id.textView);
        }
        mTextView.append("\n" + "onCreate");

        findViewById(R.id.btnNewActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Lifecycle", "newActivityOnClick");
                mTextView.append("\n" + "newActivityOnClick");
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        Log.d("Lifecycle", "onStart");
        super.onStart();
        mTextView.append("\n" + "onStart");
    }

    @Override
    protected void onResume() {
        Log.d("Lifecycle", "onResume");
        super.onResume();
        mTextView.append("\n" + "onResume");
    }

    @Override
    protected void onPause() {
        Log.d("Lifecycle", "onPause");
        super.onPause();
        mTextView.append("\n" + "onPause");
    }

    @Override
    protected void onStop() {
        Log.d("Lifecycle", "onStop");
        super.onStop();
        mTextView.append("\n" + "onStop");
    }

    @Override
    protected void onDestroy() {
        Log.d("Lifecycle", "onDestroy");
        super.onDestroy();
        mTextView.append("\n" + "onDestroy");
    }

    @Override
    protected void onRestart() {
        Log.d("Lifecycle", "onRestart");
        super.onRestart();
        mTextView.append("\n" + "onRestart");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        Log.d("Lifecycle", "onPostCreate");
        super.onPostCreate(savedInstanceState);
        mTextView.append("\n" + "onPostCreate");
    }

    @Override
    protected void onPostResume() {
        Log.d("Lifecycle", "onPostResume");
        super.onPostResume();
        mTextView.append("\n" + "onPostResume");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d("Lifecycle", "onKeyDown");
        mTextView.append("\n" + "onKeyDown");
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Log.d("Lifecycle", "onKeyLongPress");
        mTextView.append("\n" + "onKeyLongPress");
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        Log.d("Lifecycle", "onBackPressed");
        super.onBackPressed();
        mTextView.append("\n" + "onBackPressed");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        Log.d("Lifecycle", "onSaveInstanceState");
        super.onSaveInstanceState(outState);
        mTextView.append("\n" + "onSaveInstanceState");
        outState.putString(TEXT_VIEW_LIFE_CYCLE, mTextView.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        Log.d("Lifecycle", "onRestoreInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        //mTextView.setText(savedInstanceState.getString(TEXT_VIEW_LIFE_CYCLE));
        mTextView.append("\n" + "onRestoreInstanceState");
    }
}