package client;
import java.rmi.RemoteException;


import services.*;
import modelo.Transacao;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DashBoardUsuarioDAOProxy proxy = new DashBoardUsuarioDAOProxy();
		
		DashBoardUsuario u = new DashBoardUsuario("valeria", "123");
		System.out.println("nomeusuario = "+u.getNomeUsuario());
		System.out.println("senhausuario = "+u.getSenhaUsuario());
		
		try {
			int idusuario = proxy.buscarUsuario(u);
			System.out.println("Id do usuario = "+idusuario);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
