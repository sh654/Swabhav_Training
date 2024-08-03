package com.techlabs.behavioural.command.model;

public class CloseFileCommand implements Command{

	private FileSystemReceiver fileSystem;
	
	
	
	public CloseFileCommand(FileSystemReceiver fileSystem) {
		super();
		this.fileSystem = fileSystem;
	}



	public void execute() {
		// TODO Auto-generated method stub
		this.fileSystem.closeFile();
	}

}
