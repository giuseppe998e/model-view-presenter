package com.github.peppe998e.mvp.activities.example;

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
public class ExampleView extends BaseView<ExampleContract.Presenter> implements ExampleContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        setPresenter(new ExamplePresenter(this, (CoreModel) getApplicationContext()));
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

}
