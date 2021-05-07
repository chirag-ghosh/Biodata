package com.example.mybiodata.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GithubViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    private MutableLiveData<String> mText;

    public GithubViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("To be updated soon!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}