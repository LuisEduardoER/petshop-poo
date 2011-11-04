package Controles;

import hibernate.util.HibernateUtil;
import negocio.basica.ClienteF;
import Dao.DaoClienteFPostGree;
import Dao.IDaoClienteF;


public class ControladorClienteF {

private IDaoClienteF daoClienteF;
private static ControladorClienteF Instance;
	
	public ControladorClienteF(){
		daoClienteF = new DaoClienteFPostGree();
		
	}
	
	public static ControladorClienteF GetControladorClienteF(){
        if (Instance==null)
     	   Instance =  new ControladorClienteF();
        return Instance;
		
	} 	
	
	
	public void Incluir(ClienteF CF){
		
		HibernateUtil.beginTransaction();

		daoClienteF.Incluir(CF);
		
		HibernateUtil.commitTransaction();
		
		
		
	}
	
	public void Alterar(ClienteF CF){
		
		HibernateUtil.beginTransaction();
		daoClienteF.Alterar(CF);
		HibernateUtil.commitTransaction();

		
	}
	
	
	public void Excluir(int pessoa_Cod_pessoa){
		
		
	}
	
}
