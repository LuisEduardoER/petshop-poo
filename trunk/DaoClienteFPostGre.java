package Dao;

import hibernate.util.HibernateUtil;
import negocio.basica.ClienteF;

public class DaoClienteFPostGree implements IDaoClienteF{
	
	public void Incluir(ClienteF cf){
		HibernateUtil.getSession().save(cf);
		
		
		
	}
	
	public void Alterar(ClienteF cf){
		
		HibernateUtil.getSession().update(cf);
	}
	
	public void Excluir(int pessoa_Cod_pessoa){
		
	}

	
	
	
}
