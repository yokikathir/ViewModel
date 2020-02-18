package com.kathir.viewmodel;

import android.util.Log;

import java.util.Random;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private String TAG = this.getClass().getSimpleName();
    private String myRandomNumber;

    public String getNumber(){

        if (myRandomNumber==null){
            createnumber();

        }
        return myRandomNumber;
    }

    private void createnumber() {
        Random random=new Random();
        myRandomNumber ="number:"+(random.nextInt(111)+1);

    }


    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i(TAG, "ViewModel Destroyed");
    }
}
