package com.andersen.sadwyn.randomusertest.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.andersen.sadwyn.randomusertest.R;
import com.andersen.sadwyn.randomusertest.databinding.ActivityMainBinding;
import com.andersen.sadwyn.randomusertest.model.pojos.User;
import com.andersen.sadwyn.randomusertest.presentation.presenter.MainPresenter;
import com.andersen.sadwyn.randomusertest.presentation.view.DetailView;
import com.andersen.sadwyn.randomusertest.presentation.view.MainView;
import com.andersen.sadwyn.randomusertest.ui.adapters.UserAdapter;
import com.arellomobile.mvp.MvpActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

import org.parceler.Parcels;

import java.util.List;

public class MainActivity extends MvpActivity implements MainView, UserAdapter.OnUserClickListener {
    public static final String TAG = "MainActivity";
    public static final String USER_EXTRA = "USER_EXTRA";
    @InjectPresenter
    MainPresenter mMainPresenter;
    private UserAdapter adapter;
    private ActivityMainBinding binding;

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
        adapter = new UserAdapter(this, this);
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
        int pos = layoutManager.findLastVisibleItemPosition();
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

    @Override
    public void onUserClick(User user) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(USER_EXTRA, Parcels.wrap(user));
        startActivity(intent);
    }
}
