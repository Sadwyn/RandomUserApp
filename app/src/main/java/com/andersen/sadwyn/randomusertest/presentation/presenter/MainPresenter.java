package com.andersen.sadwyn.randomusertest.presentation.presenter;


import android.util.Log;

import com.andersen.sadwyn.randomusertest.model.retrofit.ServerTask;
import com.andersen.sadwyn.randomusertest.presentation.view.MainView;
import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {
    public static final int USERS_COUNT = 20;
    public static final String ERROR = "ERROR";

    private CompositeDisposable disposable = new CompositeDisposable();

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().showProgressBar(true);
        disposable.add(ServerTask.getInstance().getServices().getUsers(USERS_COUNT)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(response -> {
                            getViewState().showProgressBar(false);
                            getViewState().setUsersToAdapter(response.getUsers());
                        },
                        throwable -> {
                            Log.i(ERROR, throwable.getMessage());
                            getViewState().showProgressBar(false);
                            getViewState().showDialogRetry();
                        }));
    }

    public void loadMoreUsers() {
        disposable.add(ServerTask.getInstance().getServices().getUsers(USERS_COUNT)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(response -> getViewState().setUsersToAdapter(response.getUsers()),
                        throwable -> {
                            Log.i(ERROR, throwable.getMessage());
                            getViewState().showProgressBar(false);
                            getViewState().showDialogRetry();
                        }));
    }

    @Override
    public void detachView(MainView view) {
        super.detachView(view);
        if (disposable != null)
            disposable.clear();
    }
}
