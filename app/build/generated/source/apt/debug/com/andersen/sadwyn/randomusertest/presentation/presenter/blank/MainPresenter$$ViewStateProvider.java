package com.andersen.sadwyn.randomusertest.presentation.presenter.blank;

import com.arellomobile.mvp.ViewStateProvider;
import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.MvpViewState;

public class MainPresenter$$ViewStateProvider extends ViewStateProvider {
	
	@Override
	public MvpViewState<? extends MvpView> getViewState() {
		return new com.andersen.sadwyn.randomusertest.presentation.view.blank.MainView$$State();
	}
}