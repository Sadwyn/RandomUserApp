package com.andersen.sadwyn.randomusertest.ui.activity;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class MainActivity$$PresentersBinder extends PresenterBinder<com.andersen.sadwyn.randomusertest.ui.activity.MainActivity> {
	public class mMainPresenterBinder extends PresenterField<com.andersen.sadwyn.randomusertest.ui.activity.MainActivity> {
		public mMainPresenterBinder() {
			super("mMainPresenter", PresenterType.LOCAL, null, com.andersen.sadwyn.randomusertest.presentation.presenter.MainPresenter.class);
		}

		@Override
		public void bind(com.andersen.sadwyn.randomusertest.ui.activity.MainActivity target, MvpPresenter presenter) {
			target.mMainPresenter = (com.andersen.sadwyn.randomusertest.presentation.presenter.MainPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(com.andersen.sadwyn.randomusertest.ui.activity.MainActivity delegated) {
			return new com.andersen.sadwyn.randomusertest.presentation.presenter.MainPresenter();
		}
	}

	public List<PresenterField<com.andersen.sadwyn.randomusertest.ui.activity.MainActivity>> getPresenterFields() {
		List<PresenterField<com.andersen.sadwyn.randomusertest.ui.activity.MainActivity>> presenters = new ArrayList<>();

		presenters.add(new mMainPresenterBinder());

		return presenters;
	}

}
