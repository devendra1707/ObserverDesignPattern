package com.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Subject channel = new YouTubeChannel();

//		Subscriber aman = new Subscriber("Aman");
//		channel.subscribe(aman);
		channel.newVideoUploaded("Video Title");

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("Press 1 to Upload Video");
			System.out.println("Press 2 to Create New Subscribe");
			System.out.println("Press 3 to Remove Subscribe");
			System.out.println("Press 4 to Exit");

			int c = Integer.parseInt(bufferedReader.readLine());

			if (c == 1) {
				// new Video Upload Code
				System.out.print("Enter Video Title : ");
				String videoTitle = bufferedReader.readLine();
				channel.newVideoUploaded(videoTitle);
			} else if (c == 2) {
				// Create new Subscribers

				System.out.print("Enter Name of Subscriber : ");
				String subscriber = bufferedReader.readLine();
				Subscriber subscriber2 = new Subscriber(subscriber);
				channel.subscribe(subscriber2);
			} else if (c == 3) {
				// Remove subscribe

			} else if (c == 4) {
				// exit code
				System.out.println("Thank for using ...");
				System.exit(0);
			} else {
				// Wrong Input
				System.out.println("Wrong Input");
			}

		}
	}
}
