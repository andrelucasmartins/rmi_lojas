import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Cliente3Loja {

	public static void main (String args[]) {
		
		try {
			LojaRemota loja_1 = (LojaRemota)Naming.lookup("rmi://192.168.0.12:2126/loja_1");
			LojaRemota loja_2 = (LojaRemota)Naming.lookup("rmi://192.168.0.12:2126/loja_2");

			loja_1.inserirProduto("Banana",10);
			loja_1.inserirProduto("Maça",24);
			loja_1.inserirProduto("Goiaba",5);

			loja_2.inserirProduto("Mamão",40);
			loja_2.inserirProduto("Maça",25);
			loja_2.inserirProduto("Laranja",3);
			loja_2.inserirProduto("Banana",8);

			try {
				loja_1.alterarPreco("banana", 10);
			} catch (Excecao e2) {
				// TODO Auto-generated catch block
				System.out.println(e2.getMessage());
			}
			try {
				loja_1.removerProduto("roupa");
				
			} catch (Excecao e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage());
			}
			try {
				loja_1.removerProduto("bala");
			} catch (Excecao e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage());
			}
			
			try {
				System.out.println(loja_1.procurarProduto("banana").getPreco());
				System.out.println(loja_2.procurarProduto("bala").getPreco());
			} catch (Excecao e) {
				System.out.println(e.getMessage());
			}
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
