package com.techlabs.structural.facade.model;

public class SoundSystem {

	private String volumeLevel;
	
	public void on() {
		System.out.println("Sound System on");
	}
	
	public String setVolume(String volumeLevel) {
		return "Level is set";
	}
	
}
