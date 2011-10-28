package Controles;

import hibernate.util.HibernateUtil;
import negocio.basica.Pessoa;
import Dao.DaoFuncionarioPostGree;
import Dao.DaoPessoaPostGree;
import Dao.IDaoFuncionario;
import Dao.IDaoPessoa;
import negocio.basica.Funcionario;

public class ControladorPessoa {

	private IDaoPessoa daoPessoa;
	
	public ControladorPessoa(){
		daoPessoa = new DaoPessoaPostGree();
		
	}
	
	public void Incluir(Pessoa P,Funcionario F){
		
		HibernateUtil.beginTransaction();

		daoPessoa.Incluir(P);

		ControladorFuncionario Controlf = null;
		
		Controlf = new ControladorFuncionario();
		Controlf.Incluir(F);
		
		
		HibernateUtil.commitTransaction();
		
		
		
	}
	
	public void Alterar(Pessoa P, Funcionario F){
		
		HibernateUtil.beginTransaction();
		daoPessoa.Alterar(P);
	
		ControladorFuncionario ControlF3 = new ControladorFuncionario();
        ControlF3.Alterar(F);
		
		
		HibernateUtil.commitTransaction();

		
	}
	
	
	public void Excluir(int Cod){
		
		
	}
	
	
}
