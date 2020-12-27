# tp2-ex3-gestion-d-un-compte-bancaire
import java.rmi.Naming;


public class Client {

    public static void main(String[] args) {
        try {
            MyInterface serv1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            serv1.crediter(700);
            serv1.debiter(300);
            System.out.println(serv1.lireSolde());

        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.toString());
        }
    }

}
