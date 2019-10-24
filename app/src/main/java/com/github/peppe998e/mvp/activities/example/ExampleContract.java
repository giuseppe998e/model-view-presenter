package com.github.peppe998e.mvp.activities.example;

import com.github.peppe998e.mvp.bases.BaseContract;

/**
 * These interfaces contain all the methods that MUST be implemented
 * respectively from "ExampleView" and "ExamplePresenter"
 *
 */
interface ExampleContract {

    interface View extends BaseContract.View {

    }

    interface Presenter extends BaseContract.Presenter {
        void callModelTestToast();
    }

}
