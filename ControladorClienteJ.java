package Controles;

import hibernate.util.HibernateUtil;
import negocio.basica.ClienteJ;
import Dao.DaoClienteJPostGree;
import Dao.IDaoClienteJ;


public class ControladorClienteJ {

private IDaoClienteJ daoClienteJ;
private static ControladorClienteJ Instance;
	
	public ControladorClienteJ(){
		daoClienteJ = new DaoClienteJPostGree();
		
	}
	
	public static ControladorClienteJ GetControladorClienteJ(){
        if (Instance==null)
     	   Instance =  new ControladorClienteJ();
        return Instance;
		
	} 	
	
	public void Incluir(ClienteJ CJ){
		
		HibernateUtil.beginTransaction();

		daoClienteJ.Incluir(CJ);
		
		HibernateUtil.commitTransaction();
		
		
		
	}
	
	public void Alterar(ClienteJ CJ){
		
		HibernateUtil.beginTransaction();
		daoClienteJ.Alterar(CJ);
		HibernateUtil.commitTransaction();

		
	}
	
	
	public void Excluir(int pessoa_Cod_pessoa){
		
		
	}
	
}

