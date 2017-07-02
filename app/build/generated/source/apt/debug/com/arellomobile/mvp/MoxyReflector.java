package com.arellomobile.mvp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoxyReflector {

	private static Map<Class<?>, Object> sViewStateProviders;
	private static Map<Class<?>, List<Object>> sPresenterBinders;
	private static Map<Class<?>, Object> sStrategies;

	static {
		sViewStateProviders = new HashMap<>();
		sViewStateProviders.put(com.andersen.sadwyn.randomusertest.presentation.presenter.DetailPresenter.class, new com.andersen.sadwyn.randomusertest.presentation.presenter.DetailPresenter$$ViewStateProvider());
		sViewStateProviders.put(com.andersen.sadwyn.randomusertest.presentation.presenter.MainPresenter.class, new com.andersen.sadwyn.randomusertest.presentation.presenter.MainPresenter$$ViewStateProvider());
		
		sPresenterBinders = new HashMap<>();
		sPresenterBinders.put(com.andersen.sadwyn.randomusertest.ui.activity.DetailActivity.class, Arrays.<Object>asList(new com.andersen.sadwyn.randomusertest.ui.activity.DetailActivity$$PresentersBinder()));
		sPresenterBinders.put(com.andersen.sadwyn.randomusertest.ui.activity.MainActivity.class, Arrays.<Object>asList(new com.andersen.sadwyn.randomusertest.ui.activity.MainActivity$$PresentersBinder()));
		
		sStrategies = new HashMap<>();
		sStrategies.put(com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class, new com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy());
	}
	
	public static Object getViewState(Class<?> presenterClass) {
		ViewStateProvider viewStateProvider = (ViewStateProvider) sViewStateProviders.get(presenterClass);
		if (viewStateProvider == null) {
			return null;
		}
		
		return viewStateProvider.getViewState();
	}

	public static List<Object> getPresenterBinders(Class<?> delegated) {
		return sPresenterBinders.get(delegated);
	}

	public static Object getStrategy(Class<?> strategyClass) {
		return sStrategies.get(strategyClass);
	}
}
