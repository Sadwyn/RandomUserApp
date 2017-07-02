package com.andersen.sadwyn.randomusertest.presentation.presenter;

import com.arellomobile.mvp.ViewStateProvider;
import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.MvpViewState;

public class DetailPresenter$$ViewStateProvider extends ViewStateProvider {
	
	@Override
	public MvpViewState<? extends MvpView> getViewState() {
		return new com.andersen.sadwyn.randomusertest.presentation.view.DetailView$$State();
	}
}