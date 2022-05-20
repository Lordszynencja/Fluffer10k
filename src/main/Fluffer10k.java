package main;

import java.io.IOException;

import bot.Fluffer10kFun;
import bot.main.Fluffer10kImages;

public class Fluffer10k {

	public final Fluffer10kImages fluffer10kImages;
	public final Fluffer10kFun fluffer10kFun;

	public Fluffer10k() throws IOException {
		fluffer10kImages = new Fluffer10kImages();
		fluffer10kFun = new Fluffer10kFun();
	}

	public static void main(final String[] args) {
		try {
			new Fluffer10k();
		} catch (final Exception e) {
			try {
				Thread.sleep(10_000);
			} catch (final InterruptedException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
			System.exit(0);
		}
	}

}
