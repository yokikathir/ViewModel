package com.kathir.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {
private String TAG=this.getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView mTextView = findViewById(R.id.tvNumber);
//        MainActivityDataGenerator myData = new MainActivityDataGenerator();
        MainActivityViewModel model = ViewModelProviders.of(this).get(MainActivityViewModel.class);
        String myRandomNumber = model.getNumber();
        mTextView.setText(myRandomNumber);

        Log.i(TAG, "Random Number Set");
    }
}
