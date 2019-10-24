package com.github.peppe998e.mvp.activities.main;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.peppe998e.mvp.CoreModel;
import com.github.peppe998e.mvp.R;
import com.github.peppe998e.mvp.bases.BaseView;

/**
 * Example class that extends BaseView and implements its CONTRACT
 *
 */
public class MainView extends BaseView<MainContract.Presenter> implements MainContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setPresenter(new MainPresenter(this, (CoreModel)getApplicationContext()));
    }

    @Override
    protected void onDestroy() {
        getPresenter().onDestroy();
        super.onDestroy();
    }

    @Override
    public void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    public void click_me_button(View view) {
        getPresenter().callModelTestToast();
    }

    public void openExample(View view) {
        getPresenter().openExampleView();
    }

}
