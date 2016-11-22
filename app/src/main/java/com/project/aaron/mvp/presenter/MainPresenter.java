package com.project.aaron.mvp.presenter;

import com.project.aaron.mvp.view.MainView;

/**
 * Created by User on 11/22/2016.
 */

public class MainPresenter implements MainMvpPresenter{

    MainView mainView;

    @Override
    public void loadData() {
        mainView.showProgress();



        try {//ctrl + alt + T
            Thread.sleep(5000);
            String fakeData = "Hello World Fire Flies";
            mainView.showText(fakeData);
        } catch (Exception e) {
            mainView.showError(e.getMessage());
        }

        mainView.hideProgress();
    }

    @Override
    public void attachView(MainView view) {
        this.mainView = view;
    }

    @Override
    public void detachView() {
        mainView = null;
    }
}
