package proxy;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		DatabaseExecuter adminExecuter = new DatabaseExecuterProxy("Admin", "Admin@123");
		adminExecuter.executeDatabase("DELETE");
		
		DatabaseExecuter nonAdminExecuter = new DatabaseExecuterProxy("NonAdmin", "Admin@123");
		nonAdminExecuter.executeDatabase("DELETE");

	}

}
