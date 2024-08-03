package com.techlabs.behavioural.command.model;

public class WindowsFileSystemReceiver implements FileSystemReceiver{

	@Override
	public void openFile() {
		// TODO Auto-generated method stub
		System.out.println("Opening File in Windows");
	}

	@Override
	public void writeFile() {
		// TODO Auto-generated method stub
		System.out.println("Writing File in Windows");
	}

	@Override
	public void closeFile() {
		// TODO Auto-generated method stub
		System.out.println("Closing File in Windows");
	}

}
