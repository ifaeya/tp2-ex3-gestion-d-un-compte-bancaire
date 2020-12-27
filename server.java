# tp2-ex3-gestion-d-un-compte-bancaire
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class serveur extends UnicastRemoteObject implements MyInterface {

    public Serveur () throws RemoteException {}
    private double s;

    public String debiter(double x){
        if (s==0)
        {
            return "il' n'y a plus de solde ";
        }
        else {
            s-=x;
            return "le solde est debité";
        }
    }
    public String crediter (double x) {
        s+=x;
        return "le solde est credité";
    }
    public double lireSolde()
    {
        return s;
    }
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Serveur serveur = new Serveur();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
}
