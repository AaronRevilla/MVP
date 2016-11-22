package com.project.aaron.mvp.presenter;

import com.project.aaron.mvp.BasePresenter;
import com.project.aaron.mvp.view.MainView;

/**
 * Created by User on 11/22/2016.
 */

public interface MainMvpPresenter extends BasePresenter<MainView>{
    void loadData();
}
