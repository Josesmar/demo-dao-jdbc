package db;

public class DbIntegritiyException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public DbIntegritiyException(String msg) {
		super(msg);
	}

}
