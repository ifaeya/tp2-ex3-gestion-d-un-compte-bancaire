import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    double lireSolde()throws RemoteException;
    String crediter(double x)throws RemoteException;
    String debiter(double x)throws RemoteException;
}
