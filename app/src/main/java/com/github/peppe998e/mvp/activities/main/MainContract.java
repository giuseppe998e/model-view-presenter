package com.github.peppe998e.mvp.activities.main;

import com.github.peppe998e.mvp.activities.base.BaseContract;

/**
 * These interfaces contain all the methods that MUST be implemented
 * respectively from "MainView" and "MainPresenter"
 *
 */
interface MainContract {

    interface View extends BaseContract.View {

    }

    interface Presenter extends BaseContract.Presenter {
        void openExampleView();
        void callModelTestToast();
    }

}
