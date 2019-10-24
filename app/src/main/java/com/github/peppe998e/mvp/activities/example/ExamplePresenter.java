package com.github.peppe998e.mvp.activities.example;

import com.github.peppe998e.mvp.CoreModel;
import com.github.peppe998e.mvp.bases.BasePresenter;
import com.github.peppe998e.mvp.utils.CallBack;

/**
 * Example class that extends BasePresenter and implements its CONTRACT
 *
 */
class ExamplePresenter extends BasePresenter<ExampleContract.View, CoreModel> implements ExampleContract.Presenter {

    ExamplePresenter(ExampleContract.View view, CoreModel model) {
        super(view, model);
    }

    @Override
    public void callModelTestToast() {
        CallBack<String> cb = text -> getView().showToast(text); // CallBack action (lambda expression)
        getModel().testString(cb);
    }

}
