package Controles;

import hibernate.util.HibernateUtil;
import negocio.basica.Pessoa;
import Dao.DaoFuncionarioPostGree;
import Dao.DaoPessoaPostGree;
import Dao.IDaoFuncionario;
import Dao.IDaoPessoa;

public class ControladorPessoa {

	private IDaoPessoa daoPessoa;
	
	public ControladorPessoa(){
		daoPessoa = new DaoPessoaPostGree();
		
	}
	
	public void Incluir(Pessoa P){
		
		HibernateUtil.beginTransaction();

		daoPessoa.Incluir(P);
		
		HibernateUtil.commitTransaction();
		
		
		
	}
	
	public void Alterar(Pessoa P){
		
		HibernateUtil.beginTransaction();
		daoPessoa.Alterar(P);
		HibernateUtil.commitTransaction();

		
	}
	
	
	public void Excluir(int Cod){
		
		
	}
	
	
}
