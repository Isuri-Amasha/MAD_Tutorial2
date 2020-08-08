package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtView2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView2 = findViewById(R.id.TvMsg2);
        txtView2.setText(R.string.Msg2);

        Log.i("Lifecycle", "OnCreate() invoked");

    }

    public void OnStart()
    {
        super.onStart();
        Log.i("LifeCycle", "onStart() invoked");
    }

    public void OnRestart()
    {
        super.onRestart();
        Log.i("LifeCycle", "onRestart() invoked");
    }

    public void OnResume()
    {
        super.onResume();
        Log.i("LifeCycle", "onResume() invoked");
    }

    public void OnPause()
    {
        super.onPause();
        Log.i("LifeCycle", "onPause() invoked");
    }

    public void OnStop()
    {
        super.onStop();
        Log.i("LifeCycle", "onStop() invoked");
    }

    public void OnDestroy()
    {
        super.onDestroy();
        Log.i("LifeCycle", "onDestroy() invoked");
    }

}