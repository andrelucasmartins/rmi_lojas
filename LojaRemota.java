import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LojaRemota extends Remote {

	public void inserirProduto(String nome, int preco) throws RemoteException; 
	
	public void removerProduto(String nome) throws RemoteException, Excecao;
	
	public Produto procurarProduto (String nome) throws RemoteException, Excecao;
	
	public void alterarPreco (String nome, int valor) throws RemoteException, Excecao;
}
