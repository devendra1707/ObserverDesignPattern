package com.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {

	List<Observer> subscribers = new ArrayList<>();

	@Override
	public void subscribe(Observer obj) {
		subscribers.add(obj);
	}

	@Override
	public void unSubscribe(Observer obj) {
		subscribers.remove(obj);
	}

	@Override
	public void newVideoUploaded(String title) {

		for (Observer obj : this.subscribers) {
			obj.notified(title);
		}

	}

}
