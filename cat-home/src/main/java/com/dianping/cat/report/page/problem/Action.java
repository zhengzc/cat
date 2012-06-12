package com.dianping.cat.report.page.problem;

public enum Action implements com.site.web.mvc.Action {
	ALL("all"),

	GROUP("group"),

	THREAD("thread"),

	DETAIL("detail"),

	MOBILE("mobile"), 
	
	HISTORY("history"),
	
	HISTORY_GRAPH("historyGraph");

	private String m_name;

	private Action(String name) {
		m_name = name;
	}

	public static Action getByName(String name, Action defaultAction) {
		for (Action action : Action.values()) {
			if (action.getName().equals(name)) {
				return action;
			}
		}

		return defaultAction;
	}

	@Override
	public String getName() {
		return m_name;
	}
}
