package Dao;

import hibernate.util.HibernateUtil;
import negocio.basica.ClienteJ;

public class DaoClienteJPostGree implements IDaoClienteJ{
	
	public void Incluir(ClienteJ cj){
		HibernateUtil.getSession().save(cj);
		
		
		
	}
	
	public void Alterar(ClienteJ cj){
		
		HibernateUtil.getSession().update(cj);
	}
	
	public void Excluir(int pessoa_Cod_pessoa){
		
	}

	
	
	
}