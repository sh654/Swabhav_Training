package com.techlabs.behavioural.command.model;

public class OpenFileCommand implements Command{

	private FileSystemReceiver fileSystem;
	
	public OpenFileCommand(FileSystemReceiver fs) {
		this.fileSystem = fs;
	}
	
	
	public void execute() {
		// TODO Auto-generated method stub
		this.fileSystem.openFile();
	}

}
