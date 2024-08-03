package model.techlabs.dip.solution;

public class FileLogger implements ILogger{

	@Override
	public void log(String err) {
		// TODO Auto-generated method stub
		System.out.println("File logged error"+err);
	}

}
