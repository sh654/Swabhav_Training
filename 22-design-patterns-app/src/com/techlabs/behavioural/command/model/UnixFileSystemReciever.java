package com.techlabs.behavioural.command.model;

public class UnixFileSystemReciever implements FileSystemReceiver {

	@Override
	public void openFile() {
		// TODO Auto-generated method stub
		System.out.println("Opening File in unix os");
	}

	@Override
	public void writeFile() {
		// TODO Auto-generated method stub
		System.out.println("Writing file in unix os");
	}

	@Override
	public void closeFile() {
		// TODO Auto-generated method stub
		System.out.println("Closing File in unix");
	}

}
