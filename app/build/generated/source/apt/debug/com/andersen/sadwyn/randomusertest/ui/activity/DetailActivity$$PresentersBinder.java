package com.andersen.sadwyn.randomusertest.ui.activity;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class DetailActivity$$PresentersBinder extends PresenterBinder<com.andersen.sadwyn.randomusertest.ui.activity.DetailActivity> {
	public class mDetailPresenterBinder extends PresenterField<com.andersen.sadwyn.randomusertest.ui.activity.DetailActivity> {
		public mDetailPresenterBinder() {
			super("mDetailPresenter", PresenterType.LOCAL, null, com.andersen.sadwyn.randomusertest.presentation.presenter.DetailPresenter.class);
		}

		@Override
		public void bind(com.andersen.sadwyn.randomusertest.ui.activity.DetailActivity target, MvpPresenter presenter) {
			target.mDetailPresenter = (com.andersen.sadwyn.randomusertest.presentation.presenter.DetailPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(com.andersen.sadwyn.randomusertest.ui.activity.DetailActivity delegated) {
			return new com.andersen.sadwyn.randomusertest.presentation.presenter.DetailPresenter();
		}
	}

	public List<PresenterField<com.andersen.sadwyn.randomusertest.ui.activity.DetailActivity>> getPresenterFields() {
		List<PresenterField<com.andersen.sadwyn.randomusertest.ui.activity.DetailActivity>> presenters = new ArrayList<>();

		presenters.add(new mDetailPresenterBinder());

		return presenters;
	}

}
