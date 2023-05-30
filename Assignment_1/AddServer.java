import java.rmi.*;
import java.net.*;

public class AddServer {

	public static void main(String args[]) {
		try {
			Adder stub = new AdderRemote();
			Naming.rebind("AddServer", stub);	//binds the remote object to the new name
		}
		catch (Exception e) {
			System.out.println("Exception : " + e);
		}
	}
	
}
