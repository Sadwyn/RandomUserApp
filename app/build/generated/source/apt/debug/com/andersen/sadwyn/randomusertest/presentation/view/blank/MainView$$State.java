package com.andersen.sadwyn.randomusertest.presentation.view.blank;

import com.andersen.sadwyn.randomusertest.presentation.view.MainView;
import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;

public class MainView$$State extends MvpViewState<MainView> implements MainView {

	@Override
	public  void setUsersToAdapter( java.util.List<com.andersen.sadwyn.randomusertest.model.pojos.User> users) {
		SetUsersToAdapterCommand setUsersToAdapterCommand = new SetUsersToAdapterCommand(users);
		mViewCommands.beforeApply(setUsersToAdapterCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(MainView view : mViews) {
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

		for(MainView view : mViews) {
			view.showProgressBar(isShow);
		}

		mViewCommands.afterApply(showProgressBarCommand);
	}


	public class SetUsersToAdapterCommand extends ViewCommand<MainView> {
		public final java.util.List<com.andersen.sadwyn.randomusertest.model.pojos.User> users;

		SetUsersToAdapterCommand( java.util.List<com.andersen.sadwyn.randomusertest.model.pojos.User> users) {
			super("setUsersToAdapter", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.users = users;
		}

		@Override
		public void apply(MainView mvpView) {
			mvpView.setUsersToAdapter(users);
		}
	}

	public class ShowProgressBarCommand extends ViewCommand<MainView> {
		public final boolean isShow;

		ShowProgressBarCommand( boolean isShow) {
			super("showProgressBar", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.isShow = isShow;
		}

		@Override
		public void apply(MainView mvpView) {
			mvpView.showProgressBar(isShow);
		}
	}
}
