package com.observer;

public interface Subject {

	void subscribe(Observer obj);

	void unSubscribe(Observer obj);

	void newVideoUploaded(String title);
}
