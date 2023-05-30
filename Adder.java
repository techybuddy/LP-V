import java.rmi.*;

public interface Adder extends Remote {
	
	double add(double x, double y) throws RemoteException;
	
}
