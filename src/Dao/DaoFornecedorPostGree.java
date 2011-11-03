package Dao;

import hibernate.util.HibernateUtil;
import negocio.basica.Fornecedor;

public class DaoFornecedorPostGree implements IDaoFornecedor{
	
	public void Incluir(Fornecedor f){
		HibernateUtil.getSession().save(f);
		
		
		
	}
	
	public void Alterar(Fornecedor f){
		
		HibernateUtil.getSession().update(f);
		
	}
	
	public void Excluir(int cod){
		
	}

	
	
	
}