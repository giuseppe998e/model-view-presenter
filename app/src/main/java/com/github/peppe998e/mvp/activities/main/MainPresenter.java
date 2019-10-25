package com.github.peppe998e.mvp.activities.main;

import android.content.Context;
import android.content.Intent;

import com.github.peppe998e.mvp.CoreModel;
import com.github.peppe998e.mvp.activities.example.ExampleView;
import com.github.peppe998e.mvp.bases.BasePresenter;
import com.github.peppe998e.mvp.utils.CallBack;

/**
 * Example class that extends BasePresenter and implements its CONTRACT
 *
 */
class MainPresenter extends BasePresenter<MainContract.View, CoreModel> implements MainContract.Presenter {

    MainPresenter(MainContract.View view, CoreModel model) {
        super(view, model);
    }

    @Override
    public void callModelTestToast() {
        CallBack<String> cb = text -> getView().showToast(text);  // CallBack action (lambda expression)
        getModel().testString(cb);
    }

    @Override
    public void openExampleView() {
        Intent i = new Intent((Context)getView(), ExampleView.class);
        ((Context) getView()).startActivity(i);
    }

}
