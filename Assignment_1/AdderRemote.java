import java.rmi.*;
import java.rmi.server.*;

public class AdderRemote extends UnicastRemoteObject implements Adder {
	
	public AdderRemote() throws RemoteException {
		super();
	}
	
	public double add(double x, double y) {
		return x+y;
	}
	
}
