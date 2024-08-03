package model.techlabs.dip.solution;

public class DbLogger implements ILogger{
	

	@Override
	public void log(String err) {
		// TODO Auto-generated method stub
		System.out.println("Logged in Db: "+err);
	}
	
}
