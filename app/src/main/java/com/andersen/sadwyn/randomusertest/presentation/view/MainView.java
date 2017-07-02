package com.andersen.sadwyn.randomusertest.presentation.view;

import com.andersen.sadwyn.randomusertest.model.pojos.User;
import com.arellomobile.mvp.MvpView;

import java.util.List;

public interface MainView extends MvpView {
    void setUsersToAdapter(List<User> users);
    void showProgressBar(boolean isShow);
}
