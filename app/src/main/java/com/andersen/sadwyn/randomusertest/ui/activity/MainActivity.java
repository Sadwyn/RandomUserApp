package com.andersen.sadwyn.randomusertest.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.andersen.sadwyn.randomusertest.R;
import com.andersen.sadwyn.randomusertest.databinding.ActivityMainBinding;
import com.andersen.sadwyn.randomusertest.model.pojos.User;
import com.andersen.sadwyn.randomusertest.presentation.presenter.blank.MainPresenter;
import com.andersen.sadwyn.randomusertest.presentation.view.blank.MainView;
import com.andersen.sadwyn.randomusertest.ui.adapters.UserAdapter;
import com.arellomobile.mvp.MvpActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

import java.util.List;

public class MainActivity extends MvpActivity implements MainView {
    public static final String TAG = "MainActivity";
    @InjectPresenter
    MainPresenter mMainPresenter;
    ActivityMainBinding binding;
    UserAdapter adapter;

    public static Intent getIntent(final Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initViews();
        mMainPresenter.attachView(this);
    }

    private void initViews() {
        adapter = new UserAdapter();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.userListRecycler.setLayoutManager(layoutManager);
        binding.userListRecycler.setAdapter(adapter);


        binding.userListRecycler.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                if (isLastVisible(layoutManager)) {
                    mMainPresenter.loadMoreUsers();
                }
            }
        });
    }

    boolean isLastVisible(LinearLayoutManager layoutManager) {
        int pos = layoutManager.findLastCompletelyVisibleItemPosition();
        int numItems = binding.userListRecycler.getAdapter().getItemCount() - 1;
        return (pos >= numItems);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMainPresenter.detachView(this);
    }

    @Override
    public void setUsersToAdapter(List<User> users) {
        adapter.addUsers(users);
    }

    @Override
    public void showProgressBar(boolean isShow) {
        binding.progressBarFirstLoad.setVisibility(isShow ? View.VISIBLE : View.GONE);
    }
}
