package Dao;

import hibernate.util.HibernateUtil;
import negocio.basica.Pessoa;
import negocio.basica.Funcionario;

public class DaoPessoaPostGree implements IDaoPessoa {
	
	public void Incluir(Pessoa p){
		HibernateUtil.getSession().save(p);
	}
	
	public void Alterar(Pessoa p){
		HibernateUtil.getSession().update(p);
		
		
	}
	
	public void Excluir(int cod){
		
	}	

}
