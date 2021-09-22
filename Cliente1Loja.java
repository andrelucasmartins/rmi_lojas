import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Cliente1Loja {

	public static void main (String args[]) {
		
		try {
			LojaRemota cliente_1 = (LojaRemota)Naming.lookup("rmi://192.168.0.12:2126/loja_1");
			LojaRemota cliente_1_loja2 = (LojaRemota)Naming.lookup("rmi://192.168.0.12:2126/loja_2");


			cliente_1.inserirProduto("Banana",10);
			cliente_1.inserirProduto("Maça",24);
			cliente_1.inserirProduto("Goiaba",5);

			cliente_1_loja2.inserirProduto("Mamão",40);
			cliente_1_loja2.inserirProduto("Maça",25);
			cliente_1_loja2.inserirProduto("Laranja",3);
			cliente_1_loja2.inserirProduto("Banana",8);

			// try {
			// 	cliente_1.alterarPreco("banana", 10);
			// } catch (Excecao e2) {
			// 	// TODO Auto-generated catch block
			// 	System.out.println(e2.getMessage());
			// }
			// try {
			// 	cliente_1.removerProduto("roupa");
				
			// } catch (Excecao e1) {
			// 	// TODO Auto-generated catch block
			// 	System.out.println(e1.getMessage());
			// }
			// try {
			// 	cliente_1.removerProduto("bala");
			// } catch (Excecao e1) {
			// 	// TODO Auto-generated catch block
			// 	System.out.println(e1.getMessage());
			// }
			
			try {
				System.out.println(cliente_1.procurarProduto("banana").getPreco());
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
