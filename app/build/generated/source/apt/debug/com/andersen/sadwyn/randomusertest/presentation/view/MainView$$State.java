package com.andersen.sadwyn.randomusertest.presentation.view;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class MainView$$State extends MvpViewState<com.andersen.sadwyn.randomusertest.presentation.view.MainView> implements com.andersen.sadwyn.randomusertest.presentation.view.MainView {

	@Override
	public  void setUsersToAdapter( java.util.List<com.andersen.sadwyn.randomusertest.model.pojos.User> users) {
		SetUsersToAdapterCommand setUsersToAdapterCommand = new SetUsersToAdapterCommand(users);
		mViewCommands.beforeApply(setUsersToAdapterCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.andersen.sadwyn.randomusertest.presentation.view.MainView view : mViews) {
			view.setUsersToAdapter(users);
		}

		mViewCommands.afterApply(setUsersToAdapterCommand);
	}

	@Override
	public  void showProgressBar( boolean isShow) {
		ShowProgressBarCommand showProgressBarCommand = new ShowProgressBarCommand(isShow);
		mViewCommands.beforeApply(showProgressBarCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.andersen.sadwyn.randomusertest.presentation.view.MainView view : mViews) {
			view.showProgressBar(isShow);
		}

		mViewCommands.afterApply(showProgressBarCommand);
	}

	@Override
	public  void showDialogRetry() {
		ShowDialogRetryCommand showDialogRetryCommand = new ShowDialogRetryCommand();
		mViewCommands.beforeApply(showDialogRetryCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(com.andersen.sadwyn.randomusertest.presentation.view.MainView view : mViews) {
			view.showDialogRetry();
		}

		mViewCommands.afterApply(showDialogRetryCommand);
	}


	public class SetUsersToAdapterCommand extends ViewCommand<com.andersen.sadwyn.randomusertest.presentation.view.MainView> {
		public final java.util.List<com.andersen.sadwyn.randomusertest.model.pojos.User> users;

		SetUsersToAdapterCommand( java.util.List<com.andersen.sadwyn.randomusertest.model.pojos.User> users) {
			super("setUsersToAdapter", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.users = users;
		}

		@Override
		public void apply(com.andersen.sadwyn.randomusertest.presentation.view.MainView mvpView) {
			mvpView.setUsersToAdapter(users);
		}
	}

	public class ShowProgressBarCommand extends ViewCommand<com.andersen.sadwyn.randomusertest.presentation.view.MainView> {
		public final boolean isShow;

		ShowProgressBarCommand( boolean isShow) {
			super("showProgressBar", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.isShow = isShow;
		}

		@Override
		public void apply(com.andersen.sadwyn.randomusertest.presentation.view.MainView mvpView) {
			mvpView.showProgressBar(isShow);
		}
	}

	public class ShowDialogRetryCommand extends ViewCommand<com.andersen.sadwyn.randomusertest.presentation.view.MainView> {
		ShowDialogRetryCommand() {
			super("showDialogRetry", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(com.andersen.sadwyn.randomusertest.presentation.view.MainView mvpView) {
			mvpView.showDialogRetry();
		}
	}
}
