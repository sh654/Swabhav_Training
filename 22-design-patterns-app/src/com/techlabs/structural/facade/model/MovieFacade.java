package com.techlabs.structural.facade.model;

public class MovieFacade extends DvdPlayer{

	public void watchMovie() {
		
		DvdPlayer movie = new DvdPlayer();
		movie.on();
		movie.SetMovie(null);
		
	}
	
}
