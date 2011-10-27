package Dao;

import hibernate.util.HibernateUtil;
import negocio.basica.Funcionario;

public class DaoFuncionarioPostGree implements IDaoFuncionario{
	
	public void Incluir(Funcionario f){
		HibernateUtil.getSession().save(f);
		
		
		
	}
	
	public void Alterar(Funcionario f){
		
		HibernateUtil.getSession().update(f);
		
	}
	
	public void Excluir(int cod){
		
	}

	
	
	
}
